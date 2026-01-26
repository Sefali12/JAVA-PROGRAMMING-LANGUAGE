import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedArrayList {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        LinkedList <Integer> list=new LinkedList<>();
        for(int i=0;i<5;i++){
            System.out.println("Enter element " + (i+1) + ": ");
            list.add(in.nextInt());            
        }
        for( int i =0;i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);
        in.close();
    }
    
}