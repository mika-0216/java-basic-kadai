package kadai_018;//最終全ての実行　全て代入していく

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//加藤太郎
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();//オブジェクト作成
		//加藤太郎の名前をセットする
		katoTaro.setGivenName();
		//加藤太郎の自己紹介を実行する
		katoTaro.execIntroduce();
		
	
		//加藤一郎
		KatoIchiro_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
		katoIchiro.setGivenName(); // 一郎
		katoIchiro.execIntroduce();
		
		//加藤花子
		KatoHanako_Chapter18  katoHanako= new KatoHanako_Chapter18();
		katoHanako.setGivenName();//花子
		katoHanako.execIntroduce();

	}

}
