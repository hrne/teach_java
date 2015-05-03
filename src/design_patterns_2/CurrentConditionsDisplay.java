package design_patterns_2;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temprature;
	private float humidity;
	private Subject weatherDate;
	
	public CurrentConditionsDisplay(Subject weatherDate){
		this.weatherDate = weatherDate;
		weatherDate.registerObserver(this);
	}
	
	public void update(float temprature,float humidity,float pressure){
		this.temprature=temprature;
		this.humidity = humidity;
		display();
	}
	public void display(){
		System.out.println("Current conditions:"+temprature+"F degress and "+humidity+"% humidity");
	}
}
