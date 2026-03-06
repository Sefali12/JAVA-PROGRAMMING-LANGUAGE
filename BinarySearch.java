import java.util.Arrays;

/*public class BinarySearch {
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
    }*/
   public class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,45,66,78,88};
        int target=66;
        System.out.println(search( arr,target,0,arr.length-1));

    }

    static int search(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr,target,mid+1,e);
        }
        return search(arr,target,s,mid-1);
    }
   }

