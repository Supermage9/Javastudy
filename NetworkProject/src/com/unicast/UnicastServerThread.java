package com.unicast;
import java.io.*;
import java.net.*;
	// Ŭ���̾�Ʈ�� ����� ���� ��ü�� ������ ������, ������ �����ϰ� ����� ����ϴ� Ŭ���� �̴�!
	// ���� ����°� 
public class UnicastServerThread extends Thread{
	// ������ ���� ���޵� socket�� �����մϴ�.
	Socket socket = null;
	BufferedReader br= null;
	BufferedWriter bw= null;
	// ��ü�� ������ socket�� ���� �޾Ƽ� ��������� �����մϴ�.
	// �����ڸ� 
	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}
	//run override�ϱ�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		//��Ʈ�� ���� 
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//get input stream �ؼ� ������ ������ �о�帰��?
		bw =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		// Ŭ���̾���� �޼����� �ۼ�����
		while(true) {
			// Ŭ���̾�Ʈ�� ���� �޼����� �����մϴ�
			String msg =br.readLine();
			System.out.println(msg);
			// Ŭ���̾�Ʈ�� �޼����� �����ϴ�.
			bw.write(msg+"\n");
			bw.flush();// �̸޼����� �̿��ؼ� ���۸� ����ϴ�.
			}
		}catch(IOException e){
			// ������ ���������� ����  �� �ִ� ��Ȳ
			//Ŭ���̾���� ������ ������ ��� ���ܰ� �߻���
			InetAddress ip = socket.getInetAddress();
			// �ּҸ� �޾ƿɴϴ�.
			String address= ip.getHostAddress();
			System.out.println("["+address+"]���� ������ ���������ϴ�.");
		}
	}
}