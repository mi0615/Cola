package network1.basic;

import java.io.*;
import java.net.*;

public class SimpleServer {
	
	public final static int PORT = 5000;	// PortNumer : 1024 ~ 2의 16승   0~1024포트번호는 정해져있어서 사용하면 안됨
	
	public static void main( String args[] ) {
		
		ServerSocket 		server = null;
		DataInputStream 	in = null;
		DataOutputStream out = null;
		Socket clientSocket = null;
		
		try{
			// 1. 서버 소켓 생성
			server = new ServerSocket( PORT );
			System.out.println("SimpleServer started..");
		
			// 2. 클라이언트 접속시 소켓 생성
			// 3. 소켓의 입출력 스트림 얻기
			clientSocket = server.accept(); 
			in = new DataInputStream( clientSocket.getInputStream());
			out = new DataOutputStream( clientSocket.getOutputStream() );
		
			// 4. 데이터 전송
				String line = in.readUTF();
				System.out.println("we received : " + line );
				if( line.compareTo("안녕") == 0 ) { //line.equals("안녕")
					out.writeUTF("짝궁님 오늘 뭐먹어요?" );	
				} else {
					out.writeUTF("배고파요.");
				}
		
			// 5. 소켓닫기
			in.close();
			out.close();
			clientSocket.close();
		} catch ( Exception ex ) {
			System.out.println( ex.getMessage() );	
		}
	}	
}