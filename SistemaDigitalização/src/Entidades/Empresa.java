package Entidades;

public class Empresa {
    private String nomeEmpresa; // Nome da empresa
    private String CNPJ; // CNPJ da empresa
    private String tipoEmpresa; // Se a empresa é de: material de construção, distribuidora alimenticia e etc

    public Empresa(String nomeEmpresa, String CNPJ, String tipo){
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
        this.tipoEmpresa = tipo;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setCNPJ(String cNPJ) {
        this.CNPJ = cNPJ;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoEmpresa() {
        return this.tipoEmpresa;
    }

    @Override
    public String toString() {
        return "nomeEmpresa='" + getNomeEmpresa() + ", CNPJ='" + getCNPJ();
    }
}
