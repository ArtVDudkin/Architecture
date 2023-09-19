package ru.geekbrains.hometask6.notes.presentation.queries.views;

import ru.geekbrains.hometask6.notes.core.app.interfaces.INotesPresenter;
import ru.geekbrains.hometask6.notes.core.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements INotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note: notes) {
            System.out.println(note);
        }
    }

}
