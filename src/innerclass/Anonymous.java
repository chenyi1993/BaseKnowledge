
package innerclass;
/**
 * @author shadow
 * @Date 2016��8��10������6:58:19
 * @Fun
 **/
public class Anonymous {
	public Contents cont(){
		return new Contents(){
			private int i = 11;
			public int value(){
				return i;
			}
		};
	}
	
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		Contents com = anonymous.cont();
		System.out.println(com.value());
	}
}
