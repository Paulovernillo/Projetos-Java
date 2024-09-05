public class Main {
    public static void main(String[] args){
        juros valor = new juros(5000, 0.01, 6);
        double montante = valor.obterTotal();
        System.out.println(montante);
    }
}