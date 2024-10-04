public enum Moeda {
    REAL(0, "R$"),
    DOLAR(1, "US$"),
    EURO(2,"€"),
    LIBRA(3,"£");
    private final int valor;
    private final String simbolo;

    private Moeda(int valor, String simbolo){
        this.valor = valor;
        this.simbolo = simbolo;
    }

    public int valor(){
        return valor;
    }
    public String simbolo() {
        return simbolo;
    }

}
