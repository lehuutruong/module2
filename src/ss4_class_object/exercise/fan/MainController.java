package ss4_class_object.exercise.fan;
public class MainController {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(2);
        fan1.setRadius(3.0);
        fan1.setColor("xanh");
        fan1.setOn(false);

        Fan fan2 = new Fan();
        fan2.setSpeed(1);
        fan2.setRadius(4.0);
        fan2.setColor("vàng");
        fan2.setOn(true);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
