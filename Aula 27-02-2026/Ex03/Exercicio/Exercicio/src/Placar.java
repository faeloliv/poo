public class Placar {
    // Atributos / propriedades (variáveis)
    String nomeTimeCasa, nomeTimeVisitante;
    int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar() {
    }

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        if (time.equals(this.nomeTimeCasa)) {
            this.pontosCasa += tipo;
            System.out.printf("\n%s marcou!", this.nomeTimeCasa);
        } else if (time.equals(this.nomeTimeVisitante)) {
            this.pontosVisitante += tipo;
            System.out.printf("\n%s marcou!", this.nomeTimeVisitante);
        } else {
            System.out.println("\nErro! O time informado não está presente no placar registrado.");
        }
        if (time.equals(this.nomeTimeCasa) || (time.equals(this.nomeTimeVisitante))) {
            switch (tipo) {
                case 1:
                    System.out.println("\nLance livre: +1 ponto");
                    break;
                case 2:
                    System.out.println("\nDentro do arco: +2 pontos");
                    break;
                case 3:
                    System.out.println("\nFora do arco: +3 pontos");
                    break;
                default:
                    System.out.println("\nErro! Verifique a pontuação informada e tente novamente.");
            }
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto == 4) {
            System.out.print("\nJogo encerrado!\n==========[ PLACAR FINAL ]==========");
            System.out.println(toString());
            this.periodoQuarto = 0;
        } else {
            this.periodoQuarto++;
            System.out.printf("\n=======[ Início do próximo quarto ]======= \nPeríodo: %d° quarto.\n", this.periodoQuarto);
        }
    }

    public String toString() {
        if (this.periodoQuarto != 4) {
            System.out.print("\n==========[ PLACAR ATUAL ]==========");
        }
        return String.format("\n %s [%d] x [%d] %s\n Período: %d° quarto.\n",
                this.nomeTimeCasa, this.pontosCasa, this.pontosVisitante, this.nomeTimeVisitante, this.periodoQuarto);
    }
}
