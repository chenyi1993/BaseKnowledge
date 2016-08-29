/**
 * @author shadow
 * @Date 2016��8��18������8:53:13
 * @Fun
 **/
package finalize;

public class Amphibian extends Animal {
	Characteristic characteristic = new Characteristic("can live in water");
	public Amphibian() {
		// TODO Auto-generated constructor stub
		System.out.println("Amphibian()");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Amphibian finalize");
		if(DoBaseFinalization.flag){
			try{
				super.finalize();
			}catch(Throwable t){
				t.printStackTrace();
			}
		}
		
	}}
