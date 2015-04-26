package design_patterns_1;

/**
 * 飛行_不能飛
 * @author hrne
 *
 */
public class FlyNoWay implements FlyBehavior{
	public void fly(){
		System.out.println("I'can't fly");
	}
}
