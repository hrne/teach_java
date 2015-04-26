package design_patterns_1;


public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void perforQuack(){
		//委由QuackBehavior物件幫忙叫
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
		
	}
}
