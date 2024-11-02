public record AnguloRelogio(int hora, int minuto) {

    @Override
    public int hora() {
        return hora;
    }

    @Override
    public int minuto() {
        return minuto;
    }

    public int retornaAnguloRelogio() {
        int ponteirohora = 0;
        int ponteirominuto = 0;
        int i;
        int j;

            for (i = 0; i < hora; i++) {
                ponteirohora = ponteirohora + 30;
            }
            for (j = 0; j < minuto; j++) {
                ponteirominuto = ponteirominuto + 6;
            }
            if (ponteirohora > ponteirominuto) {
                return ponteirohora - ponteirominuto;
            } else {
                return ponteirominuto - ponteirohora;
            }
        }
    }


