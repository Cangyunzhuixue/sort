package elemOfopp.day2;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/*
 * �ɱ�������βεķ���
 * 1����ʽ����������...�β���
 * 2���ɱ�������βεķ�����ͬ���ķ���֮�乹������
 * 3���ɱ�����ڵ���ʱ��������0��ʼ��������������
 * 4��ʹ�ÿɱ����βεķ����뷽�����β�ʹ��������һ����
 * 5���������д��ڿɱ�������βΣ���ôһ��Ҫ�����ڷ����βε����
 * 6����һ�������У��������һ���ɱ�������β�
 */

public class anonyousObljest {
public static void main(String[] args) {
	anonyousObljest anonyousObljest=new anonyousObljest();
	anonyousObljest.name(1,"sd");
	anonyousObljest.name(2,"hello","asdasd");
	anonyousObljest.name(1,"123mutour ");
	System.out.println(args.length);
}
/*public void name() {
	System.out.println("hello");
	
}*/
/*public void name(String str) {
	System.out.println("wor");
}//�ɱ�������βεķ���
*/public void name(int j,String ... args) {
	for (int i = 0; i < j; i++) {
		System.out.print(args[i]+" "+"test");
	}
	System.out.println();
}
/*public void name(int i,String...args) {
	
}*/
/*���ϱߵ�һ��
 * 
 * public void name(String[] args) {
	
}*/
}
