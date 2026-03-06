public class NumbersExampleRecursion {
    public static void main(String[] args){
        print(1);
    }

    static void print(int n){
        if(n==5){
            System.out.println(5);//BASE CONDITION
            return;
        }
        System.out.println(n);//BODY
        print(n+1);//RECURSIVE CALL

    }
    
}
