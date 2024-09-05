public class Main {
    public static void main(String[] args) {
        QuadraticFunction funcao = new QuadraticFunction(3, 5, 2);
        boolean sucesso = funcao.obterRaiz();
        if (sucesso) {
            System.out.println("x1 = "+funcao.getX1());
            System.out.println("x2 = "+funcao.getX2());
        }
        System.out.println(sucesso);
    }
}
