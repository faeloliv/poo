public class TestaStreaming {
    public static void main(String[] args) {

        Streaming user1 = new Streaming("Lucas", "Basico");

        System.out.println(user1);

        user1.assistirFilme("A volta dos que não foram");
        user1.cancelarAssinatura();
        System.out.println(user1);

        user1.cancelarAssinatura();

        Streaming user2 = new Streaming("Maria Souza", "Familia");

        System.out.println(user2);

        user2.assistirFilme("A culpa é das estrelas");
        user2.cancelarAssinatura();
        System.out.println(user2);

    }
}