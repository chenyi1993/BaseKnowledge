/**
 * @author shadow
 * @Date 2016��8��14������8:11:53
 * @Fun
 **/
package finalize;

public class DeathCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		//Proper clean
		novel.checkIn();
		//Drop the reference,forget to clean up.
		new Book(true);
		System.gc();
	}
}
