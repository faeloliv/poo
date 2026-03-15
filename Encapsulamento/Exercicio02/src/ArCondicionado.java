public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado = false;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, boolean ligado, int temperatura) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setLigado(ligado);
        this.setTemperatura(temperatura);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && marca.trim().length() >= 3) {
            this.marca = marca;
        } else {
            System.out.println("\nA marca do ar condicionado precisa ter ao menos 3 caracteres!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura > 15 && temperatura < 31 && this.ligado) {
            this.temperatura = temperatura;
            System.out.printf("\nTemperatura ajustada para %d°C\n", this.getTemperatura());
        } else if (!this.ligado) {
            System.out.println("\nÉ necessário ligar o ar condicionado para alterar a temperatura.");
        } else {
            System.out.println("\n⚠️ Temperatura fora da faixa!");
        }
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
        if (this.ligado) {
            System.out.printf("\nAr condicionado '%s - %s' ligado!", getMarca(), getModelo());
        }else {
            System.out.printf("\nAr condicionado '%s - %s' encontra-se desligado.", getMarca(), getModelo());
        }
    }

    public void ligar() {
        setLigado(ligado);
    }

    public void desligar() {
        if (this.ligado) {
            System.out.println("\nAr condicionado desligado!");
        } else {
            System.out.println("\nO ar condicionado já se encontra desligado.");
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("❄️ MODO TURBO ATIVADO!");
        } else {
            System.out.println("NÃO FOI POSSÍVEL ATIVAR O MODO TURBO");
        }
    }

    private boolean verificarCompressor() {
        double verificacao = Math.random() * 10;
        if (verificacao > 2) {
            System.out.println("\nMODO TURBO - Compressor em completo funcionamento.");
            return true;
        } else {
            System.out.println("\nMODO TURBO - Compressor com falha técnica.");
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("\nArCondicionado {\n| Marca = %s\n| Modelo = %s\n| Temperatura = %d°C\n| Ligado? %S",
                getMarca(), getModelo(), getTemperatura(), getLigado() ? "SIM" : "NÃO");
    }
}