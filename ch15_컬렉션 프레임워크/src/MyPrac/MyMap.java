package MyPrac;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map <String, String> myMap = new HashMap<>();
		
		// put: �� �Է�. key-value ������ �Է�
		myMap.put("id", "jyhoon94");
		myMap.put("pw", "Zpflrjs94!");
		myMap.put("Tier", "Bronze...");
		
		
		
		// get: �� ȣ��. ȣ�� �� key �� �Է�
		System.out.println(myMap);
		System.out.println(myMap.get("pw"));
		System.out.println("Tier: "+myMap.get("Tier"));

	}
}
