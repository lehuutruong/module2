package ss4_class_object.exercise.stop_watch;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.Start());
        int [] array= new int[1000];
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)Math.floor(Math.random()*100000);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(stopWatch.Stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
