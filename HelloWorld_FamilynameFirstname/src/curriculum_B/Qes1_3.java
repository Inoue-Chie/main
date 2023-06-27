package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
	
	 /*
	 問1
	 ログイン時の入力チェックシステムを下記条件で作成してください
	・コンソールにユーザー名を入力できるようにしてください
	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
	 */
	
	 // Scannerクラスのインスタンスを生成
     Scanner scanner = new Scanner(System.in);
     // ユーザー名を入力してください
     System.out.print("ユーザー名を入力してください: ");
     // ユーザー名は文字列だからnextLine（一行）を選んだ
     String userName = scanner.nextLine();
    
     // ユーザー名の文字列について条件分岐
     if (userName.length() > 10) {
    	// 「名前を10文字以内にしてください」と出力
         System.out.println("「名前を10文字以内にしてください」");
         
     } else if (userName.length() <= 0 || userName == "" ){ 
    	 // 文字数が0文字以下もしくはnull（空）の場合 
    	 System.out.println("「名前を入力してください」");
    	 
     } else {
    	 // 正常な値だった場合
    	 System.out.println("「ユーザー名「" + userName + "」を登録しました」");
     }
    
	 /*
	 問2
	 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
	 */
    
     // 半角英数字の正規表現
     String pattern = "^[A-Za-z0-9]+$";
     
     // ユーザー名がパターンとマッチしない場合
     if (!userName.matches(pattern)) {
    	 // 「半角英数字のみで名前を入力してください」と出力
    	 System.out.println("「半角英数字のみで名前を入力してください」");
     
     } else {
    	 // ユーザー名が半角英数字の場合そのまま出力
    	 System.out.println(userName);
	 }
	
	 /*
	 問3-1
	 じゃんけんのシステムを下記の条件で作成してください
	・「0はグー、1：チョキ、2：パー」とすること
	・じゃんけんに勝つまでループすること
	・一回ごとに自分の手と相手の手を下記の通り出力してください
	 ユーザー名「name」を登録しました
	 nameの手は「パー」
	 相手の手は「グー」
	 */


              // じゃんけんに勝つまでループ
     		  int count = 0;
              while (true) {
                  // 「name」を登録しました
                  System.out.print("ユーザー名を入力してください: ");
                  String name = scanner.nextLine();
                  System.out.println("「" + name + "」を登録しました");

                  // nameの手は「パー」
                  int myHand = 2;
                  System.out.println(name + "の手は「パー」");

                  // 相手の手は「グー」
                  int enemyHand = 0;
                  System.out.println("相手の手は「グー」");

                  // 自分が勝つ場合
                  if ((myHand == 2 && enemyHand == 0) || (myHand == 1 && enemyHand == 2) || (myHand == 0 && enemyHand == 1)) {
                      System.out.println("やるやん。");
                      System.out.println("次は俺にリベンジさせて");

                  // 自分がグーに負ける場合
                  } else if (myHand == 1 && enemyHand == 0) {
                      System.out.println("俺の勝ち！");
                      System.out.println("負けは次につながるチャンスです！");
                      System.out.println("ネバーギブアップ！");

                  // 自分がチョキに負ける場合
                  } else if (myHand == 2 && enemyHand == 1) {
                      System.out.println("俺の勝ち！");
                      System.out.println("たかがじゃんけん、そう思ってないですか？");
                      System.out.println("それやったら次も、俺が勝ちますよ");

                  // 自分がパーに負ける場合
                  } else if (myHand == 0 && enemyHand == 2) {
                      System.out.println("俺の勝ち！");
                      System.out.println("なんで負けたか、明日まで考えといてください。");
                      System.out.println("そしたら何かが見えてくるはずです");

                  // あいこの場合
                  } else if ((myHand == 2 && enemyHand == 2) || (myHand == 1 && enemyHand == 1) || (myHand == 0 && enemyHand == 0)) {
                      System.out.println("DRAW あいこ もう一回しましょう！");
                  }
                  
                  count++; // じゃんけんを行った回数をカウント
                  
                  // じゃんけんを行った回数を表示
                  System.out.println("勝つまでにかかった合計回数は" + count + "回です");
              }
    }
}

      
      
      
      
