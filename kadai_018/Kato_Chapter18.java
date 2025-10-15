package kadai_018;//親クラス

public abstract class Kato_Chapter18 {
	//フィールド
	public String familyName = "加藤"; //性　共通
	public String givenName = "";   //名 個別の名前を入れる箱
	public String address = "東京都中野区〇×";  //住所 共通
	
	//共通の紹介（氏名と住所を表示）
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	//子クラスごとの個別紹介　eachIntroduceを使う
	public abstract void eachIntroduce(); //個性を出す　子が実装
	
	//紹介を実行　順番は　共通→個別の内容→
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
	
	

}
