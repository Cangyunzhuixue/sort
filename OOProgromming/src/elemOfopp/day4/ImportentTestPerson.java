package elemOfopp.day4;
/*
 * ��̬��
 * 1��ָ���ǣ�һ������Ķ��ֱ�����̬
 *  1�����غ���д 2���������Ķ�̬��
 * 2���������Ķ�̬��ʹ��ǰǰ��1��Ҫ���۵ļ̳� 2��Ҫ������Ը��෽������д
 * 3�������Χ����״̬������״̬
 *   ���ڶ�̫����˵������ʱ����ߣ��������ñ�������Ǹ��������
 *   ����ʱ���ұߣ���ע�������Ķ���ʵ�壺����Ķ�����ôִ�е��������д
 * 4�������������Բ����ڶ�̬�Ե�,������������������
 * 
 */
public class ImportentTestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.eat();
		
		Man man=new Man();
		man.eat();
		
		//�������Ķ�̬�ԣ����������ָ���������
		Person person2=new Man();
		/*
		 * ���ⷽ�����ã����˶�̬�Ժ�ͨ�����������ָ������Ķ���ʵ�壬�����÷����ǣ�
		 * ʵ��ִ�е���������д����ķ��� 
		 */
		person2.eat();
		Person person3=new Women();//����ת��
		System.out.println("%"+person3.id);
		person3.eat();
		Women women=(Women)person3;//����ת��
		System.out.println(women.id+"*");
		women.makeLove();
		women.eat();
		/*
		 * women����ת��man �������ǿ��ת������
		 * ���жϣ�instanceof
		 * ��ʽ������a instanceof ��A ���ж϶���a�Ƿ�����A��һ��ʵ�����ǵĻ�
		 * ����true�����򷵻�false
		 * ��a��A��ʵ������ôaҲһ����A��ĸ����ʵ��
		 * 
		 */
		if (person instanceof Women) {
			Women man1=(Women)person;
			man1.makeLove();
		}
		


	}

}
