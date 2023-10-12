package org.example;

import java.util.logging.Logger;

public class Conexao {

    private static final Logger LOGGER = Logger.getLogger(Conexao.class.getName());
    public static void iniciarConexao(){
        LOGGER.info("Iniciou a conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(){
        LOGGER.info("Inserindo dados");
    }

    public static void removeDados(){
        LOGGER.info("Removendo dados");
    }
}
