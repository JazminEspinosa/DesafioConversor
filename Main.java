import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("BIENVENIDO/A  AL CONVERSOR DE MONEDA");
        System.out.println("***********************************");
        UserInterface userInterface = new UserInterface();
        System.out.println( userInterface.OPCION_1 +"\n" + userInterface.OPCION_2 + "\n" + userInterface.OPCION_3 +"\n" + userInterface.OPCION_4 + "\n" + userInterface.OPCION_5 + "\n" + userInterface.OPCION_6);

        int opcion=userInterface.getOption();
        //System.out.println(opcion);
        double monto= userInterface.getAmount();
        System.out.println(monto);

        HashMap<Integer, List> codigos = userInterface.codeCurrency();
        List valor = codigos.get(opcion);
        System.out.println(valor);

        ExchangeRateClient exchangeRateClient = new ExchangeRateClient();
        double conversion= exchangeRateClient.getPairConversionRequest(monto,valor);
        System.out.println("conversion: " + conversion);















    }

}
