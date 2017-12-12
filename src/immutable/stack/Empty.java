package immutable.stack;

public class Empty<E> extends Stack<E>
{
    public Empty() {}
    public boolean isEmpty()
    {
        return true;                // isempty(empty)
    }
    public E top() throws Exception
    {
        throw new Exception("top"); // top(empty) = error
    }
    public Stack<E> pop() throws Exception
    {
        throw new Exception("pop"); // pop(empty) = error
    }
    public String toString()
    {
        return "Empty";
    }
}