package elemOfopp.day6;
/*
 * abstract�û��������࣬����
 * �����಻����ʵ����,�й������������඼�й�������
 * abstract ��������private final tataic
 * 
 * 
 * ���ǰɷ�����ʱ��û�з����壬�磺public abstract void eat();
 * ���󷽷�ֻ���������Ĺ��ܣ�����ִ�н�������
 * ���󷽷�����һ���ǳ�����
 * ������̳��˳����࣬����д�����еĳ��󷽷���������ǡ�ʵ���ࡱ��������ʵ����
 * ������̳��˳����࣬��û����д�����еĳ��󷽷���˵����������Ȼ�г��󷽷�������Ϊ������
 * ******ע������д����(��������ĸ���)
 */
public class TestAbstract {
public static void main(String[] args) {
	Student  p1=new Student();
	p1.eat();
	p1.getName();
}
}
abstract class Creator{
	abstract void breath();
}
	
abstract class Person extends Creator{
	String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void eat();

	public abstract void walk();
}

 class Student extends Person {
	public void breath() {
		
	}
	public void eat() {

	}

	public void walk() {

	}
}