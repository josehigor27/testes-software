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
}
