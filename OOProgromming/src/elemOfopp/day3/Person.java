package elemOfopp.day3;
/*
 * public ���εĳ�Ա�������κη�Χ��ֱ�ӷ��ʣ�ֻ��һ������ɵķ��ʿ��Ƶȼ���
 * ��Ҫע��ģ���ν��ֱ�ӷ�������Ҫ�ȴ�������һ����Ӧ��Ķ���Ȼ��ſ���ʹ�á�������.
 * ��Ա���ķ�ʽ���������Ի�����䷽�������ǳ�����Ϣ��װ�����ص���Ҫһ�㲻�ᳫ�ѳ�Ա����Ϊpublic�ģ�
 * �����췽������Ҫ���ֱ�ӵ��õ���ͨ�������ʺ�����Ϊpublic.
 *protected ���εĳ�Ա���������������С�ͬһ���м������У����������ڲ���ͬһ��������ֱ�ӷ��ʣ�
 *��������λ�ڲ�ͬ���еķ������б�ֱ�ӷ��ʣ�������Ҫ�ر�������
 *��λ�ڲ�ͬ���������б���������Ķ������ֱ�ӷ����丸���protected��Ա��
 *����������Ķ��󷴶����ܷ�������������������protected��Ա\
 *ȱʡ :�������η��ĳ�Աֻ�������������л����ֱ�ӷ��ʣ��ڲ�ͬ���м�ʹ�ǲ�ͬ��������Ҳ����ֱ�ӷ��ʡ�
 *private��Աֻ�����������б�ֱ�ӷ��ʣ���4�ַ��ʵȼ���ߵ�һ����
 */

public class Person {
	private int age;
	protected String name;
	int id=1001;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {// Ĭ�϶���ģ�һ����ʾ���幹��������ʾ�Ĺ����������ṩ������������
		age = 18;
	}

	public Person(int age,String name) {
		this.age = age;
		this.name=name;

	}

}
