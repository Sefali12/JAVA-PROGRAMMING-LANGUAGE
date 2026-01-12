import java.util.Arrays;
public class ceiling {
    public static void main(String[] args) {
        
        int[] arr={1,3,5,7,8,9,12,34};
        int target=10;
        int ans=ceiling(arr,target);
        System.out.println(arr[ans]);
    }
    static int ceiling(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }
            }
        //if target is greater than the greatest element in the array
        return start;
        }
    }

