package Entidades;

public class Usuario{
    private String nomeUsuario;
    private int id;
    private String emailUsuario;
    private String senhaUsuario;
    private String cpf;
    private static int contID = 1;

    public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario, String cpf){
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.cpf = cpf;
        this.id = contID++;
    }

    public void setNomeUsuario(String novonomeUsuario) {
        this.nomeUsuario = novonomeUsuario;
    }

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getEmailUsuario() {
        return this.emailUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getSenhaUsuario() {
        return this.senhaUsuario;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String toString() {
        return "nome do Usuario=" + getNomeUsuario() + ", email do Usuario=" + getEmailUsuario()  + ", senha do Usuario=" + getSenhaUsuario() + ", cpf='" + getCpf();
    }
}