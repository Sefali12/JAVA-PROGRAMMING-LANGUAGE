public class PowerOfTwo {
    public static void main(String[] args){
        int num=16;
        System.out.println(PowerOfTwo(num));

    }
    static boolean PowerOfTwo(int num){
        if (num == 0) {
            return false;
        }
        else if ((num&(num-1))==0){
            return true;
        }
        return false;
    }
    
}
