public class AllSubstrings {

    static void printAllSubstrings(String st){
        int n= st.length();
        String rs="";
        for(int len=1;len<=(n-len);len++){
            for(int s=0; s<=(n-len); s++){
                for(int e=s;e<=(s+len)-1;e++){
                    System.out.print(st.charAt(e));
                }
                System.out.println();
            }
        }

    }



    public static void main(String[] args){
        String s= "Prasad";

        printAllSubstrings(s);

    }
    
}
