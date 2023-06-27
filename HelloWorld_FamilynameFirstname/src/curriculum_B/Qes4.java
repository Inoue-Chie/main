package curriculum_B;

public class Qes4 {
	
    public static void main(String[] args) {
    	
    	// 二重ループ
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
            	
                /*
            	int result = i * j;
                // 結果が10未満の場合は頭に"0"を付ける
            	 if (result < 10) {
                    System.out.print("0" + i + " * 0" + j + " = 0" + result);
                // 結果が10以上の場合はそのまま表示
                } else {
                    System.out.print("0" + i + " * 0" + j + " = " + result);
                }
                */
            	
            	// 出力値を2桁表示にする"%02d"
                String iString = String.format("%02d", i);
                String jString = String.format("%02d", j);
                int result = i * j;
                String resultString = String.format("%02d", result);
                
                System.out.print(iString + " * " + jString + " = " + resultString);
                
                
                // 間に"||"を表示
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }
    }
}

