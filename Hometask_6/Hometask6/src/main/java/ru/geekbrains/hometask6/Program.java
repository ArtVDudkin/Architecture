package ru.geekbrains.hometask6;

import ru.geekbrains.hometask6.database.NotesDatabase;
import ru.geekbrains.hometask6.notes.core.app.ConcreteNoteEditor;
import ru.geekbrains.hometask6.notes.core.domain.Note;
import ru.geekbrains.hometask6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.hometask6.notes.presentation.queries.conrollers.NotesController;
import ru.geekbrains.hometask6.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();

        System.out.println("----add new note----");
        controller.routeAddNote(new Note(1012,11,"12","12",new Date()));
        controller.routeGetAll();
    }

}
