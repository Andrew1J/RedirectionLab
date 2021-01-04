import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            Scanner words = new Scanner(s);
            String res = "";
            
            String line = s.nextLine()
        }
    }

    public static String pigLatinSimple(String s){
        s = s.toLowerCase();
        if(s.charAt(0)== 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o'
        || s.charAt(0) == 'u'){
			return s + "hay";
		} else {
			return s.substring(1) + s.charAt(0) + "ay";
		}
    }

    public static String pigLatin(String s){
        s = s.toLowerCase();
        boolean isDiagraph = false;
        String[]diagraphs =  {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
        "st", "sw", "th", "tr", "tw", "wh", "wr"};
        if(s.length()>=2){
            for(int i=0;i<diagraphs.length;i++){
                if (s.substring(0,2).equals(diagraphs[i]){
                    isDiagraph = true;
                }
            }
        }
        if(isDiagraph){
            return s.substring(2) + s.substring(0,2) + "ay";
        } else {
            return pigLatinSimple(s);
        }
    }

    public static String pigLatinBest(String s){
        s = s.toLowerCase();
        if(!Character.isLetter(s.charAt(0))){
            return s;
        }
        String ans = "";
        if(!Character.isLetter(s.charAt(s.length()-1))){
            res = pigLatin(s.substring(0,s.length()-1));
        }
        if(!Character.isDigit(s.charAt(s.length()-1))){
            res += s.charAt(s.length()-1);
        }
        return res;
    }
}
