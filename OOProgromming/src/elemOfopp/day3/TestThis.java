package elemOfopp.day3;
/*
 * this:
 * ���������������ԡ�������������
 * �������Ϊ��ǰ��������ڴ����ĵĶ�������this.name,this.show();
 * �����ڹ�������ͨ��this���βΣ��ķ�ʽ��ʾ���ñ������������ص�ָ���Ĺ�����
 * 
 */
public class TestThis {
public static void main(String[] args) {
	TriAngle triAngle=new TriAngle();
	triAngle.setBase(2.3);
	triAngle.setHeight(1.2);
	System.out.println(triAngle.getArea());
}
}
class TriAngle{
	private double base;
	private double height;
	public   TriAngle() {
		// TODO Auto-generated constructor stub() {
		this.base=1.0;
		this.height=2.0;
		
	}
	public   TriAngle(double base) {
		// TODO Auto-generated constructor stub() {
		this.base=1.0;
		this.height=2.0;
		
	}
	public  TriAngle(double base,double height) {
		this(base);//����������ʽ�ص��õ�ǰ������صĹ�����
	}
	public double getBase() {
		return base;

	}
	public double getHeight() {
		return height;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return this.base*this.height/2;
	}
}