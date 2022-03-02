import java.util.Scanner;
public class Review14 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int scores [][] = new int [4][2];
		
		System.out.println("1人目の国語の点数");
		scores[0][0] = sc.nextInt();
		
		System.out.println("1人目の数学の点数");
		scores[0][1] = sc.nextInt();
		
		System.out.println("2人目の国語の点数");
		scores[1][0] = sc.nextInt();
		
		System.out.println("2人目の数学の点数");
		scores[1][1] = sc.nextInt();
		
		System.out.println("3人目の国語の点数");
		scores[2][0] = sc.nextInt();
		
		System.out.println("3人目の数学の点数");
		scores[2][1] = sc.nextInt();
		
		System.out.println("4人目の国語の点数");
		scores[3][0] = sc.nextInt();
		
		System.out.println("4人目の数学の点数");
		scores[3][1] = sc.nextInt();
		sc.close();
		
		scoresShow(scores);
	}
	
	static void scoresShow(int[][] scores) {
		System.out.println("1人目の点数　国語:" + scores[0][0] + "数学:" + scores[0][1]);
		System.out.println("2人目の点数　国語:" + scores[1][0] + "数学:" + scores[1][1]);
		System.out.println("3人目の点数　国語:" + scores[2][0] + "数学:" + scores[2][1]);
		System.out.println("4人目の点数　国語:" + scores[3][0] + "数学:" + scores[3][1]);
	}
}
