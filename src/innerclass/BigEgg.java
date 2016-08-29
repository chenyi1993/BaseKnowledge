package innerclass;
/**
 * @author shadow
 * @Date 2016��8��10������7:29:51
 * @Fun  �̳�һ��outer class�����ᷢ����inner class���ϡ�
 * 		 ����ȷBigEgg�е�Yolk��̳���Egg�е�Yolkʱ���Ḳд�亯����
 **/
public class BigEgg extends Egg {
	public class Yolk extends Egg.Yolk{
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("BigEgg.Yolk");
		}
		
		public void Test(){
			System.err.println("BigEgg.Yolk.Test()");
		}
	}
	
	public BigEgg() {
		// TODO Auto-generated constructor stub
		System.out.println("New BigEgg.");
		yolk = new Yolk();
		yolk.Test();
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}

class Egg{
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk()");
		}
		
		public void Test(){
			System.err.println("Egg.Yolk.Test()");
		}
	}
	

	
	protected Yolk yolk;
	public Egg(){
		System.out.println("New Egg");
		yolk = new Yolk();
	}
}