package ss13_search_algorithm.exercise.search_algorithm_using_recursion.model;

public class BinarySearch {
    public static int binarySearch(int [] array, int left, int right, int value){
        if(right>=left){
            int mid=(left+right)/2;
        if(value== array[mid]){
            return mid;
        }
            if(value>array[mid]){
                return binarySearch(array,mid+1,right,value);
            }
            return binarySearch(array,left,mid-1,value);
    }
        return -1;
    }
}
