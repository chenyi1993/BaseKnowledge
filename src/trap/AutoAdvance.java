
package trap;

/**
 * @fun �����Զ�ת��
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016��8��23������8:02:15
 * @version 1.0
 * @since
 **/
public class AutoAdvance {
	public static void main(String[] args) {
		// ���ʽ���͵��Զ�����
		System.out.println("Hello!" + 'a' + 7);
		System.out.println('a' + 7 + "Hello!");

		// ���ϸ�ֵ�����������һ����ʽ����ת��
		short value = 5;
		//���벻ͨ��
		//value = value - 2;
		//��Ϊϵͳ��һ����ʽ����ת�������ᷢ�����ȶ�ʧ��
		value += 200000;
		//�ȼ��� 
		//value = (short) (value + 200000);
		System.out.println("value : " + value);
		//for��while��doѭ���е��ظ�ִ����䲻����һ�������ľֲ������������
		//�����У�ȥ�������Ž��޷�ͨ������
		for(int i = 0; i< 100; i++){
			Integer it = new Integer(i);
		}
		
		//instanceof�������һ�����ƣ���������ı���ʱ���ͱ�����
		//1.Ҫô����������ͬ
		//2.Ҫô�Ǻ�����ĸ���
		//3.Ҫô�Ǻ����������
		Object str = "123";
		Math math = (Math) str;
		//���벻ͨ��
		//System.out.println(math instanceof str);
		
	}
}
