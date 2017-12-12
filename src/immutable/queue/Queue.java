package immutable.queue;

public abstract class Queue<E>
{
    public abstract E front() throws Exception;
    public abstract Queue<E> leave() throws Exception;
    public abstract boolean isEmpty();
    public Queue<E> join(final E x) {
        return new Join<E>(x, this);
    }
}
