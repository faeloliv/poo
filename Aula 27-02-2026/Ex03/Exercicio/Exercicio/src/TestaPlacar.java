public class TestaPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar("SESI Franca", "123 Minas");

        //1° quarto
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 4);
        p1.registrarPonto("Joenville", 4);
        p1.registrarPonto("Joenville", 2);
        p1.registrarPonto("123 Minas", 2);
        System.out.println(p1);
        p1.proximoQuarto();

        //2° quarto
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 1);
        System.out.println(p1);
        p1.proximoQuarto();

        //3° quarto
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 3);
        System.out.println(p1);
        p1.proximoQuarto();

        //4° quarto
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 3);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("123 Minas", 1);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 2);
        p1.registrarPonto("SESI Franca", 1);
        p1.registrarPonto("123 Minas", 2);
        p1.registrarPonto("SESI Franca", 3);
        p1.registrarPonto("123 Minas", 2);
        p1.proximoQuarto();
    }
}