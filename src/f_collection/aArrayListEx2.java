package f_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		ArrayList<String>  list = new ArrayList(4);
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정   <String>
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);    // generics 안쓰면 (String)list.get(i)불가
			System.out.println(str);
		}
		for(String msg : list) {
			System.out.println(msg);
		}
		
		list.set(0, "tiger");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);

	}
}
