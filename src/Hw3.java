
public class Hw3 {

	public static void main(String[] agrs) {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		int count =0;
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int element = 0; element < twoD_Array[row].length; element++) {
				if(element == twoD_Array[row].length-1) {
					count += twoD_Array[row][element];
				} 
			}
		}
		System.out.println("count:"+count);

	}
}
