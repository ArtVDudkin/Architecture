package ru.geekbrains.hometask1.ModelElements;

public class Angle3D {

    // углы в 3D принимаем согласно модели Z-X-Y Intrinsic, как описано в статье
    // https://habr.com/ru/companies/unigine/articles/672930/

    private int yawZ;       // азимут 0-360 градусов в горизонтальной плоскости
    private int pitchX;     // угол закидывания камеры вертикально (обычно ограничен градусами между -89 и +89)
    private int rollY;      // крен камеры вокруг собственной оси (подумать, нужен ли?)

    public Angle3D(int yawZ, int pitchX, int rollY) {
        this.yawZ = yawZ % 360;         // азимут, если введенное значение угла больше 360
        this.pitchX = pitchX % 90;      // наклон, ограничен градусами между -90 и +90
        this.rollY = rollY % 360;       // крен вокруг своей оси, если введенное значение угла больше 360
    }

    public void setAngle3D(int yawZ, int pitchX, int rollY) {
        this.yawZ = yawZ % 360;
        this.pitchX = pitchX % 90;
        this.rollY = rollY % 360;
    }

    public int getYawZ() {
        return this.yawZ;
    }

    public void setYawZ(int yawZ) {
        this.yawZ = yawZ % 360;
    }

    public int getPitchX() {
        return this.pitchX;
    }

    public void setPitchX(int pitchX) {
        this.pitchX = pitchX % 90;
    }

    public int getRollY() {
        return this.rollY;
    }

    public void setRollY(int rollY) {
        this.rollY = rollY % 360;
    }

}
