package elemOfopp.day3;
/*
 * ������͸�����ͬ�����ԣ�����ͨ��super.��������ʾ����
 * ��д֮�󣬵��ø���ķ�����Ҫ����super
 * super���ι�������ͨ����������ʹ��super���β��б�����ʾ���ø�����ָ���Ĺ�����
 * �ڹ������ڲ���super���β��б�����Ҫ�������׺���
 * �ڹ������ڲ���this���β��б���super���β��б�ֻ�ܳ�����һ��
 * �ڹ�����������ʾ����this���β��б���super���β��б���Ĭ�ϵ��õ��¸���ĿղεĹ�����
 */
public class Student extends Person{
private String schoolName;
int id;
public Student() {
	super();
}
public  Student(String schoolName) {
	super(12,"samuro");
    this.schoolName=schoolName;
}
public void name() {
	System.out.println(this.id);
	System.out.println(super.id);
	System.out.println(super.name);
	System.out.println(this.schoolName);
	
}
}
