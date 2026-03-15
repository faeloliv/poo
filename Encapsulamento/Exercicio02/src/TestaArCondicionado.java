public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ac1 = new ArCondicionado("LG", "12.000 BTU", true, 18);
        System.out.println(ac1);

        ac1.setMarca("Electrolux");
        ac1.setTemperatura(15);
        ac1.ativarModoTurbo();

        System.out.println(ac1);

        ArCondicionado ac2 = new ArCondicionado("Samsung", "10.000 BTU", false, 20);

        ac2.setLigado(true);
        ac2.setTemperatura(23);
        System.out.println(ac2);
    }
}
