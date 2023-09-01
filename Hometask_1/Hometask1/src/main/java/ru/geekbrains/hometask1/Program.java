package ru.geekbrains.hometask1;

import ru.geekbrains.hometask1.InMemoryModel.ModelStore;
import ru.geekbrains.hometask1.InMemoryModel.Observer1;
import ru.geekbrains.hometask1.ModelElements.Poligon;
import ru.geekbrains.hometask1.ModelElements.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add(poligonalModel);
    }
    
}