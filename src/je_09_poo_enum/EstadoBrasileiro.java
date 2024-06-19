package je_09_poo_enum;

public enum EstadoBrasileiro {
    PIAUI("Piaui","PI"),
    MARANHO("Maranhao","MA"),
    SAO_PAULO("Sao Paulo","SP"),
    RIO_JANEIRO("Rio de Janeiro","RJ"),
    CEARA("Ceara","CE"),;

    private String nome;
    private String sigla;

    EstadoBrasileiro(String nome,String sigla) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
