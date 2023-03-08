import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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
    @Test
    void TestCdelPunto4(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("1,2");
        Assertions.assertEquals(3,respuesta);
    }
    @Test
    void TestDdelPunto4(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("1,1,2");
        Assertions.assertEquals(4,respuesta);
    }
    @Test
    void TestAdelPunto5(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("1,2,");
        Assertions.assertEquals(-1,respuesta);
    }
    @Test
    void TestAdelPunto6(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("1,2,-2");
        Assertions.assertEquals(-1,respuesta);
    }
    @Test
    void TestAdelPunto7(){
        OperacionesTDD test = new OperacionesTDD();
        int respuesta = test.suma("5,1002,7");
        Assertions.assertEquals(12,respuesta);
    }
}