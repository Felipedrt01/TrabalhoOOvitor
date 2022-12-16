public class Endereco {

    private String cep;
    private String cidade;
    private String rua;
    private String complemento;
    private String numeroCasa;
    private String uf;


    public Endereco (String cep, String cidade, String rua, String complemento, String numeroCasa, String uf){

        this.setCep(cep);
        this.setCidade(cidade);
        this.setRua(rua);
        this.setComplemento(complemento);
        this.setNumeroCasa(numeroCasa);
        this.setUf(uf);

    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
