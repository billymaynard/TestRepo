public class OperacionesTDD {
    public int suma(String nums){
        if (nums.length()==0){
            return 0;
        }
        int intof=0;
        String number="";
        int marker=0;
        for (int i = 0; i < nums.length();i++){
            if (nums.substring(0, 1).equals(",") || nums.substring(nums.length()-1, nums.length()).equals(",")){
                return -1;
            }
            String sub = nums.substring(i,i+1);
            if (!sub.equals(",")){
                number=number+sub;
                marker=0;
            }else{
                if (marker==1){
                    return -1;
                }
                number="";
                intof=intof+Integer.valueOf(number);
                marker=1;
            }
        }
        return intof;
    }
}
