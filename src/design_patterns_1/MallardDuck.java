package design_patterns_1;

/**
 * ���Y�n
 * @author hrne
 *
 */
public class MallardDuck extends Duck{
	public MallardDuck(){
		//�~�Ӧ�duck
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display(){
		System.out.println("I'm a real Mallard duck");
	}
}
