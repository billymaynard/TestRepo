public class OperacionesTDD {
    public int suma(String nums){
        if (nums.length()==0){
            return 0;
        }
        if (nums.substring(0, 1).equals(",") || nums.substring(nums.length()-1, nums.length()).equals(",")){
            return -1;
        }
        int total=0;
        String [] numbers = nums.split(",");
        for (String valor : numbers){
            if (valor==""){
                return -1;
            }
            int intof = Integer.valueOf(valor);
            if (intof < 0){
                System.out.println("Numeros negativos no validos");
                return -1;
            }
            if (intof>1000){
                System.out.println("Numero superior a 1000 ignorado...");
            }else {
                total=total+intof;
            }
        }
        return total;
    }
}
