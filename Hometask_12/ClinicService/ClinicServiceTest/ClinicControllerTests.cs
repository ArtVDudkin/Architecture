using ClinicService.Controllers;
using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;

namespace ClinicServiceTests
{
    public class ClientControllerTests
    {
        private ClientController _clientController;
        private Mock<IClientRepository> _mockClientRepository;

        public ClientControllerTests()
        {
            _mockClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mockClientRepository.Object);
        }

        public void GetAllClientsTest()
        {
            // [1.1] ���������� ������

            // [1.2] 
            List<Client> clients = new List<Client>();
            clients.Add(new Client());
            clients.Add(new Client());
            clients.Add(new Client());
            _mockClientRepository.Setup(repository => repository.GetAll()).Returns(clients);

            // [2] ���������� ������������ ������
            var operationResult = _clientController.GetAll();

            // [3] ���������� ���������� ���������� � ��� ��������� c ����������:
            // - �������� ��������� ��,
            // - � �������� ��������� �������� ������ ��������,
            // - � ����������� ��������� ���� �� ��� ����� GetAll
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<List<Client>>(((OkObjectResult)operationResult.Result).Value);

            _mockClientRepository.Verify(repository => repository.GetAll(), Times.AtLeastOnce);
        }

        public static readonly object[][] CorrectCreateClientDate =
        {
            new object[] { new DateTime(1990, 10, 20), "1111 123456", "������", "����", "��������"},
            new object[] { new DateTime(1991, 11, 21), "2222 123456", "������", "����", "��������"},
            new object[] { new DateTime(1992, 12, 22), "3333 123456", "�������", "������", "���������"}
        };

        [Theory]
        [MemberData(nameof(CorrectCreateClientDate))]
        public void CreateClientTest(DateTime birthday, string document, string surName, string firstName, string patronymic)
        {
            // [1.1] ���������� ������
            _mockClientRepository.Setup(repository => repository.Create(It.IsNotNull<Client>())).Returns(1).Verifiable();

            // [2] ���������� ������������ ������
            var operationResult = _clientController.Create(new CreateClientRequest
            {
                Birthday = birthday,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic
            });

            // [3] ���������� ���������� ���������� � ��� ��������� c ����������:
            // - �������� ��������� ��,
            // - � �������� ��������� �������� ������ ��������,
            // - � ����������� ��������� ���� �� ��� ����� GetAll
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);
            _mockClientRepository.Verify(repository => repository.Create(It.IsNotNull<Client>()), Times.AtLeastOnce);
        }

    }
}