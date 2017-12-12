package immutable.queue;

public class Join<E> extends Queue<E>
{
    private final Queue<E> q;
    private final E x;
    
    public Join(E x, Queue<E> q)
    {
        this.x = x;
        this.q = q;
    }
    
    public E front() throws Exception
    {
        if (q.isEmpty())
            return x;
        else
            return q.front();
    }

    public Queue<E> leave() throws Exception
    {
        if (q.isEmpty())
            return new Empty<E>();
        else
            return q.leave().join(x);
    }

    public boolean isEmpty()
    {
        return false;
    }

    public String toString()
    {
        return x.toString() + "-->" + q.toString();
    }
}