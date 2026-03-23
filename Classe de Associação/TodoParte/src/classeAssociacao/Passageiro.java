package classeAssociacao;

public class Passageiro {
    private String cpf, nome;

    public Passageiro() {
    }

    public Passageiro(String cpf, String nome) {
        this.setCpf(cpf);
        this.setNome(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                '}';
    }
}
