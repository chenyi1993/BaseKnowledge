/**
 * @author shadow
 * @Date 2016��8��10������7:23:23
 * @Fun  ������Ҫ�̳�һ���ڲ��࣬����Ҫ�ڹ��캯���д�����ڲ�����ⲿ�࣬���������Ĺ��캯����
 **/
package innerclass;

public class InheritInner extends WithInner.Inner {
	public InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
		wi.super();
	}

	public void test() {
		System.out.println("InheritInner");
	}

	public static void main(String[] args) {
		WithInner withInner = new WithInner();
		InheritInner inheritInner = new InheritInner(withInner);
		inheritInner.test();
	}
}

class WithInner {
	class Inner {
	}
}
