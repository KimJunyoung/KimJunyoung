package array;

public class TowArray {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		System.out.println(arr.length); //행의 길이를 ..
		System.out.println(arr[0].length);
		
		System.out.println("==========");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);  // 하나의 행부터 잡고 열을 돌린다.
			}
		}

	}

}
