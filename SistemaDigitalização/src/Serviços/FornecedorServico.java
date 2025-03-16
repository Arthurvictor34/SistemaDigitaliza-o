package Serviços;

import Entidades.Fornecedor;
import Interfaces.IFornecedorRepositorio;
import Repositorio.FornecedorRepositorio;

public class FornecedorServico {
    private IFornecedorRepositorio fornecedorRepositorio;

    public FornecedorServico(FornecedorRepositorio fornecedorRepositorio){
        this.fornecedorRepositorio = fornecedorRepositorio;
    }

    public void cadastra(Fornecedor fornecedor){
        fornecedorRepositorio.salvar(fornecedor);
    }

    public void excluir(Fornecedor fornecedor){
        fornecedorRepositorio.remover(fornecedor);
    }

    public void listar(){
        fornecedorRepositorio.listarFornecedor().forEach(System.out::println);
    }
}

