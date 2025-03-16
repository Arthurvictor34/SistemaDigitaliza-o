package View;

import java.util.ArrayList;

// import das Entidades
import Entidades.Usuario;

// import dos Repositorios
import Repositorio.UsuarioRepositorio;

//import dos Serviços
import Serviços.UsuarioServico;

public class App {
    public static void main(String[] args){

        ArrayList<Usuario> usuarios = new ArrayList<>();

        UsuarioRepositorio repoUsu = new UsuarioRepositorio(usuarios);
        UsuarioServico serviUsu = new UsuarioServico(repoUsu);

        Usuario usu1 = new Usuario("João Santos", "EmailTeste@gmail.com", "Senhateste123", "123.432.567-12");
        serviUsu.cadastra(usu1);
        Usuario usu2 = new Usuario("Luan Santana", "EmailDaEmpresa@gmail.com", "QualquerCoisa231", "142.321.323-12");
        serviUsu.cadastra(usu2);
        Usuario usu3 = new Usuario("Neymar Junior", "Santosacima@gmai.com", "MeninoNey123", "132.124.542-12");
        serviUsu.cadastra(usu3);
        serviUsu.listar();
        System.out.println("");
        serviUsu.excluir(usu3);
        serviUsu.listar();

    }
}
