public class TestarDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("HAABY-2758", 10, 15, false);

        System.out.println(d1);

        d1.setAltura(300);
        d1.setBateria(150);

        d1.setBateria(40);
        d1.decolar();

        d1.subir(20);
        d1.descer(5);
        d1.subir(200);
        d1.subir(100);
        d1.descer(150);
        d1.descer(117);
    }
}
