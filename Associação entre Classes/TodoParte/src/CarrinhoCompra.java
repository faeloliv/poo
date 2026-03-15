import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList<ItemCarrinho> itensCarrinho;

    public CarrinhoCompra() {
        this.itensCarrinho = new ArrayList<>();
    }

    // Esse construtor caracteriza uma agregação
    // Motivo: cliente já veio criado, é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinho = new ArrayList<>();
    }

    // Adicionar itens do carrinho no carrinho
    // Composição - Item de carrinho depende do carrinho para ser criado
    public void adicionaItemCarrinho(int id, float qntd, Produto produto) {
        ItemCarrinho aux = new ItemCarrinho(id, qntd, produto);
        this.itensCarrinho.add(aux);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // É agregação - cliente já veio criado, é independente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void calculaTotalCompra() {
        float valorTotal = 0;
        for (ItemCarrinho aux : this.itensCarrinho) {
            valorTotal += aux.getQntd() * aux.getProduto().getPreco();
        }
        System.out.println("\nValor total de compra R$" + valorTotal);
    }

    @Override
    public String toString() {
        return "\n===== CARRINHO DE COMPRA =====\n" +
                "ID: " + id + "\n" +
                "Data: " + data + "\n" +
                "\n--- Cliente ---\n" +
                cliente + "\n" +
                itensCarrinho;
    }
}
