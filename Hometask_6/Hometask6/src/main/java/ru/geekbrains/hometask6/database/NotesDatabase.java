package ru.geekbrains.hometask6.database;

import ru.geekbrains.hometask6.notes.infrastructure.persistance.IDatabase;

public class NotesDatabase implements IDatabase {

    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null)
            notesTable = new NotesTable();
        return notesTable;
    }

}
