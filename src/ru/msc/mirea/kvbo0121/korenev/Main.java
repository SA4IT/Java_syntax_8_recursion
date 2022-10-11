package ru.msc.mirea.kvbo0121.korenev;

public class Main {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return recursion(n - 1) * n;
    }
    public static int recursion2(int k){
        if(k == 1){
            return 1;
        }
        System.out.println(k);
        return recursion2(k-1)  ;
    }
    public static int recursion3(int A1,int B1){
        if (A1 == B1){
            return B1;
        }
        System.out.println(A1);
        return recursion3(A1+1,B1);
    }
    public static int recursion5(int A){
        if(A<10){
            return A;
        }
        return A%10 + recursion5(A/10);
    }
    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(" ");
        System.out.println(recursion2(10));
        System.out.println(" ");
        int A = 1;
        int B = 6;
        System.out.println(recursion3(A,B));
        System.out.println(" ");
        System.out.println(recursion5(3553));
    }
}
