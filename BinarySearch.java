import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-14,-12,-5,0,3,7,9,12,15,18,22,27,30};
        int target=22;
        int ans=binarysearch(arr,target);  
        System.out.println(ans);
    }

    static int binarysearch(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }

            }
            return -1;
        
        }
    }

