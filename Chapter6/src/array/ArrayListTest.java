package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		// java.util package 밑에 ArrayList class가 있다.
		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// list.size() -> 값이 들어간 개수
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); // String으로 넣어서 String으로 꺼내옴.
			System.out.println(str);
		}

		// enhanced for
		for (String s : list) {
			System.out.println(s);
		}
	}

}
