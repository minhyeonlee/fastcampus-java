package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

// 이미 구현된 compare 외 string을 내림차순으로 정렬하기 위해 comparator 사용.
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}

	}

}
