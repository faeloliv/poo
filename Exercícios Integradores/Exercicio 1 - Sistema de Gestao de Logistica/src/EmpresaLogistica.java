import java.util.ArrayList;

public class EmpresaLogistica {
    private String nomeEmpresa;
    private ArrayList<Veiculo> frota = new ArrayList<>();

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void gerarRelatorioCustos(double distancia) {
        System.out.println("\n=====| RELATÓRIO DE CUSTOS DA VIAGEM (" + distancia + "KM) |=====");
        for (Veiculo veiculo : frota) {
            double custo = veiculo.calcularCustoViagem(distancia);
            System.out.println(veiculo);
            System.out.println("Custo da viagem: R$" + custo);
        }
    }
}
