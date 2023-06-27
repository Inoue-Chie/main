package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {



	 /*
	 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
	・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
    ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
	・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
	・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
	・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
	・入力された値は「、」区切りで指定してください
	・そのほかの値が入力された場合下記を出力されるようにしてください
		『受け取った値』は指定の商品ではありません
	・残り台数は0〜11までのランダムな値が出力されるようにしてください
	
	入力例↓↓
	パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品

	出力例↓↓
	パソコンの残り台数は8台です
	冷蔵庫の残り台数は7台です
	扇風機の残り台数は7台です
	洗濯機の残り台数は10台です
	加湿器の残り台数は3台です
	テレビの残り台数は9台です
	ディスプレイの残り台数は2台です
	『 その他商品 』は指定の商品ではありません


	 *
	 */
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("商品を入力：");

		String input = scanner.nextLine();
		String[] products = input.split("、");

		// ランダムで数値を出力する
		Random random = new Random();
		// テレビとディスプレイが合わせて11台
		int tvAndDisplay = 11; 
		// テレビの台数を予め宣言する
	    int tv = 11 - random.nextInt(12);
	
		for (String product : products) {
			
			// パソコン、冷蔵庫、扇風機、洗濯機、加湿器
			switch (product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
			
			// 0～11台でランダムに出力する
			int remaining = 11 - random.nextInt(12);
			System.out.println(product + "の残り台数は" + remaining + "台です");
			break;
	
			// テレビ
			case "テレビ":
			System.out.println(product + "の残り台数は" + tv + "台です");
			break;
	
			// テレビとディスプレイは合計で11台とする
			case "ディスプレイ":
			int display = tvAndDisplay - tv;
			System.out.println(product + "の残り台数は" + display + "台です");
			break;
			
			// その他
			default:
			System.out.println("『" + product + "』は指定の商品ではありません");
			break;
		
        }
     }
     }
}

