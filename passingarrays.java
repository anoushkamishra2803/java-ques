package LEC8;
import java.util.Scanner;
public class passingarrays {
    public static int largestInArray(int s []){
int max = Integer.MIN_VALUE;
for(int i = 0; i < s.length; i++){
    if( s[i] > max){
        max = s[i];
    }
}
return max;
    }
    public static int[] takes(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int s[] = new int[size];
        for(int i = 0; i< size; i++){
            s[i]= s.nextInt();
        }
        return s;
        }

public static void print(int s[]){
    int size = s.length;
 for(int i = 0;i < size; i++){
     System.out.print(s[i]+ " ");
 }
 System.out.println();
}
public static void increment(int i) {
    i++;
}
public static void incrementArray(int s[]) {
    s = new int[5];
    for(int i = 0; i < s.length - 1; i++){
        s[i]++;
    }
}
    public static void main(String[] args) {
        // int i = 10;
        // increment(i);
        // System.out.println(i);
        int arr[] ={1,2,3,4,5} ;
        incrementArray(arr);
        print(arr);
        // print(arr);
        // int largest = largestInArray(arr);
        // System.out.println("largest " + largest);
        
    }
}
