package elemOfopp.day5;
/*
 * static ��̬�ģ����������������ԣ�����������飨��ʼ���飩���ڲ���
 * static�������ԣ����������
 * 1�����ഴ�������ж��󣬶�����һ������
 * 2��������һ������Դ����Խ����޸ģ��ᵼ����������Դ����Ե�һ������
 * vsʵ����������static���ε����ԣ�����һ���Լ����Եĸ�����
 * 3�������������ļ��ض����صģ����Ҷ�һ��
 * 4����̬�����������������ã�SportMan.nation
 * 5��������ļ���Ҫ���ڶ�������������Ŷ���Ĵ����������صģ���
 * �ж���֮�����ͨ��������.������������ǡ��ࡤʵ�����������еĵ�
 * 6������������ھ�̬���У������ж���������
 * 
 * >��̬�ķ������ǲ�������this��supper��
 * static���η������෽������
 * 1��������ļ��ض����أ����ڴ���Ҳ�Ƕ�һ��
 * 2������ֱ��ͨ�����ࡤ�෽��������
 * 3���ھ�̬�����ڲ������Ե��þ�̬���Ժ;�̬���������ܵ��÷Ǿ�̬�����Ժͷ���;
 * ��֮���ڷǾ�̬��������ǿ��Ե��þ�̬�����Ժͷ�����
 * 
 * ע����̬�Ľṹ��static�����ԡ�����������졢�ڲ��ࣩ����������Ҫ���ڷǾ�̬���ṹ
 * ͬʱҲ���ձȷǾ�̬����
 */
public class TestSport {;

	public static void main(String[] args) {
		SportMan s1=new  SportMan("Samuro", 24);
		SportMan s2=new SportMan("Zhandi", 15);
		s1.name="haoren";
		s1.nation="China";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(SportMan.nation);
		s1.show1();
		SportMan.show2();
		s1.show2();
	}

}
class SportMan{
	String name; 
	int age;
	static String nation;
	public SportMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.nation="zg";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "SportMan [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	public void show1() {
		
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub
	}
	public static void show2() {
		System.out.println(nation);
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub
	}
	private static void publ() {
		System.out.println("jingtaoyanshi");
		// TODO Auto-generated method stub

	}
}
