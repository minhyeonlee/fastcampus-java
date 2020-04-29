package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		// eclipse에서는 돌아가지 않고 console에서 직접 돌려야 함.
		Console console = System.console();
		
		System.out.println("이름: ");
		String name = console.readLine();
		System.out.println("비밀번호: ");
		char[] password = console.readPassword();

		System.out.println(name);
		System.out.println(password);
	}

}
