package NEW;

import javax.swing.JOptionPane;

public class CONVER implements cajaCONVER{


    public static void main(String[] args) {
        double grado = 0, gCelsius = 0, gFahrenheit = 0, gKelvin = 0, gKCelsuis = 0, gFkevin = 0, gKfahrenheit = 0;
        CONVER conver = new CONVER();

        int opcion = 0;
        String cadena;
        do {
            cadena = JOptionPane.showInputDialog("\n [1] Convertir Fahrenheit - Celsius \n [2] Convertir Celsius - Fahrenheit " +
                    "\n [3] Convertir Celsius - kelvin \n [4] Convertir Kelvin - celsius \n [5] Convertir Fahrenheit - kevin " +
                    "\n [6] Convertir Kelvin - fahrenheit \n [0] para salir");
            opcion = Integer.parseInt(cadena);
            if (opcion != 0) {

                cadena = JOptionPane.showInputDialog("Ingrese la temperatura: ");
                grado = Double.parseDouble(cadena);
                switch (opcion) {

                    case 1: {
                        gCelsius = conver.FahrenheitCelsius(grado);
                        JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gCelsius + " Celsius");

                    }
                    ;
                    break;

                    case 2: {
                        gFahrenheit = conver.CelsiusFahrenheit(grado);
                        JOptionPane.showMessageDialog(null, " TEMPERATURA: " + gFahrenheit + " Fahrenheit");
                    }
                    ;
                    break;


                    case 3: {
                        gKelvin = conver.CelsiusKelvin(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKelvin + " Kelvin");
                    }
                    ;
                    break;
                    case 4: {
                        gKCelsuis = conver.KelvinCelsuis(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKCelsuis + " Celsuis");
                    }
                    ;
                    break;
                    case 5: {
                        gFkevin = conver.FahrenheitKelvin(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gFkevin + " Kelvin");
                    }
                    ;
                    break;
                    case 6: {
                        gKfahrenheit = conver.KelvinFahrenheit(grado);
                        JOptionPane.showMessageDialog(null, "TEMPERATURA: " + gKfahrenheit + " Fahrenheit");
                    }
                    ;
                    break;
                }
            }
        } while (opcion > 0);


    }
}
