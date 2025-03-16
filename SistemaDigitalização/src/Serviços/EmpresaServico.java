package Serviços;

import Entidades.Empresa;
import Interfaces.IEmpresaRepositorio;
import Repositorio.EmpresaRepositorio;

public class EmpresaServico {
    private IEmpresaRepositorio empresaRepositorio;

    public EmpresaServico(EmpresaRepositorio empresaRepositorio){
        this.empresaRepositorio = empresaRepositorio;
    }

    public void cadastra(Empresa empresa){
        empresaRepositorio.salvar(empresa);
    }

    public void excluir(Empresa empresa){
        empresaRepositorio.remover(empresa);
    }

    public void listar(){
        empresaRepositorio.listarEmpresa().forEach(System.out::println);
    }
}
