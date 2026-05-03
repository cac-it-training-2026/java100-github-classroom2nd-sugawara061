package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		// 山手線の駅
		String[] stations = {
				"東京", "神田", "秋葉原", "御徒町", "上野", "鴬谷", "日暮里", "西日暮里",
				"田端", "駒込", "巣鴨", "大塚", "池袋", "目白", "高田馬場", "新大久保",
				"新宿", "代々木", "原宿", "渋谷", "恵比寿", "目黒", "五反田", "大崎",
				"品川", "高輪ゲートウェイ", "田町", "浜松町", "新橋", "有楽町"
		};

		// 入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 使った駅をtrueにする
		boolean[] used = new boolean[stations.length];

		// 使用済み駅数
		int usedCount = 0;

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！\n");

		//メイン
		while (true) {

			// ユーザーの入力 
			String input = br.readLine();
			// 駅が存在するか
			boolean isExist = false;
			int index = -1;

			// 入力された駅がリストにあるのか
			for (int i = 0; i < stations.length; i++) {
				if (stations[i].equals(input)) {
					isExist = true;
					index = i;
					break;
				}
			}

			// 存在しない か既に使われている 場合→ 負け
			if (!isExist || used[index]) {
				System.out.println("あなたの負けです！");
				break;
			}

			// 正解なので使用済みにする
			used[index] = true;
			usedCount++;

			// 全部出たら勝ち
			if (usedCount == stations.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			// コンピュータのターン 
			int compIndex = -1;

			// ランダムで探す
			while (true) {
				int rand = (int) (Math.random() * stations.length);
				if (!used[rand]) {
					compIndex = rand;
					break;
				}
			}

			// 駅を表示
			System.out.println(stations[compIndex]);

			// 使用済みにする
			used[compIndex] = true;
			usedCount++;

			// 全部出たらユーザー勝ち
			if (usedCount == stations.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}
		}
	}

}
