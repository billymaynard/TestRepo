import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    void TestAdelPunto4(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("");
        Assertions.assertEquals(0,respuesta);
    }
    @Test
    void TestBdelPunto4(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("1");
        Assertions.assertEquals(1,respuesta);
    }
}