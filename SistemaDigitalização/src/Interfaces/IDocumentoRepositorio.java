package Interfaces;

import java.util.ArrayList;
import Entidades.Documento;

public interface IDocumentoRepositorio {
    void salvar(Documento documento);
    boolean remover(Documento documento);
    ArrayList<Documento> listarDocumento();
    void alteraDescricao(Documento documento);
}
