
/**
 * Write a description of class Incrementer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Incrementer
{
    private String target;
    private int occurrences;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private ArrayList<String> returnArray = new ArrayList<String>();
    private int start;
    private int end;
    private String before;
    private String after;
    private String toIncrement;

    public Incrementer(String target, int occurrences){
        this.target = target;
        this.occurrences = occurrences;
    }

    public ArrayList<String> increment(String indexRange)
    {
        String toAdd;
        for(int i = 0; i < occurrences; i++){
            parseIndexRange(indexRange);
            toAdd = "" + before + upByOne(toIncrement) + after;

            target = toAdd;

            returnArray.add(toAdd);
        }
        return returnArray;
    }

    private String parseIndexRange(String toParse)
    {
        int i = 0;
        for(i=0; toParse.charAt(i)!='-'; i++){
            i++;
        }
        start = Integer.parseInt(toParse.substring(0,i));
        end = Integer.parseInt(toParse.substring(i+1));

        before = target.substring(0,start);
        after = target.substring(end+1);
        toIncrement = target.substring(start, end+1);

        String toReturn = "start has been set to: " + start + " and end has been set to: " + end;
        return toReturn;
    }

    private String upByOne (String toUP)
    {
        String toReturn;
        boolean isInt = false;
        if(toUP.equals("1") || toUP.equals("2") || toUP.equals("3") || toUP.equals("4") || toUP.equals("5") || toUP.equals("6") || toUP.equals("7") || toUP.equals("8") || toUP.equals("9")){
            isInt = true;
        }

        if(isInt){
            toReturn = "" + (Integer.parseInt(toUP) + 1);
        }
        //if char
        else{
            char charToUP = toUP.charAt(0);
            toReturn = "" + oneUPChar(charToUP);
        }
        return toReturn;

    }

    public char oneUPChar(char c){
        char toReturn = '!';
        if(Character.isLowerCase(c)){
            for(int i = 0; i < alphabet.length(); i++){
                if(alphabet.charAt(i) == c){
                    toReturn = alphabet.charAt(i+1);
                }

            }
        }
        else{
            for(int i = 0; i < upperAlphabet.length(); i++){
                if(upperAlphabet.charAt(i) == c){
                    toReturn = upperAlphabet.charAt(i+1);
                }

            }

        }

        return toReturn;
    }

}

