import java.util.Arrays;
public class bubble {
    public static void main(String[] args){
        int[] arr={1,4,6,3,7,2,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        bubblerecur(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));

    }


    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }

    static void bubblerecur(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
        
            bubblerecur(arr,r,c+1);
        }
            else{
                bubblerecur(arr,r-1,0);


            }
        }
    }
    
