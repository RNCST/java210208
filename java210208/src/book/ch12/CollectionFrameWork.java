package book.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFrameWork {
	
	List<String> li = new ArrayList<>();
	Map<String , Object> map = new HashMap<>();
	
	public void List() {
		li.add(0, "사과");
		li.add(1, "포도");
		li.add("키위");
		for(String s : li) {
//			System.out.print(s + " ");
			System.out.print(s + " ");
			System.out.println(li);
		}
	}
	
	public void map() {
		map.put("1", "사과");
		map.put("2", "포도");
		map.put("3", "키위");
		Object keys[] = null;
		Object values[] = null;
		keys =map.keySet().toArray();
		values = map.values().toArray();
		map.values();
		for(int i=0;i<keys.length;i++) {
		System.out.print(keys[i]+" ");
		System.out.print(values[i]+" ");
		System.out.println(map.values());
		}
	}
	
	public static void main(String[] args) {
		CollectionFrameWork cf = new CollectionFrameWork();
		cf.List();
		System.out.println("===================");
		cf.map();

	}

}
