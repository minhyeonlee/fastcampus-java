package generic;

public class Plastic extends Material {

	// toString() 메서드 오버라이딩 
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 프린팅합니다.");
		
	}
}
