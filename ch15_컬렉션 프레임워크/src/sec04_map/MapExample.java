package sec04_map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {

		Map<String, String> map= new HashMap<>();
	
		// ��밡���� ������ü: AbstractMap, Attributes, AuthProvider, ConcurrentHashMap, ConcurrentSkipListMap, EnumMap, HashMap, 
		// Hashtable, IdentityHashMap, LinkedHashMap, PrinterStateReasons, Properties, Provider, RenderingHints, SimpleBindings, TabularDataSupport, TreeMap, UIDefaults, WeakHashMap
	
		map.put("id", "winter");
		map.put("name","�Ѱܿ�");
		map.put("age","30");
		System.out.println(map.size());
	
		String id = map.get("id");
		String name = map.get("name");
		String age = map.get("age");
	}
}
