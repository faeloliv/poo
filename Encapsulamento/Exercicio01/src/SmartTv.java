public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv() {
    }

    public SmartTv(String marca, String modelo, int volume) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.printf("\nO volume '%d' informado é inválido!\n", volume);
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        // Metodo lenght() metodo de instância ( marca [objeto], e não Marca [classe] )
        if (marca.length() <= 30) {
            this.marca = marca;
        } else {
            System.out.println("\nMarca inválida, verifique e tente novamente!\n");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if (resp) {
            this.modelo = modelo;
        } else {
            System.out.println("\nModelo inválido");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public boolean getInternet() {
        return this.internet;
    }

    public void aumentaVolume(int x) {
        this.setVolume(this.volume + x);
    }

    public void diminuirVolume(int x) {
        this.setVolume(this.volume - x);
    }

    public void abrirYoutube() {
        if (this.conectaInternet()) {
            System.out.println("Youtube abrindo");
        } else {
            System.out.println("Sem internet para abrir o Youtube");
        }
    }

    //Não vamos expor esse metodo, não quero torná-lo visível em outras classes
    public boolean conectaInternet() {
        System.out.println("\nVerificando conexões disponíveis... Consultando as credenciais...");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 5) {
            System.out.println("IP gerado com sucesso!");
            this.internet = true;
            return true;
        } else {
            System.out.println("Falha na conexão.");
            this.internet = false;
            return false;
        }
    }

    public String toString() {
        return String.format("\n| Marca: %s\n| Modelo: %s\n| Volume: %s\n| Conexão com a Internet: %s",
                getMarca(), getModelo(), getVolume(), getInternet() ? "Conectada" : "Sem conexão");
    }
}
