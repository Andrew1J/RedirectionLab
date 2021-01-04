import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){

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
        String[]diagraphs =  {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh",
        "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
        "st", "sw", "th", "tr", "tw", "wh", "wr"};
        boolean isDiagraph = false;
        for(int i=0;i<diagraphs.length;i++){
            if (s.substring(0,2).equals(diagraphs[i]){
                isDiagraph = true;
            }
        }
        if(isDiagraph){
            return s.substring(2) + s.substring(0,2) + "ay";
        } else {
            return pigLatinSimple(s);
        }
    }
}
