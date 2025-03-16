package Repositorio;

import Entidades.Fornecedor;
import Interfaces.IFornecedorRepositorio;

import java.util.ArrayList;

public class FornecedorRepositorio implements IFornecedorRepositorio {
    private ArrayList<Fornecedor> listaFornecedores;

    public FornecedorRepositorio(ArrayList<Fornecedor> fornecedores ){
        this.listaFornecedores = fornecedores;
    }   

    public void salvar(Fornecedor fornecedor){
        listaFornecedores.add(fornecedor);
    }

    public boolean remover(Fornecedor fornecedor){
        return listaFornecedores.remove(fornecedor);
    }

    public ArrayList<Fornecedor> listarFornecedor(){
        return listaFornecedores;
    }

    public void alteraCNPJ(Fornecedor fornecedor){
        for(Fornecedor fornecedores:listaFornecedores){
            if(fornecedores.getCNPJ().equals(fornecedor.getCNPJ())){
                fornecedores.setCNPJ(fornecedor.getCNPJ());
                break;
            }
        }   
    }

}
