import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);

       Conversor conversor = new Conversor();

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

        System.out.println("Voce deseja converter " + dinheiro.getMoeda().simbolo() + " " + valor + " para qual moeda?");

        int destinoMoeda = x.nextInt();
        while (destinoMoeda < 0 || destinoMoeda > 3 ){
            System.out.println("MOEDA NAO RECONHECIDA, ESCOLHA UMA DAS OPCOES VALIDAS ACIMA:");
            destinoMoeda = x.nextInt();
        }
        Moeda destino = Moeda.values()[destinoMoeda];

        double resultado = conversor.converter(valor, origem, destino);

        System.out.printf("RESULTADO: %s %.2f",destino.simbolo(), resultado);

    }
}