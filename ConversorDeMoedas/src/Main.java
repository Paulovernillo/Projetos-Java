import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);

       Conversor conversor = new Conversor();

       String plural = "";

        System.out.println("MENU DE OPCOES:");
        System.out.println("0: REAL");
        System.out.println("1: DOLAR");
        System.out.println("2: EURO");
        System.out.println("3: LIBRA\n");

        System.out.println("DIGITE QUAL VALOR VC DESEJA CONVERTER:");
        double valorDigitado = x.nextDouble();
        System.out.println("DE QUAL MOEDA VC DESEJA CONVERTER?");
        int moedaOrigem = x.nextInt();
        while (moedaOrigem < 0 || moedaOrigem > 3){
            System.out.println("MOEDA NAO RECONHECIDA, ESCOLHA UMA DAS OPCOES VALIDAS ACIMA:");
            moedaOrigem = x.nextInt();
        }
        Moeda moeda = Moeda.values()[moedaOrigem];

        Dinheiro dinheiro = new Dinheiro(valorDigitado, moeda);
        double valor = dinheiro.getValor();
        Moeda origem = dinheiro.getMoeda();

        if(valor > 1) {
            switch (origem.name()) {
                case "REAL":
                    plural = "REAIS";
                    break;
                case "DOLAR":
                    plural = "DOLARES";
                    break;
                case "EURO":
                    plural = "EUROS";
                    break;
                case "LIBRA":
                    plural = "LIBRAS";
                    break;
            }
            System.out.println("Voce deseja converter " + valor + " " + plural + " para qual moeda?");
        }else {
            System.out.println("Voce deseja converter " + valor + " " + dinheiro.getMoeda().name() + " para qual moeda?");
        }

        int destinoMoeda = x.nextInt();
        while (destinoMoeda < 0 || destinoMoeda > 3 ){
            System.out.println("MOEDA NAO RECONHECIDA, ESCOLHA UMA DAS OPCOES VALIDAS ACIMA:");
            destinoMoeda = x.nextInt();
        }
        Moeda destino = Moeda.values()[destinoMoeda];

        double resultado = conversor.converter(valor, origem, destino);

        if(valor > 1) {
            switch (destino.name()) {
                case "REAL":
                    plural = "REAIS";
                    break;
                case "DOLAR":
                    plural = "DOLARES";
                    break;
                case "EURO":
                    plural = "EUROS";
                    break;
                case "LIBRA":
                    plural = "LIBRAS";
                    break;
            }
            System.out.printf("RESULTADO: %.2f %s\n", resultado, plural);
        }else {
            System.out.printf("RESULTADO: %.2f %s\n", resultado, destino);
        }

    }
}