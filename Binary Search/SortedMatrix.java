import java.util.Arrays;;
public class SortedMatrix {
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println(Arrays.toString(findInMatrix(matrix,15)));
    }

    public static int[] findInMatrix(int[][] matrix, int target){
        
        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
            return new int[]{-1,-1};
        }

        int row = searchColumn(matrix, target, 0, matrix.length);
        System.out.println(row);

        if(matrix[row][matrix[0].length-1]==target){
            return new int[] {row,matrix[0].length-1};
        }

        int[] ans = searchRow(matrix, target, 0, matrix[0].length,row);


        return ans;
    }

    public static int[] searchRow(int[][] matrix, int target, int start, int end,int row){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int searchColumn(int[][] matrix, int target, int start, int end){
        int c = matrix[0].length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(matrix[mid][c]==target){
                return mid;
            }
            else if(matrix[mid][c]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
}
