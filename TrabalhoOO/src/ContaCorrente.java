public class ContaCorrente extends Conta{

    private Double limite = 0.;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double calcularSaldo(){
        Double total = 0.;


        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }

    public Object[] transferir (Conta contaAlvo, Double valorTransferido ){

        if (valorTransferido > getSaldoConta()){
            System.out.println("Conta número "+ getNumero() +" Sem saldo");
        }
        else {
            Double valorDois = valorTransferido;

            valorDois += contaAlvo.getSaldoConta();
            contaAlvo.setSaldoConta(valorDois);

            setSaldoConta(getSaldoConta() - valorTransferido);
        }

        Object[] o = {contaAlvo};

        return o;
    }
}
