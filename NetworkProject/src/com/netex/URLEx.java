package com.netex;
import java.io.*; // ������� �ؾ��ϴϱ�
import java.net.*; // ��Ʈ��ũ ��� ����!
public class URLEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// URL - (uniform resource locator)�� ���� ������ ������ �ִ� Ŭ���� 
		// �������� , ȣ��Ʈ�� , ��Ʈ��ȣ , �ڿ��� ��� , ������Ʈ������ ������ ��´�.
		
		BufferedReader br= null;// �о�;��ϴϱ�!
		try {
			URL url = new URL("http://www.naver.com/index.html");// �̰Ϳ� ���� ������ �˾ƺ���ʹ�
			System.out.println("�������� :"+url.getProtocol());
			System.out.println("ȣ��Ʈ : "+url.getHost());
			System.out.println("��Ʈ��ȣ : "+url.getPort());
			System.out.println("�ڿ��� ��� : "+url.getPath());
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		
				}catch (MalformedURLException e) {
					// TODO: handle exception
					// url�� �߸����������� 
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally {
					try { if(br!=null)
						br.close();
				} catch (IOException ee) {}
				
			}
		}
	}