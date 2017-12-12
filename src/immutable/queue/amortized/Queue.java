package immutable.queue.amortized;
import immutable.stack.*;

public class Queue<E>
{
    private final Stack<E> f, b;
    
    public Queue()
    {
        this.f = new immutable.stack.Empty<E>();
        this.b = new immutable.stack.Empty<E>();
    }
    
    private Queue(Stack<E> b, Stack<E> f)
    {
        this.f = f;
        this.b = b;
    }
    
    public boolean isEmpty()
    {
        return f.isEmpty();
    }
    
    private Queue<E> reverse() throws Exception
    {
        if (b.isEmpty())
            return this;
        else
            return new Queue<E>(b.pop(),f.push(b.top())).reverse();
    }
    
    public Queue<E> join(E x)
    {
        if (f.isEmpty())
            return new Queue<E>(b,f.push(x));
        else
            return new Queue<E>(b.push(x),f);
    }
    
    public Queue<E> leave() throws Exception
    {
        if (f.isEmpty())
            throw new Exception("leave: Empty Queue");
        else if (f.pop().isEmpty())
            return new Queue<E>(b,f.pop()).reverse();
        else
            return new Queue<E>(b,f.pop());
    }

    public E front() throws Exception
    {
        if (this.isEmpty())
            throw new Exception("front: Empty Queue");
        else if (f.isEmpty())
            return this.reverse().front();
        else
            return f.top();     
    }
   
    public String toString()
    {
        return "Queue(b:" + b.toString() + ", f:" + f.toString() + ")";
    }
}