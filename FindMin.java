public class FindMin {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7,8,-4};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minVal=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<minVal){
                minVal=arr[i];
        
            }
        }
        return minVal;

        }
    

    }
    

