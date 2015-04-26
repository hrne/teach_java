package design_patterns_1;


public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(); //使用綠頭鴨的行為
		mallard.performFly();
		mallard.perforQuack();
		
		Duck model = new ModelDuck();
		model.performFly(); //不會飛
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();//火箭飛行
	}

}
