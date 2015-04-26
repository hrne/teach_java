package design_patterns_1;


public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(); //使用綠頭鴨的行為
		mallard.performFly();
		mallard.perforQuack();
	}

}
