package elemOfopp.day6;
/*
 * final���յ�
 * �������ࡢ���ԡ�����
 * �������ʱ������಻�ܱ��̳У�String ��StringBuffer��System
 * ���η��������ܱ���д:
 * �������ԣ�1�������Ծ���һ�������������ٱ���ֵ��
 * 2�������ô�д�ַ���ʾ
 * 3���˳�������ʹ��Ĭ�ϳ�ʼ��
 * 4�������Եظ�ֵ������顢������
 * 
 * ������static final���Σ�ȫ�ֳ��������Ա��������ã�
 */
public class TestFinal {

}
final class A{
	
}
class C{
	public void name() {
		System.out.println("uu");
	}
}
class D extends C{
	public void name(){
		
	}
}
class E{
	final int I=1;
	public void m1() {
		System.out.println(I);
	}
}