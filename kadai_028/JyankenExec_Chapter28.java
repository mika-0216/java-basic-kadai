package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//オブジェクトの宣言？　メソッドを呼び出して実行する？
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
		
		//getMyChoice() や getRandom() は値を返すメソッド（return がある）結果を受け取るために変数を作る必要がある//
		//getMyChoicを呼びだし実行　オブジェクト名.メソッド名();
		String myHand = game.getMyChoice();
		
		
		//getRandomを呼びだし実行
		String yourHand = game.getRandom(); 
		
		
		//playGameを呼びだし実行
		game.playGame(myHand, yourHand);

	}

}

/*全体の流れ
1️自分の手を入力して myHand に保存
2️自分の手を入力して myHand yourHand に保存
3️その2つを使って勝敗を判定*/
