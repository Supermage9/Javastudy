package com.multi;
import java.io.*;
import java.net.*;
import java.util.*;//array list������
public class MultiChatServer {

	private ServerSocket ss = null;
	private Socket s  = null;
	
	// ����� Ŭ���̾�Ʈ �����带 �����ϴ� arraylist
	ArrayList<ChatThread>chatlist = new ArrayList<ChatThread>();
	//multi ä���� ���� ���α׷�
	public void start() {
		
		try {
			// �������� ����
			ss= new ServerSocket(4000);
			System.out.println("Server start");
			// ���� ������ ���鼭 Ŭ���̾�Ʈ ������ ��ٸ���.
			while(true) {
				s= ss.accept();
				//����� Ŭ���̾�Ʈ ���� ������ ����
				ChatThread chat = new ChatThread();
				//Ŭ���� ��Ʈ �������� ������ �߰�
				chatlist.add(chat);
				// ������ ����
				chat.start();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[MultiChatServer]start() Exception�� �߻��߽��ϴ�.");
		}
	}
	// �� Ŭ���̾�Ʈ ������ ���� ������ Ŭ���� ����
	class ChatThread extends Thread{
		
		// ���� �޼����� �Ľ� �޼��� ó�� �ϴ� ���� ����
		String msg;
		String[] rmsg;
		//����� ��Ʈ������
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			boolean status= true;
			System.out.println("##Chat Thread start");
			try {
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(),true);// �ڵ����� �����Ѵ�.
						// ���������� true���  ������ ���鼭 ����� ���׼� ���ŵ� �޼��� ó����
						while(status) {
							// ���ŵ� �޼����� msg������ ������
							msg= inMsg.readLine();
							// '/'�� �����ڸ� �������� �޼��� ���ڿ� �迭�� �Ľ���
							rmsg = msg.split("/");
							
							//�Ľ̵� ���ڿ� �迭�� �ι�° ��� ���� ���� ó��
							
							//�α� �θ޼����϶� 
							if(rmsg[1].equals("login")) {
								msgSendAll("server/"+rmsg[0]+"���� �α��� �߽��ϴ�.");
							}
							// �α� �ƿ��޼����϶�
							else if(rmsg[1].equals("logout")) {
								chatlist.remove(this);
								msgSendAll("server/"+rmsg[0]+"���� ���� �߽��ϴ�.");
								// �ش� Ŭ���̾�Ʈ ������ ����� ���� status�� false�� ����
								status = false;
							}
							// �׹��� �޼��� �϶� 
							else {
								msgSendAll(msg);
							}
						}
						//������ ����� Ŭ���̾�Ʈ ������ ���� ������ �������� ���ͷ�Ʈ�� �߻�
						this.interrupt();
						System.out.println("##"+this.getName()+"stop!!!!!!!!!");
				
						} catch (IOException ii) {
							// TODO: handle exception
							chatlist.remove(this);
							System.out.println("[ChatThread] run() IOException�߻�");
						}
				}
		}
					// ����� ��� Ŭ���̾�Ʈ���� �޼����� ���� �ϴ� ��� ����
				public void msgSendAll(String msg) {
					for(ChatThread ct : chatlist) {
						ct.outMsg.println(msg);
					}
				}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		MultiChatServer ser = new MultiChatServer();
		ser.start();
	}

}