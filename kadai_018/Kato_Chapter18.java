package kadai_018;//親クラス

public abstract class Kato_Chapter18 {
	
	public String familyName;//性
	public String givenName;//名
	public String address;//住所
	
	//共通の紹介（氏名と住所を表示）
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
	}
	
	//子クラスごとの個別紹介　eachIntroduceを使う
	public abstract void eachIntroduce();
	
	//紹介を実行　順番は　共通→個別の内容→
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}
	
	

}
