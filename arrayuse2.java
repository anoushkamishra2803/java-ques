package LEC8;

import java.util.Scanner;

public class arrayuse2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int s[] = new int[size];
        for(int i = 0; i< size; i++){
          s[i]=  s.length;
        }
        for(int i = 0; i<size; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
