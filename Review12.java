import java.util.Scanner;
public class Review12 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("入力する値の個数を入力してください");	
		int quantity = sc.nextInt(); 
		int [] values = new int [quantity];
		
		for(int i = 0; i<=values.length-1; i++) {
			System.out.println( i+1 + "番目の整数を入力");
			values[i] = sc.nextInt();
		}
		sc.close();
//		int result = arrayTotal(values);
//		System.out.println("配列の値の平均は" + result);
		}
	
//	public static double arrayTotal(int [] values) {
//		int sum;
//		for (int j =0; j<=values.length-1; j++) {
//			sum =  sum + values[j];
//		}
////		return sum / values.length;
//	}
}
