import java.util.Scanner;


public class ConvertidorMonedasNekro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tipos de cambio fijos para las 10 monedas más importantes respecto al peso colombiano (COP)
        double[] tiposCambio = {3500.0, 4000.0, 3000.0, 0.03, 4300.0, 2600.0, 15000.0, 330.0, 5000.0, 40.0};
        String[] monedas = {"Dólar estadounidense (USD)", "Euro (EUR)", "Yen japonés (JPY)", "Libra esterlina (GBP)",
                "Dólar canadiense (CAD)", "Franco suizo (CHF)", "Dólar australiano (AUD)", "Yuan chino (CNY)",
                "Peso mexicano (MXN)", "Rublo ruso (RUB)"};

        System.out.println("Bienvenido al convertidor de monedas a pesos colombianos (COP)");
        System.out.print("Por favor, ingrese la cantidad: ");
        double cantidad = scanner.nextDouble();

        System.out.println("Por favor, seleccione la moneda de origen:");
        for (int i = 0; i < monedas.length; i++) {
            System.out.println((i + 1) + ". " + monedas[i]);
        }
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        if (opcion >= 1 && opcion <= monedas.length) {
            double resultado = cantidad * tiposCambio[opcion - 1];
            System.out.println("La cantidad equivalente en pesos colombianos (COP) para " + monedas[opcion - 1] + " es: " + resultado);
        } else {
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}