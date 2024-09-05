import java.util.Scanner;

public class desvio {
    private final int n;

    Scanner ler = new Scanner(System.in);


    public desvio(int n) {
        this.n = n;
    }

    public void obterDesvio(){
        double total = 0;
        double media;
        double somatorio = 0;
        double desvio;
        double[] medidas = new double[n];

        for (int i = 0; i < n; i++) {
            medidas[i] = ler.nextDouble();
        }

        for (int i = 0; i < medidas.length; i++) {
            total += medidas[i];
        }
        media = total / medidas.length;
        for (int i = 0; i < medidas.length; i++) {
            somatorio += Math.pow(medidas[i] - media, 2);
        }
        desvio = Math.sqrt(somatorio / medidas.length);
        System.out.println(desvio);
    }
}

