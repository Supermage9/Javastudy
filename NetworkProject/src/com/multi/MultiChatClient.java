package com.multi;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultiChatClient implements Runnable, ActionListener {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	//�α��� �г�
	private JPanel loginPanel;
	//�α��� ��ư
	private JButton loginButton;
	//��ȭ�� 
	private JLabel label1;
	// ��ȭ�� �Է� �ؽ�Ʈ �ʵ�
	private JTextField idInput;
	//�α׾ƿ� �г�
	private JPanel logoutPanel;
	//�α׾ƿ� ��ư
	private JButton logoutButton;
	//��ȭ�� 
	private JLabel label2;
	// �Է��г� ����
	private JPanel msgPanel;
	//�Է� �ؽ�Ʈ �ʵ�
	private JTextField msgInput;
	// �����ư
	private JButton exitButton;
	//���� ������ â
	private JFrame jframe;
	// ä�ó��� ����� â
	private JTextArea msgOut;
	// ī�� ���̾ƿ�
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	// ���� �÷���
	boolean status;
	
	
	
	public MultiChatClient(String ip) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		// �α��� �г� ����
		loginPanel = new JPanel();
		// ���̾ƿ� ����
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("�α���");
		loginButton.addActionListener(this);
		
		// ��ȭ�� ��
		label1= new JLabel("��ȭ��");
		// �гο� ���� ���̾ƿ� ����
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		//�α׾ƿ� �г� ����
		logoutPanel = new JPanel();
		// ���̾ƿ� ����
		logoutPanel.setLayout(new BorderLayout());
		label2 = new JLabel();
		logoutButton = new JButton("�α� �ƿ�");
		logoutButton.addActionListener(this);
		logoutPanel.add(label2,BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		//�Է��г� ����
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		
		msgInput.addActionListener(this);
		
		exitButton = new JButton("����");
		exitButton.addActionListener(this);
		
		msgPanel.add(msgInput,BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		//�α���,�α׾ƿ� �г� ������ ���� ī�� ���̾ƿ�
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel,"login");
		tab.add(logoutPanel,"logout");
		
		// ���� ������ ����
		jframe =  new JFrame("��Ƽ ä�� ���α׷�");
		msgOut = new JTextArea("",	 10, 30);
		msgOut.setEditable(false);// ���â�� �޼��� ����Ұ�
		
		// ���� ���ڷѹٴ� �׻� ��Ÿ����, ���� ��ũ�ѹٴ� �ʿ�ÿ��� ��Ÿ���� �Ѵ�
		JScrollPane jsp = new JScrollPane(msgOut,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		clayout.show(tab, "login");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		// �����ư ó��
		if(obj == exitButton) {
			System.exit(0);
		}else if(obj == loginButton) {
			id = idInput.getText();
			label2.setText("��ȭ��"+id);
			clayout.show(tab, "logout");
			// ������ ����޼ҵ� ȣ��
			connectServer();
		}else if(obj == logoutButton) {
			// �α׾ƿ� �޼��� ����
			outMsg.println(id+"/"+"logout");
			// ��ȭâ Ŭ����
			msgOut.setText("");
			// �α��� �гη� ��ȯ
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (IOException ee) {
				// TODO: handle exception
				ee.printStackTrace();
			}
			status = false;
			
		}else if(obj ==msgInput) {
			//�޼��� ����
			outMsg.println(id+"/"+msgInput.getText());
			// �Է�â �ʱ�ȭ(Ŭ����)
			msgInput.setText("");// ����� �̺�Ʈ�� �Ͼ�� ��...
		}
		
	}
	public void connectServer() {
		try {
			socket = new Socket(ip, 4000);
			System.out.println("[Client]Server ���Ἲ��~!");
			// ����� ��Ʈ�� ����
			inMsg =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg =new PrintWriter(socket.getOutputStream(),true);
			// ������ �α��� �޼����� ����
			outMsg.println(id+"/"+"login");
			// �޼��� ������ ���� ������ ����
			thread  = new Thread(this);
			thread.start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[MultiChatClient]connectServer()Exception �߻�...");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ���� �޼����� ó���ϴ� ���� 
		String msg;
		String[] rmsg;
		status = true;
		while(status) {
			try {
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				// JTextArea�� ���ŵ� �޼��� �߰�
				msgOut.append(rmsg[0]+">"+rmsg[1]+"\n");
				// Ŀ���� ���� ��ȭ �޼����� ǥ��
				msgOut.setCaretPosition(msgOut.getDocument().getLength());
				
			} catch (IOException e) {
				// TODO: handle exception
				status = false;
			}
		}
		System.out.println("[MultiChatClient]"+thread.getName()+"�����");
		
	}
	public static void main(String[] args) {
		new MultiChatClient("192.168.0.17");// �ڱ��ڽ�
		
	}

}