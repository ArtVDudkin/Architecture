package ru.geekbrains.hometask1.ModelElements;

public class Texture {

    private String name;
    private String url;

    public Texture(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }
    public void editName(String name) {
        this.name = name;
    }

    public void editTexture(String url) {
        this.url = url;
    }

    // ToDo по хорошему здесь должна возвращаться картинка вместо ссылки на нее...
    public String getTexture() {
        return this.url;
    }

}
