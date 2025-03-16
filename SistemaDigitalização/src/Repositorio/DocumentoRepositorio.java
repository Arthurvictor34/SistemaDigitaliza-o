package Repositorio;

import Entidades.Documento;
import Interfaces.IDocumentoRepositorio;

import java.util.ArrayList;

public class DocumentoRepositorio implements IDocumentoRepositorio {
    private ArrayList<Documento> listadocumento;

    public DocumentoRepositorio(ArrayList<Documento> documentos){
        this.listadocumento = documentos;
    }

    public void salvar(Documento documento){
        listadocumento.add(documento);
    }

    public boolean remover(Documento documento){
        return listadocumento.remove(documento);
    }

    public ArrayList<Documento> listarDocumento(){
        return listadocumento;
    }

    public void alteraDescricao(Documento documento){
        for(Documento documentos: listadocumento){
            if(documentos.getDescricaoDocumento().equals(documento.getDescricaoDocumento())){
                documentos.setDescricaoDocumento(documento.getDescricaoDocumento());
                break;
            }
        }
    }


}
