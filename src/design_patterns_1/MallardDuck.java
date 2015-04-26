package design_patterns_1;

/**
 * ºñÀYÀn
 * @author hrne
 *
 */
public class MallardDuck extends Duck{
	public MallardDuck(){
		//Ä~©Ó¦Üduck
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display(){
		System.out.println("I'm a real Mallard duck");
	}
}
