package Serviços;

import Entidades.Documento;
import Interfaces.IDocumentoRepositorio;
import Repositorio.DocumentoRepositorio;

public class DocumentoServico {
    private IDocumentoRepositorio documentoRepositorio;

    public DocumentoServico(DocumentoRepositorio documentoRepositorio){
        this.documentoRepositorio = documentoRepositorio;
    }

    public void cadastra(Documento documento){
        documentoRepositorio.salvar(documento);
    }

    public void excluir(Documento documento){
        documentoRepositorio.remover(documento);
    }

    public void listar(){
        documentoRepositorio.listarDocumento().forEach(System.out::println);
    }
}
