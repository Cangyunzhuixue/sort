package elemOfopp.day6;



/*
 *��������ֵ�Ĳ�����1��Ĭ�ϵĳ�ʼ����2����ʾ�ĳ�ʼ�����ߴ�����ʼ����˳��ִ�У���3���������У�4������
 *
 *��ĵ��ĸ���Ա����ʼ��������飩
 *�������������Σ���ôֻ��ʹ��static
 *���ࣺ
 *1.��̬�����
 *������������
 *������ļ��ض�����
 *ֻ����һ��
 *˳��ṹִ��
 *�����Ǿ�ִ̬��
 *��̬�������ֻ��ִ�о�̬�Ľṹ�������ԣ��෽����
 *
 *
 *2.�Ǿ�̬����飺
 *���Զ�������Խ��и�ֵ��ͬʱ���Ե��ñ��������ķ���
 *��߿�����������
 *һ�����п����ֶ���Ǿ�̬����飬˳��ṹִ��
 *ÿ����һ�����󣬷Ǿ�̬��������һ��
 *�Ǿ�̬������ִ��Ҫ���ڹ�����
 *
 *����鶼��ִ�и����
 *
 */
public class Testorder {
public static void main(String[] args) {
	Order o1=new Order();
	System.out.println(o1);
	System.out.println();
	Order o2=new Order();
	System.out.println(o2);
}
}


class Order{
	private int orderId;
	private String OrderName;
	private static String orderDec;
	//��ʼ����
	{
		orderId=1002;
		OrderName="AA";
		System.out.println("i am in");
	}
	{ 
		orderId=1003;
		OrderName="AA";
		System.out.println("2 ");
	}
	static {
		orderDec="sda";
		System.out.println("static");
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		OrderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	@Override
	public String toString() {
		return "order [orderId=" + orderId + ", OrderName=" + OrderName + "]";
	}
	
}