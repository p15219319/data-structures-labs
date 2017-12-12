package immutable.queue;

public class Empty<E> extends Queue<E>
{
    public E front() throws Exception
    {
        throw new Exception("front: Empty Queue");
    }

    public Queue<E> leave() throws Exception
    {
        throw new Exception("leave: Empty Queue");
    }

    public boolean isEmpty()
    {
        return true;
    }
  
    public Queue<E> join(E x)
    {
        return new Join<E>(x, this);
    }
    
    public String toString()
    {
        return  "Empty";
    }
}