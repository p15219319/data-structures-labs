package immutable.list;
import java.util.function.Function;
import java.util.function.Predicate;

public class List<E>
{
    public boolean isEmpty()
    {
        return true;
    }

    public int length()
    {
        return 0;
    }

    public E head() throws Exception
    {
        throw new Exception("head: Empty List");
    }

    public List<E> tail() throws Exception
    {
        throw new Exception("tail: Empty List");
    }

    public String toString()
    {
        return "[]";
    }

    public List<E> append(final List<E> that) throws Exception
    {
            return that;
    }

    public <F> List<F> map(Function<E,F> f) throws Exception
    {
            return new List<F>();
    }

    public List<E> filter(Predicate<E> p) throws Exception
    {
            return new List<E>();
    }

    public List<E> cons(final E x)
    {
        return new List<E>()
        {
            public boolean isEmpty()
            {
                return false;
            }
            public int length()
            {
                return 1 + this.tail().length();
            }
            public E head()
            {
                return x;
            }
            public List<E> tail()
            {
                return List.this;
            }
            public String toString()
            {
                try { return this.head().toString() + ":" + this.tail().toString(); }
                catch (Exception e) { return "fail"; }
            }
            public List<E> append(final List<E> that) throws Exception
            {
                return this.tail().append(that).cons(this.head());
            }
            public <F> List<F> map(Function<E,F> f) throws Exception
            {
                return this.tail().map(f).cons(f.apply(this.head()));
            }
            public List<E> filter(Predicate<E> p) throws Exception
            {
                if (p.test(this.head()))
                    return this.tail().filter(p).cons(this.head());
                else
                    return this.tail().filter(p);
            }
        };
    }
}
