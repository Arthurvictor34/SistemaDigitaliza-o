package Entidades;

public class Fornecedor {
    private String nomeFornecedor;
    private String CNPJ;
    private String endereçoFornecedor;

    public Fornecedor(String nomeFornecedor, String CNPJ, String endereçoFornecedor){
        this.nomeFornecedor = nomeFornecedor;
        this.CNPJ = CNPJ;
        this.endereçoFornecedor = endereçoFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeFornecedor() {
        return this.nomeFornecedor;
    }

    public void setEndereçoFornecedor(String endereçoFornecedor) {
        this.endereçoFornecedor = endereçoFornecedor;
    }

    public String getEndereçoFornecedor() {
        return this.endereçoFornecedor;
    }

    public void setCNPJ(String cNPJ) {
        this.CNPJ = cNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    @Override
    public String toString() {
        return "Nome do Fornecedor= " + getNomeFornecedor() + ", Endereço do Fornecedor= " + getEndereçoFornecedor() + ", CNPJ= " + getCNPJ() + ""; 
    }    

}
