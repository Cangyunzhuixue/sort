package elemOfopp.day7;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/*
 * �ӿ� ��interface�������ಢ�е�һ������
 * 1�����Կ���һ������ĳ����࣬�ǳ�������󷽷���һ������
 * 2�����û�й�����
 * 3���ӿڶ���ľ���һ�ֹ��ܡ��˹��ܿ��Ա���ʵ�֣�implements��
 * ps:class CC extends DD implement AA
 * 4��ʵ�ֽӿڵ��࣬������д���еĳ��󷽷�������ʵ��������û��ȫ��ʵ�֣��������Ϊһ��������
 * 5�������ʵ�ֶ���ӿ�---java�еļ̳��ǵ��̳е�
 * 6���ӿںͽӿ�֮��Ҳ�Ǽ̳й�ϵ,���ҿ���ʵ�ֶ�̳�
 * 
 */
public class TestInterfance {
	public static void main(String[] args) {
		Duck duck=new Duck();
		TestInterfance.test1(duck);
		TestInterfance.test2(duck);
		TestInterfance.test3(duck);
	}
public static void test1(Runner r) {//Runner r=new Duck();
	r.run();//�޷�ʵ���������ǿ��Ե��÷���
}
public static void test2(Swimmer s) {
	s.swim();//���ⷽ������
	
}
public static void test3(Flier f) {
	f.fly();
}
}
interface Runner{
	public abstract void run();
}


interface Swimmer{
	public abstract void swim();
}


interface Flier{
	public abstract void fly();
}
class Duck implements Runner,Swimmer,Flier{
	@Override
	public void fly() {
		
	}
	@Override
	public void swim() {
		
	}
	@Override
	public void run() {
		
	}
}
















interface AA{
	//����:���еĳ���������public static final����
	public static final int I=12;
	//���󷽷� ���еĶ���public abstract����
	void  method1();
	
}
abstract class BB implements AA{
	
}
class CC implements AA{
	public void method1() {
		
	}
}
class DD extends CC implements AA{
	public void method1() {
		
	}
}
interface MM extends AA{
	void method2();
}





