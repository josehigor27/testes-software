import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class Ordenacao4 {

    @DisplayName("C")
    @Test void validarArrayEqualsB(){
        Assertions.assertTrue(true);
    }


    @DisplayName("B")@Test void validarArrayEqualsA(){
        Assertions.assertTrue(true);
    }


    @DisplayName("A")

    @Test void validarArrayEqualsC(){
        Assertions.assertTrue(true);
    }
}
