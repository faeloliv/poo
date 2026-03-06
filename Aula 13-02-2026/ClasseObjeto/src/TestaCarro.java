public class TestaCarro {
    public static void main(String[] args) {
        // Cria um objeto (instância da classe carro)
        Carro obj1 = new Carro("Fiat","Pálio","JDK2026");

        Carro obj2 = new Carro("Volks","Polo","JDK2002");

        System.out.println(obj1);
        System.out.println(obj2);
        obj1.ligarCarro();
        obj1.acelerar(120);
        obj1.freiar(80);
        obj1.freiar(80);

        obj2.acelerar(50);
        obj2.freiar(30);
    }
}
