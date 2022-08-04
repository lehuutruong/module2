package ss4_class_object.exercise.fan;

public class Fan {
    private int speed;
    private double radius;
    private String color;
    private boolean on;

    public Fan() {
        this.speed = 1;
        this.color = "blue";
        this.on = false;
        this.radius = 5;
    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String speedString;
        if (this.speed == 1) {
            speedString = "Slow";
        } else if (this.speed == 2) {
            speedString = "Medium";
        } else {
            speedString = "fast";
        }
        if (this.on) {
            return String.format("Tốc độ quạt là: " + this.speed + "\t" + " Màu: " + this.color + "\t" + " Bán kính: " + "\t" + radius + "\t" + "Quạt đang bật");
        } else {
            return String.format("Tốc độ quạt là: " + this.speed + "\t" + " Màu: " + this.color + "\t" + "Bán kính: " + "\t" + radius + "\t" + "Quạt đang tắt");
        }
    }
}
