public class TesteVeiculo {
    public static void interacaoVeiculo(Veiculo veiculo){
        System.out.println(veiculo.toString());
        veiculo.mover();
    }

    public static void main(String[] args) {
        Aviao av1 = new Aviao("Embraer", "E190", 300, 12500);
        CarroEletrico c1 = new CarroEletrico("BYD", "King", 80, 95);

        interacaoVeiculo(av1);
        interacaoVeiculo(c1);
    }
}
