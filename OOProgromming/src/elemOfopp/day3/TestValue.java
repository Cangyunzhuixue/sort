package elemOfopp.day3;
/*
 * �������������ͻ����������ͣ��������ݵĶ���ֵ
 * �ڷ����������ľֲ���������������ͷŵ�����value2;
 * 
 */
public class TestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestValue t = new TestValue();
		t.first();
	}
	
	public void first() {
		int i=1;
		Value value=new Value();
		value.i=25;
		second(value,i);
		System.out.println(value.i);
	}

	public void second(Value value,int i) {//���value���ϱߵ�valueֻ��ָ���ַһ��
		i=0;
		value.i=20;
		Value value2=new Value();
		value=value2;
		System.out.println(value.i+" "+i);
	} 

}

class Value {
	int i = 15;
}
