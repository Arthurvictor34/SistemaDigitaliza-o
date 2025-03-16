package Serviços;

import Entidades.Usuario;
import Interfaces.IUsuarioRepositorio;
import Repositorio.UsuarioRepositorio;

public class UsuarioServico {
    private IUsuarioRepositorio usuarioRepositorio;

    public UsuarioServico(UsuarioRepositorio usuarioRepositorio){
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public void cadastra(Usuario usuario){
        usuarioRepositorio.salvar(usuario);
    }

    public void excluir(Usuario usuario){
        usuarioRepositorio.remover(usuario);
    }

    public void listar(){
        usuarioRepositorio.listarUsuario().forEach(System.out::println);;
    }
}
