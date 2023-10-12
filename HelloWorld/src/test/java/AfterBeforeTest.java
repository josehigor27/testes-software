import org.example.Conexao;
import org.junit.jupiter.api.*;

public class AfterBeforeTest {
    @BeforeAll
    static void configuraConexao() {
        Conexao.iniciarConexao();
    }

    @BeforeEach
    void insereDados(){
        Conexao.insereDados();
    }
    @AfterEach
     void removeDados(){
        Conexao.removeDados();
    }

    @Test
    void validarTesteConexao() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarTesteConexao2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        Conexao.finalizarConexao();
    }
}
