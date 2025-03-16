package Interfaces;

import java.util.ArrayList;
import Entidades.Usuario;

public interface IUsuarioRepositorio {
    void salvar(Usuario usuario);
    boolean remover(Usuario usuario);
    ArrayList<Usuario> listarUsuario();
    void alteraSenha(Usuario usuario);
}
