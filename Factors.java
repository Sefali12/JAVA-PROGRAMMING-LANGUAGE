public class Factors {
    public static void main(String[] args){
        int n=20;
        factor(n);
        factors2(n);
    }
    //O(N)
    static void factor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i +" ");
            }
        }
    
    }
    //O(sqrt(n))
    static void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+" ");
                }
                System.out.println(i+" "+ n/i+ " ");
            }
        }
    }
    
}
