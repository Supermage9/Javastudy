package xocex;
import java.net.*;
public class ServerSocketEx {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		// ������ ����ڵ��� ������ �޾Ƶ��̱� ���ؼ� serverSocket�� �ʿ���
		ServerSocket ss = new ServerSocket(3000);
		//������ �����Ǹ� Ŭ���̾�Ʈ�� �ͼ� �����Ҷ����� ������ ��ٷ��� �Ѵ�.
		
		while (true) {
			// Ŭ���̾�Ʈ�� �����Ҷ����� ������ ���!
			Socket s = ss.accept();
			
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip+"���� �����߽��ϴ�.");
			// ���� ������ ���� 
		}
		
	}

}