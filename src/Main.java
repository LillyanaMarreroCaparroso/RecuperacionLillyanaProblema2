import java.nio.channels.GatheringByteChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libroDeGastos = new Libro();

        int opcion = 0;
        do {
            System.out.println("Seleccione una opción \n " +
                    "1. Añadir un gasto \n" +
                    "2. Ver lista de gastos \n" +
                    "3. Calcular gastos totales \n" +
                    "4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el concepto del gasto");
                    String concepto = sc.next();

                    System.out.println("Introduce el importe del gasto");
                    float importe = sc.nextInt();

                    Gasto gastoUno = new Gasto(concepto, importe);

                    libroDeGastos.push(gastoUno);
                    System.out.println("Gasto añadido");
                    break;
                case 2:
                    libroDeGastos.verLista();
                    break;
                case 3:
                    libroDeGastos.sumarGastos();
            }
        } while (opcion != 4);
    }
}
