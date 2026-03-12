public class NoOfDigits {
    public static void main(String[] args){
        int n=1234;
        int b=10;
        System.out.println(NoOfDigits(n,b));
    }
    static int NoOfDigits(int n,int b){
        int count=(int)(((Math.log (n))/(Math.log (b)))+1);
        return count;

    }

    
}
