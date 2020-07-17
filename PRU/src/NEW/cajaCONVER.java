package NEW;

public interface cajaCONVER {
    double grado =0;

    default double FahrenheitCelsius(double grado) {
        //=(grado-32)/1.8;
        double gCelsius = (grado - 32) * 5 / 9;
        return gCelsius;
    }
    default double CelsiusFahrenheit(double grado) {
        double gFahrenheit = (grado * 9 / 5) + 32;
        return gFahrenheit;
    }

    default double CelsiusKelvin(double grado) {
        double gKelvin = (grado) + 273;
        return gKelvin;
    }

    default double KelvinCelsuis(double grado) {
        double gKCelsuis = grado - 273;
        return gKCelsuis;
    }

    default double FahrenheitKelvin(double grado) {
        double gFkevin = (grado - 32) * 5 / 9 + 273;
        return gFkevin;
    }

    default double KelvinFahrenheit(double grado) {
        double gKfahrenheit = (grado - 273) * 9 / 5 + 32;
        return gKfahrenheit;
    }
}
