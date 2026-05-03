package lesson08.challenge03.Nusery.logic;

public class NurseryShcoolChild {
	private String name;

	public void NurserySchoolChild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void Play() {
		System.out.println("遊ぶよ～。");
	}
}
