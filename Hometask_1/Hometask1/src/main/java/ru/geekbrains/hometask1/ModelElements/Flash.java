package ru.geekbrains.hometask1.ModelElements;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation(){
        return this.location;
    }

    public Angle3D getAngle() {
        return this.angle;
    }

    public Color getColor() {
        return this.color;
    }

    public Float getPower() {
        return this.power;
    }

    public void move(Point3D location) {
        this.location = location;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPower(Float power) {
        this.power = power;
    }

}
