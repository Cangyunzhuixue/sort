package elemOfopp.day1;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "xiao";
		person.age = 12;
		person.showAge();
		person.study();
		person.addAge();
		person.showAge();
		Person person2=new Person();
		person2.age = 19;
		person2.showAge();
		person2.study();
		person2.addAge();
		person2.showAge();
	}

}

class Person {
	String name;// �ɆT׃����������г�ʼֵ

	int age;
	boolean sex;

	// ����
	public void study() {
		System.out.println("studying");
	}

	public void showAge() {
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	public void addAge() {
		int i = 2;// �ֲ�׃���]��������c���ڷ�������ͬ�����ʼֵ
		age += i;
	}
}