package com.netex;
import java.net.*;
public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InetAddress ��ü�� �����ڰ� �ƴ� static�޼ҵ带 �̿��ؼ� ��ü�� �����Ѵ�.
		try {
			InetAddress ipinfo1= 
					InetAddress.getByName("www.naver.com");
			//ip�ּ� ������
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip�ּ�"+ip);
			
			InetAddress[] ipArray = 
					InetAddress.getAllByName("www.naver.com");
			for(InetAddress tempip: ipArray) {
				System.out.println(tempip);
			}//���̹��� ������ �ִ� �������� ip�� ���´�. (2������ ���´�!)
			
			// ���� ���� ��ǻ�� ip ����
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("My ip  : "+myHost.getHostAddress());// ȣ��Ʈ�� �ּҰ� ���´�!
			System.out.println("host name"+myHost.getHostName());// ȣ��Ʈ�� �̸��� ���´�!
			System.out.println(myHost);// �̸��� ȣ��Ʈ �ּҰ� ���� ���´�!
			//������ ip�ּҰ� ���´�.
			//cmd������ ipconfigġ�鳪���ϱ� ���غ���
			
		} catch (UnknownHostException uhe) {
			// TODO: handle exception
			// ȣ��Ʈ �̸��� ã�� ��������쿡���ִ� ����ó��
			uhe.printStackTrace();
		}
	}

}