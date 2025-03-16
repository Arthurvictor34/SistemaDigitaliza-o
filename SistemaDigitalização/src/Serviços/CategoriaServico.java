package Serviços;

import Entidades.Categoria;
import Interfaces.ICategoriaRepositorio;
import Repositorio.CategoriaRepositorio;

public class CategoriaServico {
    private ICategoriaRepositorio categoriaRepositorio;

    public CategoriaServico(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public void cadastra(Categoria categoria){
        categoriaRepositorio.salvar(categoria);
    }

    public void excluir(Categoria categoria){
        categoriaRepositorio.remover(categoria);
    }

    public void listar(){
        categoriaRepositorio.listarCategoria().forEach(System.out::println);
    }
}