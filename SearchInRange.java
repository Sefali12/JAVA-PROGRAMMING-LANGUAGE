public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,23,54,33,67,89};
        int target=345;
        int start=1;
        int end =4;
        System.out.println(search(arr,target,start,end));

    }
    static boolean search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return false;
        }
        for (int i=start;i<=end;i++){
            int element=arr[i];
            if (element==target){
                return true;
            }
        }
        return false;
    
    }
    
}
