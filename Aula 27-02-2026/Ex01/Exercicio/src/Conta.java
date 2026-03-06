public class Conta {
    // Atributos / propriedades (variáveis)
    public String nomeCliente;
    public int numeroConta, agencia;
    public boolean status = true;
    public float saldo = 0;

    public Conta() {
    }

    // Metodo construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public void depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.printf("\n%s - Valor depositado!\nValor: R$%.2f\n", this.nomeCliente, valor);
        }
    }

    public void sacar(float valor) {
        if (this.status && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf("\n%s - Valor sacado!\nValor: R$%.2f\n", this.nomeCliente, valor);
        } else {
            System.out.printf("\n%s - Tentativa de saque no valor de R$%.2f." +
                    "\nERRO: 'Saldo insuficiente!'\n", this.nomeCliente, valor);
        }
    }

    public void encerrarConta() {
        if (this.status && this.saldo == 0) {
            this.status = false;
            System.out.printf("\nConta encerrada!\n| N° Conta: %d - Agência %d\n| Cliente: %s\n", this.numeroConta, this.agencia, this.nomeCliente);
        } else {
            System.out.printf("\nO cliente %s possui dinheiro na conta, e precisará sacá-lo antes do encerramento de sua conta.\n", this.nomeCliente);
        }
    }

    public String toString() {
        return String.format("\n| Nome do cliente: %s\n| Agência: %s\n| Conta: %s\n| Status: %s\n| Saldo: R$ %.2f",
                this.nomeCliente,
                this.agencia,
                this.numeroConta,
                this.status ? "Ativa" : "Encerrada",
                this.saldo);
    }
}