package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahrenheit;
		float firstVar = 9.0f;
		float secondVar = 5.0f;
		float plusVar = 32.0f;
		fahrenheit = ((temperatureCelsius * firstVar / secondVar)+plusVar);
		System.out.println(fahrenheit);
    }
}
