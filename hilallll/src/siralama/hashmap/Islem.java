package siralama.hashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Islem {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Mustafa");
		map.put(2, "Hilal");
		map.put(5, "Cemal");
		map.put(3, "Cemal");
		map.put(4, "Cemal");
		System.out.println(map);
		map.put(5, "þeyma");
		map.put(6, "serra");
		map.put(3, "beng");
		System.out.println(map);
		System.out.println("map5:" + map.get(5));
		map.entrySet();
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> type = it.next();
			System.out.print(type.getKey() + "=>>>");
			System.out.println(type.getValue());

		}
		System.out.println("**********");

		Map<String, String> kisiler = new TreeMap<>();
		kisiler.put("123", "mustafa");
		kisiler.put("456", "Hilal");

		for (Entry<String, String> veri : kisiler.entrySet()) {
			System.out.println(veri.getKey() +":"+ veri.getValue());
		}

		for (String veri : kisiler.keySet()) {
			System.out.println(veri);
		}
		System.out.println("java 1.8");
		kisiler.forEach((k, v) -> System.out.println("value:" + v));
		kisiler.forEach((k, v) -> System.out.println("key:" + k));
	}
}
