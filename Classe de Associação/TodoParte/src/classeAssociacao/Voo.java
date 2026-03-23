package classeAssociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int nro;
    private String origem, destino;
    private LocalDateTime data; // dia, mês, ano, hora e minuto

    public Voo() {
    }

    public Voo(int nro, String origem, String destino, LocalDateTime data) {
        this.setNro(nro);
        this.setOrigem(origem);
        this.setDestino(destino);
        this.setData(data);
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH'h'm");
        return "Voo{" +
                "nro=" + getNro() +
                ", origem='" + getOrigem() + '\'' +
                ", destino='" + getDestino() + '\'' +
                ", data=" + data.format(formatoBr) +
                '}';
    }
}
