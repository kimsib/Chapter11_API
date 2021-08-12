package object;

import java.util.HashMap;

class key {
	public int number;

	public key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
	if(obj instanceof key) {
		key compareKey = (key)obj;
	if(this.number == compareKey.number) {
		return true;
	}
}
	return false;
}
}
public class KeyExample {
	public static void main(String[] args) {

		HashMap<key, String> hashMap
		= new HashMap<key, String>();
		
		
		
		hashMap.put(new key(1), "ȫ�浿");
		
		String value = hashMap.get(new key(1));
		System.out.println(value);
		

	}
}
