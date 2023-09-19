package ru.geekbrains.hometask6.notes.core.app.interfaces;

import ru.geekbrains.hometask6.notes.core.domain.Note;

public interface INoteEditor extends IEditor<Note, Integer> {

    void printAll();

}
