package design_patterns_2;

public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherDate = new WeatherData();
		CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay(weatherDate);
		
		weatherDate.setMeasurements(80, 98, 30.4F);
	}
}
