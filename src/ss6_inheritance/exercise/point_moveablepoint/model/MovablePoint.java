package ss6_inheritance.exercise.point_moveablepoint.model;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private  float ySpeed=0.0f;
    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(){

    }
    public void getSpeed(){
        float [] newArray=new float[]{this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
       return String.format("(%.2f,%.2f),speed=(%.2f,%.2f)",getX(),getY(),xSpeed,ySpeed);
    }
    public MovablePoint move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return this;
    }
}
