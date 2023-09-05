package ru.geekbrains.hometask2;

public class OriginatorDoc {

    private String text = "";   // текст документа

    public void append(String text) {
        this.text += text;
        System.out.printf("Добавлен блок: %s\n", text);
    }

    public void print() {
        System.out.printf("Актуальное содержимое текста: %s\n", this.text);
    }

    public MementoDoc saveState() {
        return new MementoDoc(text);
    }

    public void restoreState(MementoDoc memento) {
        this.text = memento.getText();
    }

}
