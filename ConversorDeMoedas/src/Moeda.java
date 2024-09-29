public enum Moeda {
    REAL(0), DOLAR(1), EURO(2), LIBRA(3);
    private final int valor;

    private Moeda(int valor){
        this.valor = valor;
    }

    public int valor(){
        return valor;
    }
}