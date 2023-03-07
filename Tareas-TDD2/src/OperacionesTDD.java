public class OperacionesTDD {
    public int suma(String nums){
        if (nums.length()==0){
            return 0;
        }
        int intof=0;
        for (int i = 0; i < nums.length();i++){
            String sub = nums.substring(i,i+1);
            if (!sub.equals(",")){
                intof= intof+Integer.valueOf(sub);
            }
        }
        return intof;
    }
}
