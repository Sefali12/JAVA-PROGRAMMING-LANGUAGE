import java.util.Arrays;
public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9,12,23,45,67,78,89};
        int target=67;
        int ans=orderAgnosticsBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticsBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isASC=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            
            }
            if(isASC){
                if (arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
                }
            else{
                if (arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;

            }
            }
        }
        return -1;

    }


    
}
