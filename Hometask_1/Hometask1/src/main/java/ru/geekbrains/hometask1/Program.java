package ru.geekbrains.hometask1;

import ru.geekbrains.hometask1.InMemoryModel.ModelStore;
import ru.geekbrains.hometask1.InMemoryModel.Observer1;
import ru.geekbrains.hometask1.ModelElements.Polygon;
import ru.geekbrains.hometask1.ModelElements.PolygonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);

        Polygon p1 = new Polygon();
        List<Polygon> polygons = new ArrayList<>();
        polygons.add(p1);
        PolygonalModel polygonalModel = new PolygonalModel(polygons);
        store.add(polygonalModel);
    }
    
}