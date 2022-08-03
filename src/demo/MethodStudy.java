package demo;

public class MethodStudy {
    public static void main(String[] args) {
        if(isPrime(5)){
            System.out.println("là số nguyên tố");
        }
        else {
            System.out.println("không là số nguyên tố");
        }
        int [] arr={1,2,3,4,5,6,7,8,9};
        int countPrime=0;
        for (int i = 0; i <arr.length ; i++) {
            if(isPrime(i)){
                countPrime++;
            }
        }
        System.out.println(countPrime);
    }

public static boolean isPrime(int n){
    if(n<2){
        return false;
    }
    for (int i = 2; i <Math.sqrt(n) ; i++) {
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}