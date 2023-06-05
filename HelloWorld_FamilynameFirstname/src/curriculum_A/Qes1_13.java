package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*
		問1 下記9個をローカル変数として宣言のみしてください
		問2 それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		問3 初期化をしたそれぞれの変数に値を代入してください 
		*/

        // バイト型を宣言
        byte b;
        // 初期化
        b = 0;
        // バイト型に代入
        b = 10;
               
        // 短整数型を宣言
        short s;
        // 初期化
        s = 0;
        // 短整数型に代入
        s = 100;
        
        // 整数型を宣言
        int i;
        // 初期化
        i = 0;
        // 整数型に代入
        i = 1000;
        
        // 長整数型を宣言
        long l;
        // 初期化
        l = 0L;
        // 長整数型に代入（接尾辞L）
        l = 10000L;
        
        // 単精度浮動小数点数型を宣言
        float f;
        // 初期化
        f = 0F;
        // 単精度浮動小数点数型に代入
        f = 9.5F;
        
        // 倍精度浮動小数点数型を宣言
        double d;
        // 初期化
        d = 0;
        // 倍精度浮動小数点数型に代入
        d = 10.5;
        
        // 文字型を宣言
        char c;
        // 初期化
        c = '\0';
        // 文字型に代入（シングルクォーテーションで囲まれた一文字のみ）
        c = 'a';
        
        // 文字列型を宣言
        String S;
        // 初期化（空）
        S = "";
        // 文字列型に代入
        S = "ハロー";
        
        // ブーリアン型を宣言
        boolean B;
        // 初期化
        B = false;
        // ブーリアン型に代入
        B = true;
        
        /*
        問4 下記の通りにコンソール出力されるようにしてください
        上記で作成した変数を必ず使用すること 
        */
 
        // 整数を全て足して11110とコンソールに出力
        int sum = b + s + i + (int) l;
        System.out.println(sum);
        
        // バイト型を足して20とコンソールに出力
        int sum1 = b + b;
        System.out.println(sum1);
        
        // 変数を足し合わせる
        String result = String.valueOf(c) + " " + S + " " + String.valueOf(B);
        
        // a ハロー true（間に半角スペース）とコンソールに出力
        System.out.println(result);
        
        // sumとsum1を足して11130とコンソールに出力
        int sum2 = sum + sum1;
        System.out.println(sum2);
        
        // 小数点以外の数字を全てかけ、コンソールに出力（long型）
        long result1 = (long)b * (long)s * (long)i * (long)l;
        System.out.println(result1);
        
        // 10.5割る100をし、コンソールに出力
        double result2 = d / s;
        System.out.println(result2);
        
        // 10引く100をし、コンソールに出力
        int result3 = b - s;
        System.out.println(result3);
        
        /*
        問5 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます
       「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください 
        */
       
	    // "20"を20に修正して整数型にした
	    int num = 20;
        int num1= 23;
        System.out.println("\n" + "ハローJAVA" + (num + num1));
        
        /*
        問6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        ローカル変数に代入し○○に入れてください『山田太郎 18歳 170.5cm 62.2kg 寿司』
        */
        
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
        
        /* 
        プロフィール出力
        身長と体重は少数第一位に丸めるためprintfを用い、\nで改行
        */
        System.out.println("\n" + "「初めまして" + name + "です」");
        System.out.println("「年齢は" + age + "歳です」");
        System.out.printf("「身長は%.1fcmです」" + "\n", height);
        System.out.printf("「体重は%.1fkgです」" + "\n", weight);
        System.out.println("「好きな食べ物は" + favoriteFood + "です」");
        
        /*
        問7 問6で作成した自己紹介に続いてBMIが出力されるようにしてください 
        */
        
        // BMI = 体重(Kg) × (身長(m))2 、s = 100
        // Math.pow関数で累乗する
        double h = height / s;
        double bmi = weight / Math.pow(h, 2);
        
        // BMIを出力、文字列に変換してBMI値を少数第一位に丸める
        System.out.printf("「BMIは" + String.format("%.1f", bmi) + "です」" + "\n");
        
        /* 
        問8 問6で宣言した変数に再代入し下記の通りコンソールに出力してください
		初めまして鈴木一郎です
		年齢は24歳です
		身長168.5cmです
		体重は64.2kgです
		好きな食べ物はオムライスです
		BMIは22.6です
        */
        
        // 名前を再代入
        name = "鈴木一郎";
        
        // 年齢を再代入
        age = 24;
        
        // 身長を再代入
        height = 168.5;
        
        // 体重を再代入
        weight = 64.2;
        
        // 好きな食べ物を再代入
        favoriteFood = "オムライス";
        
        // BMIの式に代入
        bmi = weight / Math.pow(h, 2);
        
        // プロフィール出力
        System.out.println("\n" + "「初めまして" + name + "です」");
        System.out.println("「年齢は" + age + "歳です」");
        System.out.printf("「身長は%.1fcmです」" + "\n", height);
        System.out.printf("「体重は%.1fkgです」" + "\n", weight);
        System.out.println("「好きな食べ物は" + favoriteFood + "です」");
        System.out.printf("「BMIは" + String.format("%.1f", bmi) + "です」" + "\n", bmi);
        
        /* 
        問9 問8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、
        下記の通りコンソールに出力してください
 		初めまして鈴木一郎です
		年齢は48歳です
		身長337.0cmです
		体重は128.4kgです
		好きな食べ物はオムライスです
		BMIは11.31です
		*/

        // 年齢を和算で自己代入
        age += age;
        
        // 身長を和算で自己代入
        height += height;
        
        // 体重を和算で自己代入
        weight += weight;
        
        // BMIの式に代入
        bmi = weight / Math.pow(h, 2);
	    
	    // プロフィール出力
        System.out.println("\n" + "「初めまして" + name + "です」");
        System.out.println("「年齢は" + age + "歳です」");
        System.out.printf("「身長は%.1fcmです」" + "\n", height);
        System.out.printf("「体重は%.1fkgです」" + "\n", weight);
        System.out.println("「好きな食べ物は" + favoriteFood + "です」");
        System.out.printf("「BMIは" + String.format("%.1f", bmi) + "です」" + "\n", bmi);
        
	    /* 
	    問10 問8で使用した年齢が25歳以上ならtrueが出力されるようにしてください
        ただしif文は使いません
        */
        
        // 問8のageを再代入
        age = 24;
        
        // boolean型は、条件判定・真偽値を扱う場面で使用される
        boolean ageOver25 = age >= 25;
        
        // trueは出力されない
	    System.out.println("\n" + ageOver25 + "\n");
	    
        /*
        問11 問8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください 
        */
        
	    // 文字列型に変換するString.valueof（）はさまざまなデータ型に対応
	    
	    // 年齢を再代入
	    age = 24;
	    // 年齢を文字列型に変換
	    String ageString = String.valueOf(age);
	    
	    // 身長を再代入
	    height = 168.5;
	    // 身長を文字列型に変換
	    String heightString = String.valueOf(height);
	    
        // 体重を再代入
        weight = 64.2;
	    // 体重を文字列型に変換
	    String weightString = String.valueOf(weight);
	    
	    // 繋げてコンソール出力
	    System.out.println(ageString + heightString + weightString + "\n");
	    
        /* 
        問12 問11で変換した【年齢・身長】を整数型に変換して出力してください  
        */      
	    
	    
	    // 年齢の文字列型を整数型に変換
	    int ageInt = Integer.valueOf(ageString);

	    // 身長の文字列型を整数型に変換
	    int heightInt = Integer.parseInt(heightString);

	    // 整数型に変換した年齢と身長を出力
	    System.out.println(ageInt + "\n" + heightInt + "\n");

	 
        /* 
        問13 問12で変換した【年齢・身長】で
        【年齢が25もしくは身長が160以上】であればtrueを出力してください
 		ただしif文は使わないでください 
 		*/
        
	    // 年齢が25以上もしくは身長が160以上であればtrueを出力
	    System.out.println(ageInt >= 25 || heightInt >= 160);
	    
	}
}
