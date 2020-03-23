import java.lang.reflect.Array;

public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		for(int i = 0; i < arr.length/2 ; i++) {
			 int x = arr[i];
			 int y = arr[arr.length - i - 1];
			 arr[i] = y;
			 arr[arr.length - i - 1] = x;
		}
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		for(int i = 0; i < mat.length; i ++) {
			ArrayUtil.reverseArray(mat[i]);
		}
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		reverseAllRows();
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0; j < mat[0].length; j ++) {
				int x = mat[i][j];
				 int y = mat[mat.length - i - 1][j];
				 mat[i][j] = y;
				 mat[mat.length - i - 1][j] = x;
			}
		}
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
