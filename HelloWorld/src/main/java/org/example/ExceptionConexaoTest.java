package org.example;

public class ExceptionConexaoTest {

    public void conexao(String ipOrigem, String ipDestino, int porta){
        if(porta <= 8080){
            throw new IllegalArgumentException("Porta informada deve ser maior que a porta 8080");
        }
    }
}
