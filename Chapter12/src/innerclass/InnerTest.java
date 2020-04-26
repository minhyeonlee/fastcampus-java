package innerclass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	// 인스턴스 내부 클래스
	class InClass {
		int iNum = 100;

		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(iNum);
		}

	}

	public void usingInner() {
		inClass.inTest();
	}
	
	// OutClass가 생성 여부와 상관 없이 사용 가능.
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		// 일반 메서드 
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		// static 메서드
		static void sTest() {
			// InStaticClass가 불린 이후에 쓸 수 있는 inNum은 static 메서드에서 아용 불가 
			// System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingInner();

		// Inner Class를 직접 생성(잘 사용하지 않음)
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}

}
