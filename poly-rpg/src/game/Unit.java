package game;

public abstract class Unit {
	int curhp;
	int maxhp;
	int power;
	String name;
	String state = "�븻";

	Unit() {
	};

	Unit(String na, int max, int pw) {
		name = na;
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void init(int max, int pw) {
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void init(String na, int max, int pw) {
		name = na;
		maxhp = max;
		curhp = max;
		power = pw;
	};

	void attack(Unit target) {
		target.curhp -= power;
		System.out.println("[" + name + "] �� " + "[" + target.name + "] ���� " + power + "�� �������� �����ϴ�. ");
		if (target.curhp <= 0) {
			System.out.println("[" + target.name + "] �� ��ġ�߽��ϴ�.");
			target.curhp = 0;
		}
	}

	void printData() {
		System.out.println("[" + name + "] [" + curhp + "/" + maxhp + "] [" + power + "]");
	}
}