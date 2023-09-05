package ru.geekbrains.hometask2;

import java.util.ArrayDeque;
import java.util.Deque;

public class CaretakerHistory {

    private Deque<MementoDoc> history;
    private int currentIndex;

    public CaretakerHistory() {
        history = new ArrayDeque<>();
        this.currentIndex = -1;           // -1  = очередь пуста, иначе соответствует индексу элемента
    }

    /*
     * Метод позволяет перемещаться между элементами в очереди состояний документа (history)
     * Если value = 1, перемещаемся вперед к следующему элементу
     * Если value = -1, перемещаемся назад к предыдущему элементу
     */
    public void changeIndex(int value) {
        this.currentIndex += value;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    /*
     * Метод добавляет новое состояние memento в конец очереди истории изменения состояний
     */
    public void addLast(MementoDoc memento) {
        System.out.println("Сохранение документа");
        history.addLast(memento);
        changeIndex(1);
        while (history.size() != this.currentIndex + 1) {
            history.pollFirst();
        }
    }

    public MementoDoc undo() {
        System.out.println("Отмена последнего действия");
        history.addFirst(history.pollLast());
        changeIndex(-1);
        return history.getLast();
    }

    public MementoDoc redo() {
        System.out.println("Возврат последнего действия");
        history.addLast(history.pollFirst());
        changeIndex(1);
        return history.getLast();
    }

    public int size() {
        return history.size();
    }

}
