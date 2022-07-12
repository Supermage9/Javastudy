package com.unicast;
import java.io.*;
import java.net.*;
public class UnicastServer {
	// ���� ���� ���� Ŭ���̾�Ʈ ���� �޽��� ����
	// ���� ����°� UnicastServer - UnicastThread- UnicastClient
	public UnicastServer() {
		// TODO Auto-generated constructor stub
		ServerSocket server = null;
		try {
				// ���� ���� ����
				server = new ServerSocket(5000);
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("�ش���Ʈ�� ������Դϴ�!");
					System.exit(0);
				}
		try {
			while (true) {
				System.out.println("Server Ready~!");
				Socket socket = server.accept();
				// Ŭ���̾�Ʈ�� �޼����� �ۼ����� �� �ִ� ������ ����
				// ������ ������ Socket�� ���޹޾Ƽ� �����մϴ�.
				// �����带 �����մϴ�!
				//(UnicastServerThreadclass����!)
				
				// ������ ��ü!
				UnicastServerThread thread = new UnicastServerThread(socket);
				// �����带 ��������� ȣ��
				thread.start();// Ŭ���̾�Ʈ�� ��������� �����ؾ� �Ѵ�!
				}
			} catch (IOException ii) {
			// TODO: handle exception
				ii.printStackTrace();
		}
	}// �����ڸ� �ٸ缭 ������ ������ �����.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UnicastServer();
	}

}