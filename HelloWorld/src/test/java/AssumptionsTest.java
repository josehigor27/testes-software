import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class AssumptionsTest {

    @Test
    void validarSomenteNoUsuario(){
        //System.out.println(System.getenv("USER"));
        Assumptions.assumeTrue("root".equals((System.getenv("USER"))));
        Assertions.assertEquals(10,5+5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS,OS.LINUX,OS.MAC})
    @EnabledOnJre(JRE.JAVA_17)
    void validarSoma(){

        Assertions.assertEquals(10,5+5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS,OS.LINUX,OS.MAC})
    @EnabledForJreRange(min = JRE.JAVA_8,max = JRE.JAVA_20)
    void validarSoma2(){

        Assertions.assertEquals(10,5+5);
    }
}
