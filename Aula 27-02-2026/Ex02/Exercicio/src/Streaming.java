public class Streaming {
    // Atributos / propriedades (variáveis)
    public String usuario, plano, ultimoFilmeAssistido = "-";
    public boolean ativo = true;
    public float mensalidade;

    public Streaming() {
    }

    // Metodo construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        switch (plano) {
            case "Basico":
                this.mensalidade = 25.90f;
                break;
            case "Premium":
                this.mensalidade = 45.90f;
                break;
            case "Familia":
                this.mensalidade = 60.90f;
                break;
            default:
                System.out.printf("%s - Plano inválido, por gentileza revisar as informações cadastrais.", this.usuario);
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.printf("\nUser %s assistindo: '%s'\n", this.usuario, this.ultimoFilmeAssistido);
        } else {
            System.out.printf("\n%s - Conta inativa!\nPor gentileza, realize o pagamento da fatura para continuar", this.usuario);
        }
    }

    public void cancelarAssinatura() {
        if (this.ativo) {
            this.ativo = false;
            System.out.printf("\nUser %s - Assinatura cancelada!\n", this.usuario);
        } else {
            System.out.printf("\nUser %s - Sua conta encontra-se suspensa, e não existe nenhum plano vigente.\n", this.usuario);
        }
    }

    public String toString() {
        if (this.ativo) {
            return String.format("\n| Nome de usuário: %s\n| Plano: %s\n| Último filme assistido: '%s'\n| Status da conta: %s\n| Valor da mensalidade: R$%.2f",
                    this.usuario, this.plano, this.ultimoFilmeAssistido, this.ativo ? "Ativa" : "Suspensa", this.mensalidade);
        }
        return String.format("\n| Nome de usuário: %s\n| Último filme assistido: '%s'\n| Status da conta: %s\n| Último plano contratado: %s\n| Valor da última mensalidade: R$%.2f",
                this.usuario, this.ultimoFilmeAssistido, this.ativo ? "Ativa" : "Suspensa", this.plano, this.mensalidade);
    }
}
