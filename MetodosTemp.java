package temperaturas;
public class MetodosTemp {

	
	public MetodosTemp() {
	}
		public double celsiusTofahrenheit(double centigrados) {
			return (9*centigrados/5) +32;
		
	}
		
		public double celsiusTokelvin(double centigrados) {
			return ((centigrados) + 273.15);
		}
		
		public double fahrenheitTocelsius(double fahrenheit) {
			return ((fahrenheit -32) *5/9);
	       
		}
		
		public double fahrenheitTokelvin(double fahrenheit) {
			 return (fahrenheit-32*5 /9 ) + 273.15;
		}
		
		public double kelvinTocelsius(double kelvin) {
			return ((kelvin) - 273.15);
		}
		
		public double kelvinTofahrenheit(double kelvin) {
			 return 9*(kelvin - 273.15)/5 +32;
		}
}
