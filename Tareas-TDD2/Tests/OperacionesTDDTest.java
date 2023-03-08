import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OperacionesTDDTest {
    @Test
    void TestAdelPunto4(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("");
        //Assert
        Assertions.assertEquals(0,respuesta);
    }
    @Test
    void TestBdelPunto4(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("1");
        //Assert
        Assertions.assertEquals(1,respuesta);
    }
    @Test
    void TestCdelPunto4(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("1,2");
        //Assert
        Assertions.assertEquals(3,respuesta);
    }
    @Test
    void TestDdelPunto4(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("1,1,2");
        //Assert
        Assertions.assertEquals(4,respuesta);
    }
    @Test
    void TestAdelPunto5(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("1,2,");
        //Assert
        Assertions.assertEquals(-1,respuesta);
    }
    @Test
    void TestAdelPunto6(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("1,2,-2");
        //Assert
        Assertions.assertEquals(-1,respuesta);
    }
    @Test
    void TestAdelPunto7(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();
        //Act
        int respuesta = test.suma("5,1002,7");
        //Assert
        Assertions.assertEquals(12,respuesta);
    }
}