import java.util.Arrays;
public class SortedMatrix {
    int [][] matrix={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
    int target=6;
    public static void main (String[] args){

    }

    //search in the row provided
    static int[] BinarySearch(int[][] matrix,int cStart,int cEnd,int row,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
            }
            return new int[]{-1,-1};
        }

        static int[] search(int[][] matrix,int target){
            int rows=matrix.length;
            int cols=matrix[0].length;

            if (rows==1){
                return BinarySearch( matrix,0,cols-1,target)
            }
        }
    }
    }
    
}
