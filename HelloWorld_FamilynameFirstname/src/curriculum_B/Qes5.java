package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
	    	
	    // 二重ループ
		// 9行表示
		for (int j = 1; j <= 9; j++) {
			// 20列表示
            for (int i = 1; i <= 20; i++) {
            
            	// 3桁で表示する
                String iString = String.format("%03d", i);
                String jString = String.format("%03d", j);
                int result = i * j;
                String resultString = String.format("%03d", result);
                // i * j = result
                System.out.print(iString + " * " + jString + " = " + resultString);
                
                // iが20の時"||"を表示しない
                if (i != 20) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }
    }
}