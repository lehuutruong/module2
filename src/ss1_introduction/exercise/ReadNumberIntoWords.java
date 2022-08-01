package ss1_introduction.exercise;

import javax.swing.*;
import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.print("mời bạn nhập vào số: ");
        value = Integer.parseInt(scanner.nextLine());
        String hundreds = "";
        String dozens = "";
        String unit = "";
//        switch (s) {
//            case 1:
//               System.out.print("một");
//                break;
//            case 2:
//                System.out.print("hai");
//
//                break;
//            case 3:
//                System.out.print("ba");
//
//                break;
//            case 4:
//                System.out.print("bốn");
//
//                break;
//            case 5:
//                System.out.print("năm");
//
//                break;
//            case 6:
//                System.out.print("sáu");
//
//                break;
//            case 7:
//                System.out.print("bảy");
//
//                break;
//            case 8:
//                System.out.print("tám");
//
//                break;
//            case 9:
//                System.out.print("chín");
//
//                break;
//        }
//
        switch ((value / 10) % 10) {
            case 1:
                dozens = " mười";
                break;
            case 2:
                dozens = " hai mươi";
                break;
            case 3:
                dozens = " ba mươi";
                break;
            case 4:
                dozens = " bốn mươi";
                break;
            case 5:
                dozens = " năm mươi";
                break;
            case 6:
                dozens = " sáu mươi";
                break;
            case 7:
                dozens = " bảy mươi";
                break;
            case 8:
                dozens = " tám mươi";
                break;
            case 9:
                dozens = " chín mươi";
                break;

        }
        switch (value / 100) {
            case 1:
                hundreds = " một trăm";
                break;
            case 2:
                hundreds = " hai trăm";
                break;
            case 3:
                hundreds = " ba trăm";
                break;
            case 4:
                hundreds = " bốn trăm";
                break;
            case 5:
                hundreds = " năm trăm";
                break;
            case 6:
                hundreds = " sáu trăm";
                break;
            case 7:
                hundreds = " bảy trăm";
                break;
            case 8:
                hundreds = " tám trăm";
                break;
            case 9:
                hundreds = " chín trăm";
                break;

        }
        switch (value % 10) {
            case 1:
                unit = " mốt ";
                break;
            case 2:
                unit = " hai ";
                break;
            case 3:
                unit = " ba ";
                break;
            case 4:
                unit = " bốn ";
                break;
            case 5:
                unit = " lăm ";
                break;
            case 6:
                unit = " sáu ";
                break;
            case 7:
                unit = " bảy ";
                break;
            case 8:
                unit = " tám ";
                break;
            case 9:
                unit = " chín ";
                break;

        }
        System.out.print(hundreds + dozens + unit);
    }

}
