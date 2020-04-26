package lambda;

// 내부에 선언 된 메서드가 익명 함수로 된다.
@FunctionalInterface
public interface MyMaxNumber {

	int getMaxNumber(int x, int y);
}
