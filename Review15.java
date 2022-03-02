import java.util.Scanner;
public class Review15 {
	public static void main (String[]args) {
		String words = "KyotoComputerGakuin";
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("切り取り対象" + words);
		System.out.println("開始位置を入力してください");
		int startingPosition = sc.nextInt();
		
		System.out.println("文字数を入力してください");
		int wordCount = sc.nextInt();
		sc.close();
		
//		System.out.println(words.charAt(2));
		
		mySubString(startingPosition, wordCount, words);
	}
	
	public static int mySubString(int startingPosition,  int wordCount, String words) {
//		startingPosition - 1 配列での対応文字
		
		System.out.println("切り取った文字は" + );
	}
	
}
