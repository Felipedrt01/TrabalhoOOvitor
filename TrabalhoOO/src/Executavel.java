public class Executavel {

    public static void main(String[] args) {
                                     //Aplicação 1
        Endereco e1 = new Endereco( "36061300","Juiz De fora", "Rua Bolivia", "Casa",  "20", "MG");
        Endereco e2 = new Endereco( "36061355","Juiz De fora", "Rua Bolivia", "Casa",  "25", "MG");
        Endereco e3 = new Endereco( "36061351","Juiz De fora", "Rua Bolivia", "Casa",  "26", "MG");

        Cliente c1 = new Cliente("123131313", "Joao", "654465656",true);
        c1.listaEndereco.add(e1);
        c1.listaEndereco.add(e2);
        c1.listaEndereco.add(e3);

c1.imprimirEndereco();

                                //Aplicação 2
        Funcionario Funci1 = new Funcionario("999999999","Ronaldo Fenomeno","914245090",25000.);
        Funcionario Funci2 = new Funcionario("100000000","Ronaldinho","918456490",55000.);

        Cargo aten = new Cargo();
        Cargo geren = new Cargo();
        aten.setNomeCargo("Atendende");
        geren.setNomeCargo("Gerente");

        Funci1.setCargo(aten);
        Funci2.setCargo(geren);

                                    //Aplicação 3
        System.out.println("Aplicação 3");
        ContaCorrente corren = new ContaCorrente();
        Debito debi1 = new Debito (50.);
        Credito credi1 = new Credito(100.);
        Credito credi2= new Credito(100.);
        Credito credi3= new Credito(100.);

        corren.debito.add(debi1);
        corren.credito.add(credi1);
        corren.credito.add(credi2);
        corren.credito.add(credi3);

        corren.depositar(credi1);
        corren.depositar(credi2);
        corren.depositar(credi3);

        c1.listaConta.add(corren);

        corren.sacar(debi1);
        System.out.println("saldo: " + corren.calcularSaldo());

                            //aplicação 4
        System.out.println("aplicação 4");

        ContaCorrente corrente = new ContaCorrente();
        corrente.setLimite(0.);

        ContaPoupanca conpa = new ContaPoupanca();

        Credito cred4 = new Credito(1000.);
        Credito cred5 = new Credito(1000.);

        conpa.depositar(cred4);
        conpa.credito.add(cred4);

        corrente.depositar(cred5);

        corrente.transferir(conpa, 500.);

        System.out.println("conta poupança " +conpa.getSaldoConta());
        System.out.println("conta corrente " +corrente.getSaldoConta());
    }
}

