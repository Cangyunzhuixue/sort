package elemOfopp.day3;
/*
 * �ס�����̳и���֮�� �����������������ԡ�����������Ϳ��Եõ�
 * ÿ�ε������࣬�����Զ����и���Ĺ��캯������˲���̳и��๹�캯��
 * ��ȷ���·�������˽�е����Ի򷽷���ʱ������ͬ�����Ի�ȡ�õ���ֻ�����ڷ�װ�Ե����
 * �ǵ����಻����ֱ�ӵ���
 * ������˻�������Ľṹ֮�⣬�����Զ����Լ����еĳɷ�
 * ����ֻ�ܵ��̳У�һ������ֻ�ܼ̳�һ�����࣬��������ж������
 * ������������д
 * 1��ǰ�ᣬ������̳и���
 * 2������̳и���֮�������ã���ô������ԶԸ�����д��override,overwirte�������ǣ���������һ�����������ݲ���
 * 3������Ҫ�������ķ������������� �������������б����븸��ķ���һ��
 *        ��������η�����С�ڸ�������η�
 *        ������ķ����쳣�������׳����쳣���ܴ��ڸ����
 *        �¸�·��������ͬΪstatic���static
 */
public class TestExtends {
private int sex;
private int salary;

public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getSalasry() {
	return salary;
}
public void setSalasry(int salasry) {
	this.salary = salasry;
}
public TestExtends() {
	
}
public TestExtends(int sex, int salasry) {
	this.sex = sex;
	this.salary = salasry;
}
public void manOrWomen() {
	if (sex==1) {
		System.out.println("man");
	}else if(sex==0){
	System.out.println("women");	
	}else {
		System.out.println("flase");
	}
}
public void employeed() {
	if (salary==1) {
		System.out.println("no job");
	}else {
		System.out.println("job");
	}
}

}
