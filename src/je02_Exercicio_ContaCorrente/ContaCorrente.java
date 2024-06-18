package je02_Exercicio_ContaCorrente;

import java.util.Date;

public class ContaCorrente {
    public int numeroConta;
    public int numeroAgencia;
    public String nomeCliente;
    public Date dataNascimento;
    public double saldoConta;

    public void sacar(double valor) {}
    public void transferir(double valor) {}
    public void cancelarConta(ContaCorrente conta) {}
    public double consultarExtrato(Date dataIni, Date dataFim) {return 0.0;}
    public double consultarSaldo(){return 0.0;}
}
