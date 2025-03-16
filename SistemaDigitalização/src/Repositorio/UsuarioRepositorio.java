package Repositorio;

import Entidades.Usuario;
import Interfaces.IUsuarioRepositorio;

import java.util.ArrayList;

public class UsuarioRepositorio implements IUsuarioRepositorio {
    private ArrayList<Usuario> listaUsuario;
    
    public UsuarioRepositorio(ArrayList<Usuario> usuarios){
        this.listaUsuario = usuarios;
    }

    public void salvar(Usuario usuario){
        this.listaUsuario.add(usuario);
    }

    public boolean remover(Usuario usuario){
        return listaUsuario.remove(usuario);
    }

    public ArrayList<Usuario> listarUsuario(){
        return listaUsuario;
    }

    public void alteraSenha(Usuario usuarios){
        for(Usuario usuario: listaUsuario){
            if(usuario.getSenhaUsuario().equals(usuarios.getSenhaUsuario())){
                usuario.setSenhaUsuario(usuarios.getSenhaUsuario());
                break;
            }
        }
    }
}
