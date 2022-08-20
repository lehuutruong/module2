package ss15_exception_debug.exerise.using_illegaltriangle_exception.service.impl;

import javafx.scene.chart.ScatterChart;
import ss15_exception_debug.exerise.using_illegaltriangle_exception.model.SidesOfTheTriangle;
import ss15_exception_debug.exerise.using_illegaltriangle_exception.service.ITriangleService;
import ss15_exception_debug.exerise.using_illegaltriangle_exception.service.untils.PointException;
import ss6_inheritance.exercise.point_moveablepoint.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleService implements ITriangleService {
    Scanner scanner = new Scanner(System.in);
    private List<SidesOfTheTriangle> triangleServices = new ArrayList<>();

    @Override
    public void addSidesOfTriangle() {
        SidesOfTheTriangle triangle = getInfo();
        triangleServices.add(triangle);
    }

    @Override
    public void displaySidesOfTriangle() {
        show(triangleServices);
    }

    private void show(List<SidesOfTheTriangle> triangleServices) {
        for (SidesOfTheTriangle item : triangleServices
        ) {
            System.out.println(item);

        }
    }
    public SidesOfTheTriangle getInfo(){
        SidesOfTheTriangle sidesOfTheTriangle=new SidesOfTheTriangle();
        while (true){
           try {
               System.out.println("Mời bạn nhập vào số cạnh tam giác");
               System.out.print("Nhập a=");
           double a=Double.parseDouble(scanner.nextLine());
               System.out.print("Nhập b=");
               double b=Double.parseDouble(scanner.nextLine());
               System.out.print("Nhập c=");
               double c=Double.parseDouble(scanner.nextLine());
               if(a<0||b<0||c<0||a+b<c||a+c<b||b+c<a){
                   throw  new PointException("nhập sai rồi");
               }
               sidesOfTheTriangle=new SidesOfTheTriangle(a,b,c);
               break;
           }catch (PointException e){
               System.out.println(e.getMessage());
           }
        }
        return sidesOfTheTriangle;
    }
}

