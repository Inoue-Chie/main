package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
        // バイト型を宣言
        byte myByte;
        
        // バイト型に代入
        myByte = 10;
               
        // 短整数型を宣言
        short myShort;
        
        // 短整数型に代入
        myShort = 100;
        
        // 整数型を宣言
        int myInt;
        
        // 整数型に代入
        myInt = 1000;
        
        // 長整数型を宣言
        long myLong;
        
        // 長整数型に代入（接尾辞L）
        myLong = 10000L;
        
        // 単精度浮動小数点数型を宣言
        float floatnum;
        
        // 単精度浮動小数点数型に代入
        floatnum = 9.5f;
        
        // 倍精度浮動小数点数型を宣言
        double doublenum;
        
        // 倍精度浮動小数点数型に代入
        doublenum = 10.5;	
        
        // 文字型を宣言
        char myChar;
        
        // 文字型に代入（シングルクォーテーションで囲まれた一文字のみ）
        myChar = 'a';        
        
        // 文字列型を宣言
        String myString;
        
        // 文字列型に代入
        myString = "ハロー";
        
        // ブーリアン型を宣言
        boolean myBoolean;
        
        // ブーリアン型に代入
        myBoolean = true;
        // コンソール出力
        
        // 整数を全て足して11110とコンソールに出力
        int sum = myByte + myShort + myInt + (int) myLong;
        System.out.println(sum);
        
        // バイト型を足して20とコンソールに出力
        int sum1 = myByte + myByte;
        System.out.println(sum1);
        
        // 変数を足し合わせてa ハロー true（間に半角スペース）とコンソールに出力
        String result = String.valueOf(myChar) + " " + myString + " " + String.valueOf(myBoolean);
        System.out.println(result);
        
        // sumとsum1を足して11130とコンソールに出力
        int sum2 = (myByte * 3) + myShort + myInt + (int) myLong;
        System.out.println(sum2);
        
        // 小数点以外の数字を全てかけ、コンソールに出力（long型）
        long result1 = (long)myByte * (long)myShort * (long)myInt * (long)myLong;
        System.out.println(result1);
        
        // 10.5割る100をする
        double result2 = doublenum / myShort;
        System.out.println(result2);
        
        // 10引く100をする
        int result3 = myByte - myShort;
        System.out.println(result3);
        
        //次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
        //「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
        int num = 20;
        int num1= 23;
        System.out.println("ハローJAVA"+(num+num1));
        
        //『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //ローカル変数に代入し○○に入れてください『山田太郎 18歳 170.5cm 62.2kg 寿司』
        
        // 名前を宣言し代入
        String name = "山田太郎";
        // 年齢を宣言し代入
        int age = 18;
        // 身長を宣言し代入
        double height = 170.5;
        // 体重を宣言し代入
        double weight = 62.2;
        // 寿司を宣言し代入
        String favoriteFood = "寿司";

        // フォーマットに従って出力
        // printlnではフォーマットに代入する記述ができなかったため、printfで改行時に\r\nを使用
        System.out.printf("「初めまして%sです」"
        		+ "\r\n「年齢は%d歳です」"
        		+ "\r\n「身長は%.1fcmです」"
        		+ "\r\n「体重は%.1fkgです」"
        		+ "\r\n「好きな食べ物は%sです」"
        		, name, age, height, weight, favoriteFood);
        
        // 上で作成した自己紹介に続いてBMIが出力されるようにしてください
        //「BMIは○○です」ただし計算は数値を直書きせず、全て変数を使ってすること

        
        // BMI = 体重(Kg) × (身長(m))2
        double bmi = weight / ((height / 100) * (height / 100));
        // BMI値を少数第一位に丸めてコンソールに出力
        System.out.println("「BMIは" + String.format("%.1f", bmi) + "です」");
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
}
