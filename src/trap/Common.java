
package trap;
/**
 *
 * @author shadow 
 * @Date 2016��8��31������9:38:42
 * @version 1.0
 * @since 
 **/
public class Common {
	private static final int END = Integer.MAX_VALUE;
	private static final int START = END - 10;
	
	public static void main(String[] args) {
		for(int i = -10; i < 10; i++){
			System.out.println( i + " : " + isOdd(i));
		}
		
		//��������������Ϊ0.10000000000000009��ԭ����
		System.out.println(2.0f-1.9f);
		
		//����������ʵ�ֽ�������Ϊjava�����˳���Ǵ����ҵģ�Ӧ����ôд��y=(x^=(y^x))^y;
		int x = 2010;
		int y = 2012;
		//x^=y^=x^=y;//����
		//y=(x^=(y^=x))^y;//��ȷ
		y = y ^ x;
		x = x ^ y;
		y = x ^ y;
		System.out.println("X = "+ x + ", Y = " + y);
		
		//int���͵�i���������������ѭ��
		int count = 0;
		for(int i = START; i < END; i++){
			System.out.println("I : " + i);
			count++;
			System.out.println(count);
		}
		
		//����������,����������ȼ����⣩
		int minutes = 0;
		for(int ms = 0; ms < 60 * 60 * 1000; ms++){
			if(ms % (60 * 1000) == 0){
				minutes++;
			}
		}
		System.out.println("minutes : " + minutes);
		
		System.out.println("Decision : " + decision());
 	}
	/**
	 * һ������£�������ô˵try/catch������У�finally�������ִ�еġ�
	 * @return
	 */
	public static boolean decision(){
		try{
			return true;
		}finally{
			return false;
		}
	}
	
	/**
	 * ��������
	 * @param i
	 * @return
	 */
	public static boolean isOdd(int i){
		return i % 2 != 0;
	}
}
