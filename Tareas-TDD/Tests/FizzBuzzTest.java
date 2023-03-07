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
}
