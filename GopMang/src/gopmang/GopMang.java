package gopmang;

import java.util.Scanner;

public class GopMang {

    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a1["+i+"]: ");
            a1[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a2["+i+"]: ");
            a2[i]=sc.nextInt();
        }
        int[] a3 = new int[10];
        for (int i = 0; i < 5; i++) {
            a3[i]=a1[i];
        }
        for (int i = 5; i < 10; i++) {
            a3[i]=a2[i-5];
        }
        
        for(int x : a3){
            System.out.print(x+"\t");
        }
    }
    
}
