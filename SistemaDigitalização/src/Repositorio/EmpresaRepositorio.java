package Repositorio;

import Entidades.Empresa;
import Interfaces.IEmpresaRepositorio;

import java.util.ArrayList;

public class EmpresaRepositorio implements IEmpresaRepositorio {
    private ArrayList<Empresa> listaEmpresa;

    public EmpresaRepositorio(ArrayList<Empresa> empresa){
        this.listaEmpresa = empresa;
    }

    public void salvar(Empresa empresa){
        listaEmpresa.add(empresa);
    }

    public boolean remover(Empresa empresa){
        return listaEmpresa.remove(empresa);
    }


    public ArrayList<Empresa> listarEmpresa(){
        return listaEmpresa;
    }

    public void alteraCNPJ(Empresa empresa){
        for(Empresa empresas: listaEmpresa){
            if(empresas.getCNPJ().equals(empresa.getCNPJ())){
                empresas.setCNPJ(empresa.getCNPJ());
                break;
            }
        }
    }

}
