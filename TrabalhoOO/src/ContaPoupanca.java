public class ContaPoupanca extends Conta{

    private Double rentabilidade;

    public Double calcularSaldo(){
        Double total = 0.;


        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public Object transferir (Conta contaAlvo, Double valorTransferido ){

        if (valorTransferido > getSaldoConta()){
            System.out.println("Conta número "+ getNumero() +" Sem saldo");
            return contaAlvo;
        }

        contaAlvo.setSaldoConta(contaAlvo.getSaldoConta() - valorTransferido);

        setSaldoConta(getSaldoConta() - valorTransferido);

        return contaAlvo;
    }
}
