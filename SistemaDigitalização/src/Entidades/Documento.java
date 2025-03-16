package Entidades;

public class Documento {
    private String nomeDocumento;
    private String descricaoDocumento;
    private int idDocumento;
    private static int ContID = 1;

    public Documento(String nomeDocumento, String descricao){
        this.nomeDocumento = nomeDocumento;
        this.descricaoDocumento = descricao;
        this.idDocumento = ContID++;
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    public String getNomeDocumento() {
        return this.nomeDocumento;
    }

    public void setDescricaoDocumento(String descricaoDocumento) {
        this.descricaoDocumento = descricaoDocumento;
    }

    public String getDescricaoDocumento() {
        return this.descricaoDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getIdDocumento() {
        return this.idDocumento;
    }

    @Override
    public String toString() {
        return "nome do Documento= " + getNomeDocumento() + ", descrição do documento= " + getDescricaoDocumento() + ", ID do Documento= " + getIdDocumento();
    }

}
