public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,34,56,33,88,57};
        int target=88;
        System.out.println(linearsearch(arr,target));

    }
    static int linearsearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int index=0;index<arr.length;index++){
            int element=arr[index];
            if (element==target){
                return index;
            }
        }


        return -1;//not found the element
    }
    
}
