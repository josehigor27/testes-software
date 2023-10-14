import org.example.Conexao;
import org.example.ExceptionConexaoTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void validarCenarioDeExcecaoNaConexao(){
        ExceptionConexaoTest exceptionConexaoTest = new ExceptionConexaoTest();
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
           exceptionConexaoTest.conexao("","",8080); //espera que a exceção seja lançada

        });

        Assertions.assertDoesNotThrow(()->exceptionConexaoTest.conexao("","",8081)); //NAO espera que a exceção seja lançada
    }
}
