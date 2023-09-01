package ru.geekbrains.hometask1.ModelElements;

public class Texture {

    private int id;

    /// <summary>
    /// Наименование
    /// </summary>
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Texture(String name) {
        this.name = name;
    }
}
