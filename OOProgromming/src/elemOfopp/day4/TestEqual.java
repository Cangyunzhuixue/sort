package elemOfopp.day4;

/*
 * �����������ͱȽ�ֵ�������������Ϳ��Բ�ͬ���ڲ�ͬ�����Ҳ���Է���true
 * �����������ͣ��Ƚ��������ͱ����ĵ�ֵַ�Ƿ����
 * equalֻ�ܴ����������ͱ���
 * ��Object,����equals������Ȼ�Ƚ��������ñ����ĵ�ֵַ�Ƿ����
 * 
 */

public class TestEqual {
public static void main(String[] args) {
	String str11=new String("a");
	String str21=new String("a");
	System.out.println(str11==str21);//equals()
	System.out.println(str11.equals(str21));//��String����д��
	
	String string="aa";
	String string2="aa";
	String string3=new String("aa");
	System.out.println(string==string2);
	System.out.println(string.equals(string3)+"#");
	
	String str = "abc";//�ڳ������д���abc
	String str1 = "abcd";//�ڳ������д���abcd
	String str2 = str+"d";//ƴ���ַ�������ʱ���ڶ����½�һ��abcd�Ķ�����Ϊstr2����֮ǰ��δ֪��
	String str3 = "abc"+"d";//ƴ��֮��str3����abcd�����Ի��ǻ�ָ���ַ��������ص��ڴ��ַ
	System.out.println(str1==str2);//false
	System.out.println(str1==str3);//true
	
	
	
}
private void pub() {
	int i=12;
	int j=12;
	char c=12;
	float f=12.0f;
	int k=65;
	char a='A';
	System.out.println(i==j);
	System.out.println(c==f);
	System.out.println(k==a);
	Object obj1=new Object();
	Object obj2=new Object();
	System.out.println(obj1);
	System.out.println(obj2);
	System.out.println(obj1==obj2);
	// TODO Auto-generated method stub
	
	
	

}
}
