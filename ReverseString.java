public class ReverseString {

   public static String ReverseStrinng(String s){
        int e= s.length()-1;
        String sec= "";
        
        while(e>=0){

            sec = sec+ s.charAt(e);
            e--;

        }

        return sec;
    }



    public static void main(String[] args){


        String s = "TAP ACADEMY";

        System.out.println(ReverseStrinng(s));
    }
    
}
