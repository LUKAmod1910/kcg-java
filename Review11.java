import java.util.Scanner;
public class Review11 {
	public static void main(String[] args) {
		
		int [] value = new int [5];
		Scanner sc = new Scanner (System.in);
//		int integer = sc.nextInt();
		
		for(int i = 0; i <= 4; i++) {
			System.out.println((i + 1) + "つ目の整数を入力してください");
			value[i] = sc.nextInt();
		} 
		
		for (int j = 0; j<=4; j++) {
			if (value[j] % 2 == 1) {
				
			}
		}
		sc.close();
	}
}
