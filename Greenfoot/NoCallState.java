/**
 * Write a description of class NoCallState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoCallState extends GameState 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class NoCallState
     */
    public NoCallState()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public String toString()
    {
        return "No Call State";
    }
}