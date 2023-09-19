package ru.geekbrains.hometask6.notes.presentation.queries.conrollers;

import ru.geekbrains.hometask6.notes.presentation.queries.views.IPresenter;

public abstract class Controller {

    public <T extends IPresenter> void view(T presenter){}

}
