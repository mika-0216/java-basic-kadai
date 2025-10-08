package kadai_015;

public class Car_Chapter15 {
	//フィールドを宣言
	private int  gear = 1;//ギア（初期値１）
	private int speed = 10;//速度（初期値１０km）
	
	//ギアチェンジするメソッド
	public void changeGear(int  afterGear) {
		//今のギアを保存
		int beforeGear = gear;
		//ギアを変更
		gear = afterGear;
		
		//ギアが1~5ならギアかける10、それ以外なら10
		if(gear >=1 && gear <=5) {
			speed=gear*10;
		}else {
			speed=10;
		}
		//結果を表示
		System.out.println("ギア"+beforeGear+"から"+gear+"に切り替えました");
		}
	
	//速度を出力するrunメソッドを追加
	public void run() {
		System.out.println("速度は時速"+speed+"kmです");
	}
}
