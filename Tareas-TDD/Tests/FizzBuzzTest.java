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
}
