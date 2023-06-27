package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	
	/*
	N人の生徒の成績を管理するプログラムを下記条件で作成してください
	・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
	・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
	・このプログラムの実行は必ず1回以上行われるようにしてください
	・出力例を参考にプログラミングを作成してください

	入力・出力例
	生徒の人数を入力してください（2以上）: 2
	1人目の『英語』の点数を入力してください :10
	1人目の『数学』の点数を入力してください :10
	1人目の『理科』の点数を入力してください :10
	1人目の『社会』の点数を入力してください :10

	2人目の『英語』の点数を入力してください :10
	2人目の『数学』の点数を入力してください :10
	2人目の『理科』の点数を入力してください :10
	2人目の『社会』の点数を入力してください :10

	1人目の平均点は10.00点です。
	2人目の平均点は10.00点です。

	英語の平均点は10.00点です。
	数学の平均点は10.00点です。
	理科の平均点は10.00点です。
	社会の平均点は10.00点です。
	全体の平均点は10.00点です。
	*/
    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("生徒の人数を入力してください（2以上）: ");
	        int numberOfStudents = scanner.nextInt();

	        // 各科目の合計点を初期化
	        double englishTotal = 0.0;
	        double mathTotal = 0.0;
	        double scienceTotal = 0.0;
	        double socialTotal = 0.0;

	        // 各生徒の成績を入力し、合計点を計算
	        for (int i = 1; i <= numberOfStudents; i++) {
	        	
	        	
	        	// 2人以上ならば改行する
	        	if (i >= 2) {
	        		System.out.println();
	        	}
	        	
	            System.out.print(i + "人目の『英語』の点数を入力してください: ");
	            int englishScore = scanner.nextInt();
	            englishTotal += englishScore;

	            System.out.print(i + "人目の『数学』の点数を入力してください: ");
	            int mathScore = scanner.nextInt();
	            mathTotal += mathScore;

	            System.out.print(i + "人目の『理科』の点数を入力してください: ");
	            int scienceScore = scanner.nextInt();
	            scienceTotal += scienceScore;

	            System.out.print(i + "人目の『社会』の点数を入力してください: ");
	            int socialScore = scanner.nextInt();
	            socialTotal += socialScore;
	        }

	        // 各科目の平均点を計算
	        double englishAverage = englishTotal / numberOfStudents;
	        double mathAverage = mathTotal / numberOfStudents;
	        double scienceAverage = scienceTotal / numberOfStudents;
	        double socialAverage = socialTotal / numberOfStudents;

	        // 全体の平均点を計算
	        double totalAverage = (englishTotal + mathTotal + scienceTotal + socialTotal) / (numberOfStudents * 4);

	        // 結果を出力
	        
	        System.out.println();
	        for (int i = 1; i <= numberOfStudents; i++) {
	            System.out.printf("%d人目の平均点は%.2f点です。" + "\n", i, (englishTotal + mathTotal + scienceTotal + socialTotal) / 4 / numberOfStudents);
	        }

	        System.out.println();
	        System.out.printf("英語の平均点は%.2f点です。\n", englishAverage);
	        System.out.printf("数学の平均点は%.2f点です。\n", mathAverage);
	        System.out.printf("理科の平均点は%.2f点です。\n", scienceAverage);
	        System.out.printf("社会の平均点は%.2f点です。\n", socialAverage);
	        System.out.printf("全体の平均点は%.2f点です。\n", totalAverage);

	        scanner.close();
	    }
}
