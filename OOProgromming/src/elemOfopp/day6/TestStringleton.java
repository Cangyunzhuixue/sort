package elemOfopp.day6;
/**
 * ����ʽ
 * ���������ģʽ��
 * 1����������⣬�ǵ�һ����ֻ�ܴ���һ������
 * 2�����ʵ��
 * @author Administrator
 *
 */
public class TestStringleton {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
	Singleton s2=Singleton.getInstance();
	System.out.println(s1==s2);
}
}
//ֻ�ܴ���Singleton�ĵ���ʵ��
class Singleton{
	//1��˽�л�������,����ⲿ���ܵ��ù�����
	private Singleton() {
		
	}
	//2������ڲ�����һ�����ʵ��
	private static Singleton instance=new Singleton();
	//3��˽�л��˶���ͨ����������������
	//4���˹����ķ�����ֻ��ͨ���������ã�������ó�static��ͬ�����ʵ��Ҳ����Ϊstatic������
	public static Singleton getInstance() {
		return instance;
	}
}
