package Interfaces;

import java.util.ArrayList;
import Entidades.Fornecedor;

public interface IFornecedorRepositorio {
    void salvar(Fornecedor fornecedor);
    boolean remover(Fornecedor fornecedor);
    ArrayList<Fornecedor> listarFornecedor();
    void alteraCNPJ(Fornecedor fornecedor);
}
