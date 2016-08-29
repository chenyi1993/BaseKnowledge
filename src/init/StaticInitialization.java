/**
 * @author shadow
 * @Date 2016��8��14������8:20:56
 * @Fun
 **/
package init;

public class StaticInitialization {
	public static void main(String[] args) {
//		System.out.println("Create Table Class in main()");
//		new Table();
		System.out.println("--------");
		System.out.println("Creating new Cupboard() in main()");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main()");
		new Cupboard();
		System.out.println("-------");
		//t2.f2(1);
		//t3.f3(1);
		t2 = new Table();
		t3 = new Cupboard();
	}
	
	static Table t2 = null;
	static Cupboard t3 = null;
}

/**
 * ���ʼ�����̣�
 *  1.��static���������ݳ�Ա�״α�����ʱ��javaֱ����(inter Preter)������һ�������classpath��ָ����λ�ã��ҳ������ڵ���(.class)��
 *  2.��class��װ�غ󣬻����һ��Class������������static��ʼ�������ᱻִ������������ֻ��ִ��һ�Σ�����Class�����״α����ص�ʱ��
 *  3.����new����ʱ���������̻���ΪDog������heap�Ϸ����㹻�Ĵ洢�ռ䡣
 *  4.�洢�ռ�ᱻ��Ϊ�㣬���Զ����������������������ͱ���Ϊȱʡֵ������references��Ϊnull��
 *  5.ִ�����г��������ݶ��崦�ĳ�ʼ��������
 *  6.ִ�й��캯����
 * 
 * */
