public class Kadane {
    public static void main(String[] args){
        int[] arr={5,3,-1,2,9};
        System.out.println(Kadane(arr));
    }
    static int Kadane(int[] arr){
        int current=arr[0];
        int best=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            current=Math.max(arr[i],current+arr[i]);
            best=Math.max(best,current);
        

        }
        return best;
    }
    
}
