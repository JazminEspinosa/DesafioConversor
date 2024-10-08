import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static final String OPCION_1 = "1. PESO MEXICANO --> DOLAR";
    public static final String OPCION_2 = "2. DOLAR --> PESO MEXICANO";
    public static final String OPCION_3 = "3. PESO ARGENTINO --> DOLAR";
    public static final String OPCION_4 = "4. DOLAR --> PESO ARGENTINO";
    public static final String OPCION_5 = "5. REAL BRASILEÑO --> DOLAR";
    public static final String OPCION_6 = "6. DOLAR --> REAL BRASILEÑO";
    private Scanner scanner = new Scanner(System.in);

    public int getOption() {

        System.out.print("Ingresa el numero de la opcion deseada: ");
        int opcionDeseada = scanner.nextInt();

        switch (opcionDeseada) {
            case 1:
                System.out.println(OPCION_1);
                break;
            case 2:
                System.out.println(OPCION_2);
                break;
            case 3:
                System.out.println(OPCION_3);
                break;
            case 4:
                System.out.println(OPCION_4);
                break;
            case 5:
                System.out.println(OPCION_5);
                break;
            case 6:
                System.out.println(OPCION_6);
                break;
        }
        return opcionDeseada;

    }

    public double getAmount() {
        System.out.print("Ingresa el monto que deseas convertir: ");
        double monto = scanner.nextDouble();
        return monto;
    }


    public HashMap<Integer, List> codeCurrency() {
        HashMap<Integer, List> codigos = new HashMap();


        codigos.put(1, List.of("mxn", "usd"));
        codigos.put(2, List.of("usd", "mxn"));
        codigos.put(3, List.of("ars", "usd"));
        codigos.put(4, List.of("usd", "ars"));
        codigos.put(5, List.of("brl", "usd"));
        codigos.put(6, List.of("usd", "brl"));

        return codigos;


    }
}