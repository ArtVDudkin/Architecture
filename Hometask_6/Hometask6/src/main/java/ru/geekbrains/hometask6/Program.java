package ru.geekbrains.hometask6;

import ru.geekbrains.hometask6.database.NotesDatabase;
import ru.geekbrains.hometask6.notes.core.app.ConcreteNoteEditor;
import ru.geekbrains.hometask6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.hometask6.notes.presentation.queries.conrollers.NotesController;
import ru.geekbrains.hometask6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();

    }

}
