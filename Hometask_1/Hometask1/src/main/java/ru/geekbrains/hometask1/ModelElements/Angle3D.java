package ru.geekbrains.hometask1.ModelElements;

public class Angle3D {

    private int degreeX;
    private int degreeY;
    private int degreeZ;

    public Angle3D(int x, int y, int z) {
        this.degreeX = x % 360;         // На случай если введенное значение угла больше 360
        this.degreeY = y % 360;
        this.degreeZ = z % 360;
    }

    public void setAngle3D(int x, int y, int z) {
        this.degreeX = x % 360;
        this.degreeY = y % 360;
        this.degreeZ = z % 360;
    }

    public int getX() {
        return this.degreeX;
    }

    public void setX(int x) {
        this.degreeX = x % 360;
    }

    public int getY() {
        return this.degreeY;
    }

    public void setY(int y) {
        this.degreeY = y % 360;
    }

    public int getZ() {
        return this.degreeZ;
    }

    public void setZ(int z) {
        this.degreeZ = z % 360;
    }

}
