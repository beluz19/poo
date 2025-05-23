package util;

import model.Endereco;

public class ClonarEndereco {
    
    public Endereco clonar(Endereco endereco){
        return new Endereco(
            endereco.getRua(),
            endereco.getCidade(),
            endereco.getCep(),
            endereco.getEstado());
    }

}
