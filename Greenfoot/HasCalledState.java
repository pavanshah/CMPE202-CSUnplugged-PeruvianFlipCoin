/**
 * Write a description of class HasCalledState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HasCalledState extends GameState 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HasCalledState
     */
    public HasCalledState()
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
        return "Captain has called Rival Captain";
    }
}
