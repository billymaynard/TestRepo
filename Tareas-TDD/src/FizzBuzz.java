public class FizzBuzz {
    public String calcular(int a){
        if (a%3==0){
            return "Fizz";
        } else if (a%5==0) {
            return "Buzz";
        }
        String respuesta= String.valueOf(a);
        return respuesta;
    }
}