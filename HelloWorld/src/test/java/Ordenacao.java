import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Ordenacao {
    //@Order(3)
    @Test
    void validarArrayEqualsA(){
        Assertions.assertTrue(true);
    }

    //@Order(2)
    @Test void validarArrayEqualsB(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test void validarArrayEqualsC(){
        Assertions.assertTrue(true);
    }
}
