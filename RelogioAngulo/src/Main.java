public class Main {
    public static void main(String[] args) {
        AnguloRelogio horacerta = new AnguloRelogio(14, 30);
        if (horacerta.hora() > 12 || horacerta.minuto() > 60 || horacerta.hora() < 0 || horacerta.minuto() < 0) {
            System.out.println("Hora incorreta");
        } else {
            int angulo = horacerta.retornaAnguloRelogio();
            System.out.println(angulo+ "º");
        }
    }
}