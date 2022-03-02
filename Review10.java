import java.util.Scanner;
public class Review10 {
	public static void main(String[] args) {
		
		System.out.println("2~10までの整数を入力してください");
		
		Scanner sc = new Scanner (System.in);
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for(int j = 1; j <= count; j++) {
				System.out.print("あ");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}
}
