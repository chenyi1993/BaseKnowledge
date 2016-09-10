
package bitoperation;
/**
 *
 * @author shadow 
 * @Date 2016��9��10������10:04:21
 * @version 1.0
 * @since 
 **/
public class LearnBit {
	public static void main(String[] args) {
		int n = 152;
		//����
		n = n >> 1;
		System.out.println("n >> 1 : " + n);
		//����
		n = n << 1;
		System.out.println("n << 1 : " + n);
		n = n << 2;
		System.out.println("n << 2 = " + n + ", n * 2^2 : " + (152 * 2 * 2));
		n = n >> 2;
		n = n << 3;
		System.out.println("n << 3 = " + n + ", n * 2^2^2 : " + (152 * 2 * 2 * 2));
		
		//�޷�������
		int un = 123456;
		System.out.println("un >>> 1 : " + (un >>> 1));
		//û���޷�������
		//System.out.println("un <<< 1 : " + (un <<< 1));
		
		n = n >> 32;
		System.out.println("n >> 32 : " + n);
		
		n = n << 32;
		System.out.println("n << 32 : " + n);
		
	    int s = Integer.MAX_VALUE;
	    //��λ��
	    System.out.println("s & 1 : " + (s & 1) );
	    //��λ��
	    System.out.println("s | 1 : " + (s | 1) );
	    //��λ�ƻ�
	    System.out.println("s ^ 1 : " +(s ^ 1));
	    //ȡ��
	    System.out.println("~s : " +  ~s);
	    
	}
}
