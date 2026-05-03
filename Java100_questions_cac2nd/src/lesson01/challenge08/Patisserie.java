/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int chocorat = 30;
		int pistache = 30;

		System.out.println("\n本日のおすすめ商品\n");
		System.out.println("シトロン　　　\\250・・・残り" + citron + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocorat + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistache + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？(最大30個まで)\n");
		System.out.print("シトロン　　　>");
		String str1 = reader.readLine();
		double num1 = Double.parseDouble(str1);

		System.out.print("ショコラ　　　>");
		String str2 = reader.readLine();
		double num2 = Double.parseDouble(str2);

		System.out.print("ピスターシュ　>");
		String str3 = reader.readLine();
		double num3 = Double.parseDouble(str3);

		System.out.println("\nシトロン　　　" + num1 + "個");
		System.out.println("ショコラ　　　" + num2 + "個");
		System.out.println("ピスターシュ　" + num3 + "個");

		System.out.println("\n合計個数　　" + (num1 + num2 + num3) + "個");
		System.out.println("合計金額　　" + (int) (num1 * 250 + num2 * 280 + num3 * 320) + "円");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250・・・残り" + (int) (citron - num1) + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + (int) (chocorat - num2) + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + (int) (pistache - num3) + "個");

		System.out.println("\n閉店の時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計" + (int) (num1 * 250 + num2 * 280 + num3 * 320) + "円");

		System.out.println("\n内訳");
		double total = num1 * 250 + num2 * 280 + num3 * 320;

		System.out.println("シトロン　　　" + (int) (num1 * 250) + "円・・・"
				+ (int) ((num1 * 250) / total * 100) + "%");

		System.out.println("ショコラ　　　" + (int) (num2 * 280) + "円・・・"
				+ (int) ((num2 * 280) / total * 100) + "%");

		System.out.println("ピスターシュ　" + (int) (num3 * 320) + "円・・・"
				+ (int) ((num3 * 320) / total * 100) + "%");

	}

}
