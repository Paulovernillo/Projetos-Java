public class juros {
    private final double capital;
    private final double taxa;
    private final double periodo;

    public juros(double capital, double taxa, double periodo) {
        this.capital = capital;
        this.taxa = taxa;
        this.periodo = periodo;
    }
    public double obterTotal(){
        return(capital * Math.pow((1+taxa), periodo));
    }
}


