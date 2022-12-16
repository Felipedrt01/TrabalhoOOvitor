import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {

    private String numero;
    public Collection<Debito> debito = new ArrayList<Debito>();
    public Collection<Credito> credito = new ArrayList<Credito>();
    private Double saldoConta = 0.;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double depositar(Credito valor){

        this.saldoConta += valor.getValor();

        return this.getSaldoConta();
    }

    public Double sacar(Debito valor){

        if (valor.getValor() > this.getSaldoConta()){

            System.out.println("sem dinheiro!!!");

            return getSaldoConta();
        }
        this.setSaldoConta(this.getSaldoConta() - valor.getValor());

        return this.getSaldoConta();
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
