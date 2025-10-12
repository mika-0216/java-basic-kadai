package kadai_018;//最終全ての実行　全て代入していく

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//加藤太郎
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();//オブジェクト作成
		taro.familyName = "加藤";
		taro.setGivenName();//太郎が入る
		taro.address = "東京都中野区〇×";
		taro.execIntroduce();
		
		//加藤一郎
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.familyName = "加藤";
		ichiro.setGivenName(); // 一郎
		ichiro.address = "東京都中野区〇×";
		ichiro.execIntroduce();
		
		//加藤花子
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.familyName = "加藤";
		hanako.setGivenName();//花子
		hanako.address = "東京都中野区〇×";
		hanako.execIntroduce();

	}

}
