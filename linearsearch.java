public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,34,56,33,88,57};
        int target=89;
        //System.out.println(linearsearch(arr,target));
        System.out.println(linearrsearch(arr,target,0));

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
    static boolean linearrsearch(int[] arr,int target,int index){
        //base condition
        if (index==arr.length){
            return false;
        }
        return (arr[index]==target) || linearrsearch(arr,target,index+1);
    }

    
}

