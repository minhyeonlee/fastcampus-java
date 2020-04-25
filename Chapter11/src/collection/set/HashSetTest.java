package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		// HashSet은 중복을 허용하지 않는다.
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");

		System.out.println(set);

		Iterator<String> ir = set.iterator();

		// hasNext는 다음 요소가 있는지 boolean으로 리턴
		while (ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}

	}

}
