public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        setCodigo(codigo);
        setAltura(altura);
        setBateria(bateria);
        setEmVoo(emVoo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public boolean setAltura(float altura) {
        if (altura > -1 && altura <= 120) {
            this.altura = altura;
            return true;
        } else if (altura > 120) {
            System.out.printf("\nPERIGO! ALTITUDE INVÁLIDA\nA regulamentação não permite voar a essa altura (%sm)\n", altura);
        } else {
            System.out.printf("\nAltitude inválida\nA altura (%sm) aparenta estar inválida\n", altura);
        }
        return false;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria > 0 && bateria < 101) {
            this.bateria = bateria;
        } else {
            System.out.println("\nNível de bateria inválido, tente novamente.");
        }
    }

    public boolean getEmVoo() {
        return this.emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar() {
        if (this.bateria > 20 && testarMotores()) {
            this.emVoo = true;
            this.altura = 2;
            System.out.printf("\nDrone decolado!\nAltura: %sm\n", this.getAltura());
        }
    }

    private boolean testarMotores() {
        System.out.println("\nTestando hélices... Calibrando GPS...");
        double verificacao = Math.random() * 10;
        if (verificacao < 8) {
            System.out.println("Motores prontos para voar!");
            return true;
        } else {
            System.out.println("⚠️ Falha! Os motores não foram acionados.");
            return false;
        }
    }

    public void subir(float x) {
        if (this.emVoo && this.setAltura(this.altura + x)) {
            System.out.printf("\nDrone subindo...\nAltura: %sm\n", getAltura());
        } else if (!this.emVoo) {
            System.out.println("\nNão foi possível subir o drone a altura desejada.\nMotivo: falha o drone não está em voo");
        }
    }

    public void descer(float x) {
        if (this.emVoo && this.setAltura(this.altura - x)) {
            System.out.printf("\nDrone descendo...\nAltura: %sm\n", getAltura());
            if (this.altura <= 0) {
                this.emVoo = false;
                System.out.println("Drone pousado com sucesso.");
            }
        } else if (!this.emVoo) {
            System.out.println("\nNão foi possível descer o drone a altura desejada.\nMotivo: falha o drone não está em voo");
        }
    }

    @Override
    public String toString() {
        return String.format("\nDrone {\n| Código = %s\n| Altitude = %sm\n| Bateria = %s\n| Em voo? %s",
                getCodigo(), getAltura(), getBateria(), getEmVoo() ? "SIM" : "NÃO");
    }
}
