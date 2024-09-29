public class Conversor {
    double[] real = {1.0, 0.19, 0.18, 0.15};
    double[] dolar = {5.25, 1.0, 0.94, 0.78};
    double[] euro = {5.55, 1.06, 1.0, 0.83};
    double[] libra = {6.37, 1.28, 1.21, 1.0};




    public double converter(double valor, Moeda origem, Moeda destino) {
        double [] multiplicador;
        switch (origem) {
            case REAL:
                multiplicador = real;
                break;
            case DOLAR:
                multiplicador = dolar;
                break;
            case EURO:
                multiplicador = euro;
                break;
            case LIBRA:
                multiplicador = libra;
                break;
            default:
                throw new IllegalArgumentException("MOEDA NAO CADASTRADA");
        }

        int indiceDestino = destino.ordinal();

        return valor * multiplicador[indiceDestino];
    }

}
