package com.unicast;
//Ŭ���̾�Ʈ Ŭ���� 
import java.io.*;
import java.net.*;
// Ŭ���̾�Ʈ�� �����尡 �ʿ�����
public class UnicastClient {
	Socket socket = null;
	BufferedReader br= null;
	BufferedWriter bw= null;
	
	BufferedReader keyboard = null;
	
	public UnicastClient() {
		// TODO Auto-generated constructor stub
		try {
			// ���� ����
			socket = new Socket("localhost",5000);
			
			// ������ã�� �� ���� ��� ������ ������ ���������
		} catch (UnknownHostException ue) {
			// TODO: handle exception
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("������ ������ �� �����ϴ�.");
			System.exit(0);
		}
		try {
			//��Ʈ�� ���� 
			
			// keyboard�� �̿��ؼ� 
			keyboard = new BufferedReader(
					new InputStreamReader(System.in));
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		
			// �޼����� �ְ� ����
			while(true) {
				// Ű����� ���� �Է��� ���� �б� 
				System.out.println("���۸޼��� : ");
				String msg = keyboard.readLine();
				// �޼����� ������ ����
				bw.write(msg+"\n");
				bw.flush();// ���۸� ����.
				String getMsg= br.readLine();
				System.out.println("���ŵ� �޼��� : "+getMsg);
				}
			}catch(IOException e){
				//Ŭ���̾�Ʈ�� ������ ������ ��� ���ܰ� �߻���
				System.out.println("������ ������ �� �����ϴ�.");
				System.exit(0);
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new UnicastClient();
	}

}