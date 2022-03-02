package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyGcdLcm extends GcdLcmMaster{

	@Override
	int gcdSection(int value01, int value02) {
		if(value01 < value02) {
			int tmp = value01;
			value01 = value02;
			value02 = tmp;
		}
		int tmp = 0;
		do {
			if(value01 % value02 == 0) {
				break;
			}else {
				tmp =  value01;
				value01 = value02;
				value02 = tmp % value01;
			}
		}while(true);
		return value02;
	}

	@Override
	int lcmSelection(int[] values, int gcd) {
		
		return (values[0] * values[1] / gcd);
	}

	@Override
	void existsFolder() {
		File fileIns = new File(GcdLcmMaster.FOLDERNAME);
		if(fileIns.mkdir()) {
			System.out.println("フォルダ作成完了");
		}
	}

	@Override
	void fileOutput(int[] values, int gcd, int lcm) {
		File outPutIns = new File(GcdLcmMaster.FILENAME);
		try {
			FileWriter fw = new FileWriter(outPutIns);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(values[0] + "と" + values[1] + "の\n");
			bw.write("最大公約数 : " + gcd + "\n");
			bw.write("最小公倍数 : " + lcm);
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
