package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuperRobot {

	String makeSuperDish(int flourNum, int sugarNum, int eggNum, int butterNum) {

		String menu = null;

		if (flourNum >= 200 && sugarNum >= 100 && eggNum >= 3 && butterNum >= 100) {
			menu = "ケーキ";
		} else if (eggNum >= 2 && butterNum >= 50) {
			menu = "オムライス";
		} else if (eggNum >= 1) {
			menu = "スクランブルエッグ";
		} else {
			menu = null;
		}

		return menu;
	}
}

public class challenge10 {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("もっと高性能なロボットが欲しいですね。\n");
		System.out.println("Rさん：");
		System.out.println("よし、自分で作ってみよう！\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		int flourNum = Integer.parseInt(br.readLine());

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		int sugarNum = Integer.parseInt(br.readLine());

		System.out.print("\n卵の個数を入力してください＞");
		int eggNum = Integer.parseInt(br.readLine());

		System.out.print("\nバターの量を入力してください（グラム）＞");
		int butterNum = Integer.parseInt(br.readLine());

		// SuperRobotの使用
		SuperRobot superRobot = new SuperRobot();
		String dish = superRobot.makeSuperDish(flourNum, sugarNum, eggNum, butterNum);

		if (dish != null) {
			System.out.println("\n" + dish + "が出来ました。");
		} else {
			System.out.println("\n何も作れません。");
		}
	}
}

//材料の量に応じて豪華な料理を作成する機能