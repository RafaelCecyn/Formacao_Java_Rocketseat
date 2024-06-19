package je_09_poo_enum;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
        System.out.println(eb.getNome()); // Ceara
        System.out.println(eb.name()); // CEARA
        System.out.println(eb.getSigla()); // CE

        EstadoBrasileiro eb2 = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb2.getNome()); // Sao Paulo
        System.out.println(eb2.name()); // SAO_PAULO
        System.out.println(eb2.getSigla()); // SP

        for(EstadoBrasileiro eb3: EstadoBrasileiro.values()) {
            System.out.println("ESTADO LOCALIZADO");
            System.out.println(eb3.getNome());
            System.out.println(eb3.name());
            System.out.println(eb3.getSigla());
        }
    }

}
