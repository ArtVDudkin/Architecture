using ClinicService.Controllers;
using ClinicService.Models;
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
            // [1.1] Подготовка данных

            // [1.2] 
            List<Client> clients = new List<Client>();
            clients.Add(new Client());
            clients.Add(new Client());
            clients.Add(new Client());
            _mockClientRepository.Setup(repository => repository.GetAll()).Returns(clients);

            // [2] Исполнение тестируемого метода
            var operationResult = _clientController.GetAll();

            // [3] Подготовка эталонного результата и его сравнение
            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<List<Client>>(((OkObjectResult)operationResult.Result).Value);

            _mockClientRepository.Verify(repository => repository.GetAll(), Times.AtLeastOnce);
        }

    }
}