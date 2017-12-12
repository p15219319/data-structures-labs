package immutable.stack;

public class Push<E> extends Stack<E>
{
    private final E x;
    private final Stack<E> s;
    public Push(E x, Stack<E> s) {
        this.x = x;
        this.s = s;
    }
    public boolean isEmpty()
    {
        return false;            // not isempty(push(x,s))
    }
    public E top() throws Exception
    {
        return x;                // top(push(x,s)) = x
    }
    public Stack<E> pop() throws Exception
    {
        return s;                // pop(push(x,s)) = s
    }
    public String toString()
    {
        return "Push(" + x + "," + s.toString() + ")";
    }
}
