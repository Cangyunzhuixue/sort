package elemOfopp.day5;

import org.junit.Test;

public class TestWrapper {
	@Test // �������͡���װ����String��֮���ת��
	//����������͡����b�to String���{��String�����d��valueof()����
	public void test2() {
		int i1 = 10;
		String str1 = i1 + "";
		String str2 =String.valueOf(i1);
		String str3 =String.valueOf(true);
		System.out.println(str3);
		
		
		
		//String-->����������ͣ����b�
		int i3=Integer.parseInt(str2);
		System.out.println(i3);
		boolean b2=Boolean.parseBoolean(str3);
	

	}

	@Test
	public void test1() {
		int i = 1;
		System.out.println(i);
		boolean b = false;
		Integer i1 = new Integer(i);
		int i2 = i1.intValue();

		System.out.println(i1.toString());
		Boolean b1 = new Boolean(true);
		boolean b3 = b1.booleanValue();

		System.out.println(b1);
		Float float1 = new Float("12.7f");
		float f2 = float1.floatValue();

		System.out.println(float1);
		Boolean b2 = new Boolean("false");
		System.out.println(b2);
		System.out.println(new Boolean("true"));
		System.out.println(new Boolean("trueasdas"));
		System.out.println(new Boolean(true));

		int i4 = 14;
		Integer i5 = i4;// �Զ�װ��
		int i6 = i5;// ��������

	}
}
