import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListexample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>(5);
        for(int i=0;i<5;i++){
            System.out.println("Enter element " + (i+1) + ": ");
            list.add(in.nextInt());            // Here you would typically add the element to the ArrayList
        }
        for( int i =0;i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
        in.close();
    }
    
}
