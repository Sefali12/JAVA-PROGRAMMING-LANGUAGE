public class OddEven {
    public static void main(String[] args){
        int n=10;
        System.out.println(isODD(n));
    }
    private static boolean isODD(int n){
        return (n & 1)==1;
    }
}
