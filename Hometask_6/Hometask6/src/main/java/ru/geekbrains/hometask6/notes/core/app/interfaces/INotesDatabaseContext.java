package ru.geekbrains.hometask6.notes.core.app.interfaces;

import ru.geekbrains.hometask6.notes.core.domain.Note;

import java.util.Collection;

public interface INotesDatabaseContext {

    Collection<Note> getAll();

    boolean saveChanges();

}
