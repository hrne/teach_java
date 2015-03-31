package teach_java;

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
		
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
		
	}
}
