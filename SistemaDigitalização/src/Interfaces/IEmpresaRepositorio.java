package Interfaces;

import java.util.ArrayList;
import Entidades.Empresa;

public interface IEmpresaRepositorio {
    void salvar(Empresa empresa);
    boolean remover(Empresa empresa);
    ArrayList<Empresa> listarEmpresa();
    void alteraCNPJ(Empresa empresa);
}
