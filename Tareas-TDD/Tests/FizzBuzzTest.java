import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void Testpara1y2(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(1);
        String resultado2 =fizz.calcular(2);
        //Assert
        Assertions.assertEquals("1",resultado1);
        Assertions.assertEquals("2",resultado2);
    }
    @Test
    void Testpara3(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(3);
        //Assert
        Assertions.assertEquals("Fizz",resultado1);
    }
    @Test
    void Testpara4y5(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(4);
        String resultado2 =fizz.calcular(5);
        //Assert
        Assertions.assertEquals("4",resultado1);
        Assertions.assertEquals("Buzz",resultado2);
    }
    @Test
    void Testpara6(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(6);
        //Assert
        Assertions.assertEquals("Fizz",resultado1);
    }
    @Test
    void Testpara7y8y9(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(7);
        String resultado2 =fizz.calcular(8);
        String resultado3 =fizz.calcular(9);

        //Assert
        Assertions.assertEquals("7",resultado1);
        Assertions.assertEquals("8",resultado2);
        Assertions.assertEquals("Fizz",resultado3);
    }
    @Test
    void Testpara10(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(10);
        //Assert
        Assertions.assertEquals("Buzz",resultado1);
    }
    @Test
    void Testpara11y12y13y14(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1 =fizz.calcular(11);
        String resultado2 =fizz.calcular(12);
        String resultado3 =fizz.calcular(13);
        String resultado4 =fizz.calcular(14);

        //Assert
        Assertions.assertEquals("11",resultado1);
        Assertions.assertEquals("Fizz",resultado2);
        Assertions.assertEquals("13",resultado3);
        Assertions.assertEquals("14",resultado4);
    }
    @Test
    void Testpara15(){
        //Arrange
        FizzBuzz fizz = new FizzBuzz();
        //Act
        String resultado1=fizz.calcular(15);
        //Assert
        Assertions.assertEquals("FizzBuzz",resultado1);
    }
}
