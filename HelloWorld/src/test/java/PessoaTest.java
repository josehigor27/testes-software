import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class PessoaTest {
    @Test
    void validarCalculoDeIdade(){
        var pessoa = new Pessoa("José", LocalDate.of(1997,4,28));
        Assertions.assertEquals(26,pessoa.getIdade());

    }

    @Test
    void validarSeEhMaiorDeIdade(){
        var pessoa = new Pessoa("José", LocalDate.of(1997,4,28));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade(),"Testetststs");


    }

    @Test void validarArrayEquals(){
        int [] a = {10,20,30,40};
        int [] b = {10, 20, 30, 40};
        //Assertions.assertArrayEquals(a,b);
        Assertions.assertNotEquals(a,b);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }
}
