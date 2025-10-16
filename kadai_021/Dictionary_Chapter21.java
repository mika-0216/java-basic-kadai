
package kadai_021;
import java.util.HashMap;
public class Dictionary_Chapter21 {
	//HashMapの宣言
	HashMap<String,String> fruit = new HashMap<String,String>();
	
	//コンストラクタ（辞書を作るときに中身を入れる）＋要素の追加
	/*辞書（HashMap）に英単語と意味を登録する処理は、
	辞書を作った瞬間に一度だけ実行したい*/
	 public Dictionary_Chapter21() {
    fruit.put("apple","りんご");
	fruit.put("peach","桃");
	fruit.put("banana","バナナ");
	fruit.put("lemon","レモン");
	fruit.put("pear","梨");
	fruit.put("kiwi","キウィ");
	fruit.put("strawberry","いちご");
	fruit.put("grape","ぶどう");
	fruit.put("muscat","マスカット");
	fruit.put("cherry","さくらんぼ");
	 }
	
	
	/*ここにメソッドを書きたい。ここで全部の処理かいてmainで呼び出すだけにしたい。
	 * 繰り返し処理＋条件分岐＋Printlmで表示
	 * 最初にメソッドを定義その中に処理をかく
	 */
	 public void searchWords(String[]  searchWords) {
	 for(int i=0; i<searchWords.length; i++) {
			 String  words = searchWords[i];
			 if (fruit.containsKey(words)){
				 System.out.println(words+ "の意味は" + fruit.get(words) );
				  }else {
					  System.out.println(words + "は辞書に存在しません");
				  }
	          }
	     }
}
	 
	 
	

