package classeAssociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo, poltrona;
    private LocalDateTime data; // dia, mês, ano, hora e minuto
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, int poltrona, LocalDateTime data, Passageiro passageiro, Voo voo) {
        this.setCodigo(codigo);
        this.setPoltrona(poltrona);
        this.setData(data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'm");
        return "Reserva{" +
                "codigo=" + getCodigo() +
                ", poltrona=" + getPoltrona() +
                ", data=" + data.format(formatoBr) +
                "\npassageiro=" + getPassageiro() +
                "\nvoo=" + getVoo() +
                '}';
    }
}
