package com.example.pojo;

public class MiHelper {
    MiHelper(){

    }
    public void validarPassdword(String pass,String rpass) throws CustomException{
        if (!pass.equals(rpass)){
                throw new CustomException("Los campos de password no coinciden ");
        }

        if(pass.length()<8){
            throw new CustomException("Los campos de password no es lo suficientemente grande ");
        }

    }
}
