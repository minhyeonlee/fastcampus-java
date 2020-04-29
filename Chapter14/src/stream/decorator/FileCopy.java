package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		long milliseconds = 0;

		try (FileInputStream fis = new FileInputStream("dump.txt");
				FileOutputStream fos = new FileOutputStream("copy.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			milliseconds = System.currentTimeMillis();

			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			// fis, fos - > 7460보다 bis,bos 사용시 시간이 줄어든다.
			milliseconds = System.currentTimeMillis() - milliseconds;

		} catch (IOException e) {
			System.out.println(e);
		}

		// 보조 스트림
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		System.out.println("시간: " + milliseconds);
	}

}
