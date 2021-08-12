package object;

class A {
	char ch;

	public A(char ch) {
		this.ch = ch;
	}
}

public class Stringorg {
	public static void main(String[] args) {

		A type1 = new A('¡Ú');
		A type2 = new A('¡Ú');

		System.out.println(type1);
		System.out.println(type2);

		System.out.printf("%xh\n", type1.hashCode());
		System.out.printf("%xh\n", type2.hashCode());

		String str = "korea";
		System.out.println(str.equals("korea"));

	}
}
