package Repositorio;

import Entidades.Categoria;
import Interfaces.ICategoriaRepositorio;

import java.util.ArrayList;

public class CategoriaRepositorio implements ICategoriaRepositorio {
    private ArrayList<Categoria> listaCategoria;

   public CategoriaRepositorio(ArrayList<Categoria> categoria){
        this.listaCategoria = categoria;
   }

   public void salvar(Categoria categoria){
        listaCategoria.add(categoria);
   }

   public boolean remover(Categoria categoria){
        return listaCategoria.remove(categoria);
   }

   public ArrayList<Categoria> listarCategoria(){
        return listaCategoria;
   }

   public void alteraNome(Categoria categoria){
        for(Categoria categorias: listaCategoria){
            if(categorias.getNomeCategoria().equals(categoria.getNomeCategoria())){
                categorias.setNomeCategoria(categoria.getNomeCategoria());
                break;
            }
        }
    }

}
