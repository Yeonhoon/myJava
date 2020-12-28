package MyPrac;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map <String, String> myMap = new HashMap<>();
		
		// put: 맵 입력. key-value 순으로 입력
		myMap.put("id", "jyhoon94");
		myMap.put("pw", "Zpflrjs94!");
		myMap.put("Tier", "Bronze...");
		
		
		
		// get: 맵 호출. 호출 시 key 값 입력
		System.out.println(myMap);
		System.out.println(myMap.get("pw"));
		System.out.println("Tier: "+myMap.get("Tier"));

	}
}
