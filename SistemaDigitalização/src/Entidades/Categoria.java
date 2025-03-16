package Entidades;

public class Categoria {
    private String nomeCategoria;
    private int id;
    private static int contID = 1;

    public Categoria(String nomeCategoria){
        this.nomeCategoria = nomeCategoria;
        this.id = contID++;
    }  

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Nome da categoria= " + getNomeCategoria() + ", codigo da categoria= " + getId();
    }

}
