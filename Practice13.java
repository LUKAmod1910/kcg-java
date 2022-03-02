package file;

public class Practice13 {
	public static void main (String [] args) {
		MyGcdLcm myIns = new MyGcdLcm();
		int[] values = new int [GcdLcmMaster.COUNT];
		int gcdValue = 0;
		int lcmValue = 0;
//		整数の入力
		for(int i = 0; i< values.length;i++) {
			values[i] = myIns.inputValue(i);
		}
//		最大公約数を求め結果を受け取る
		gcdValue = myIns.gcdSection(values[0],values[1]);
//		最小公倍数を求め結果を受け取る
		lcmValue = myIns.lcmSelection(values,gcdValue);
//		フォルダの有無(なければフォルダ作)
		myIns.existsFolder();
//		ファイルへの書き出し
		myIns.fileOutput(values, gcdValue, lcmValue);
		System.out.println("出力完了");
	}
}
