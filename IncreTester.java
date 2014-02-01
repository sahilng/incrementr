
/**
 * Write a description of class IncreTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class IncreTester
{

    public IncreTester(String target, int occurrences, String indexRange)
    {
        Incrementer myIncrementer = new Incrementer(target, occurrences);
        ArrayList<String> output = myIncrementer.increment(indexRange);
        for(String s: output){
            System.out.println(s);
        }
        
    }
    
    
    
}
