package ru.geekbrains.hometask1.ModelElements;

public class Camera {

    private Point3D location;
    private Angle3D angle;

    public Camera() {
    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation(){
        return this.location;
    }

    public Angle3D getAngle() {
        return this.angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

}
