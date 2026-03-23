package classeAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("123456789", "Joãozin");
        LocalDateTime data = LocalDateTime.of(2026,7,15,13,10);
        Voo v1 = new Voo(3767, "GRU", "HKG", data);

        Reserva res1 = new Reserva(6756, 23, LocalDateTime.now(), p1, v1);

        System.out.println(res1.toString());
    }
}
