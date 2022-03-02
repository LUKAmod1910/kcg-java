import java.util.Scanner;
public class Review08 {
	public static void main(String[] args) {
		System.out.println("点数を入力してください");
		
		Scanner sc = new Scanner (System.in);
		int inputNumber = sc.nextInt();
		
		if (inputNumber >= 0 && inputNumber <= 49) {
			System.out.println("努力が必要です");
		}else if (inputNumber >= 50 && inputNumber<= 69) {
			System.out.println("普通です");
		}else if (inputNumber >= 70 && inputNumber<= 100) {
			System.out.println("優秀です");
		}else {
			System.out.println("不正な点数です");
		}
			
		sc.close();
			
		}
}
