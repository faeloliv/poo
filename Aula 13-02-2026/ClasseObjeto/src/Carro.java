public class Carro {
    // Atributos / propriedades (variáveis)
    public String marca, modelo, placa;
    public boolean motor = false; //True = carro ligado | False = carro desligado
    public float velAtual = 0;

    public Carro(){
    }

    // Metodo construtor
    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void ligarCarro(){
        if (!this.motor){
            this.motor = true;
            System.out.printf("\nCarro %s-%s ligado!\n", this.marca, this.modelo);
        }
    }

    public void desligarCarro(){
        if (this.motor){
            this.motor = false;
            System.out.printf("\nCarro %s-%s desligado!\n", this.marca, this.modelo);
        }
    }

    //Metodo para acelerar o carro
    public void acelerar(float x){
        if (this.motor){
            this.velAtual += x;
            System.out.printf("\n%s-%s | Acelerando o carro...\n", this.marca, this.modelo);
            System.out.printf("Velocimetro: %.2fkm/h\n", this.velAtual);
        }
    }

    //Metodo para freiar o carro
    public void freiar(float x){
        if (this.motor && this.velAtual - x >= 0){
            this.velAtual = x;
            System.out.printf("\n%s-%s | Freiando o carro...\n", this.marca, this.modelo);
            System.out.printf("Velocimetro: %.2fkm/h\n", this.velAtual);
        }
    }

    // Operações (métodos)
    public String toString() { // Converte objeto para String
        // This representa o objeto que chama o metodo
        return "Marca: " + this.marca +
                " | Modelo: " + this.modelo +
                " | Placa: " + this.placa +
                " | Vel. Atual: " + this.velAtual +
                " | Motor: " + (this.motor ? "Ligado" : "Desligado");
    }
}