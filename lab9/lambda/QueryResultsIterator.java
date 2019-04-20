
/**
 * Write a description of interface QueryResultsIterator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface QueryResultsIterator
{
    public String first();
    public String next();
    public String currentItem();
    public boolean isDone();
}