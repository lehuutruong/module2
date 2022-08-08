package ss6_inheritance.exercise.point_moveablepoint.main;

import ss6_inheritance.exercise.point_moveablepoint.model.MovablePoint;

public class MainMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint =new MovablePoint(2,3,4,5);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
