public abstract class Pessoa {

    private String cpf;
    private static String nome;
    private String  telefone;

    public Pessoa(String cpf, String nome, String telefone){

        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
