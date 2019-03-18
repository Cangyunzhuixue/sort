package elemOfopp.day6;
/*
 * ����ʽ
 * ���ܴ����̰߳�ȫ����
 */
public class TestSingelton1 {
	public static void main(String[] args) {
		Singelton1 s1=Singelton1.getInstacnce();
		Singelton1 s2=Singelton1.getInstacnce();
		System.out.println(s1==s2);
	}
}
class Singelton1{
	//1��˽�л����췽��
	private Singelton1(){
		
	}
	//2������ڲ�����һ��ʵ��
	private static Singelton1 instance=null;
	
	public static Singelton1 getInstacnce() {
		if(instance==null) {
			instance=new Singelton1();
			
		}
		return instance;
	}
}