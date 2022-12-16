import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa {

    private boolean vip;
    public static Collection<Endereco> listaEndereco = new ArrayList<Endereco>();

    public Collection<Conta> listaConta = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone, Boolean vip) {
        super(cpf, nome, telefone);
        this.setVip(vip);
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public void imprimirEndereco() {

        Collection<Endereco> enderecoCliente = Cliente.listaEndereco;

        for (Endereco i : enderecoCliente) {

            System.out.println("Cliente " + Cliente.getNome() + ", tem residência na cidade de: " + i.getCidade() + " // Rua: " + i.getRua() + " // Número da residência: " + i.getNumeroCasa());

        }
    }


}
