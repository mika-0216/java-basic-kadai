package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
	////Scannerクラスのオブジェクトを生成する
		java.util.Scanner scanner = new Scanner(System.in);
		//繰り返し処理 無限ループを作成　
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			//入力した内容を取得する inputに代入
			String input = scanner.next();
			//条件分岐 inputの中身がr s pのどれかならオブジェクトを閉じてリターンでinputの中を返す
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				//Scannerクラスのオブジェクトをクローズする
				scanner.close();
				return input;
				//もそうじゃなければ、エラー文的なのを表示させてcontinueでwhile文の上に戻す
			}else {
				System.out.println("rかsかpを入力してください");
				continue;
			}
		}
		
	}
	//対戦相手の手を乱数で選ぶMath.random() * ３？r s pのどれかが出るように？
	public String getRandom() {
		String[] hand = {"r" ,"s" ,"p"};//配列を作成
		int random =(int) Math.floor(Math.random()*3);//flootで小数点を切り捨て(int)でdouble型を型変換で整数に
		return hand[random];//引数があるということはreturnで結果を出してあげないといけない　配列handの０、１、２番目の文字をreturnで返す

	}
	
	//じゃんけんを行う　勝ち負けが決まる　if文でもし勝ったら、負けたら、あいこだったら？
	// 引数名は自分で決める　引数の型　引数名
	public void playGame(String myHand, String yourHand) {
		HashMap<String,String> handName = new HashMap<>();
		handName.put("r","グー");//キー+値
		handName.put("s","チョキ");
		handName.put("p","パー");
		
		System.out.print("自分の手は"+handName.get(myHand));
		System.out.println("対戦相手の手は,"+handName.get(yourHand));
		
		//ここからif文　もし勝ったら→あいこなら→負けたら　の順で書きたい
		//自分が勝つのは3パターン文字を比較するため.equals
		if((myHand.equals("r")&& yourHand.equals("s")) || (myHand.equals("s") && yourHand.equals("p")) || (myHand.equals("p") && yourHand.equals("r"))){
			System.out.println("自分の勝ちです");
		}else if(myHand.equals(yourHand)) {
			System.out.println("あいこです");
		}else {
			System.out.println("自分の負けです");//勝つとあいこ以外は全て自分が負ける
		}
		
		

	}

}
