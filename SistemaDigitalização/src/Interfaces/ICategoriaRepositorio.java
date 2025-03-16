package Interfaces;

import java.util.ArrayList;
import Entidades.Categoria;

public interface ICategoriaRepositorio {
    void salvar(Categoria categoria);
    boolean remover(Categoria categoria);
    ArrayList<Categoria> listarCategoria();
    void alteraNome(Categoria categoria);
}
