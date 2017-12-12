package immutable.stack;

public abstract class Stack<E>
{
      public abstract boolean isEmpty();
      public abstract E top() throws Exception;
      public abstract Stack<E> pop() throws Exception;
      public Stack<E> push(E x)
      {
          return new Push<E>(x,this);
      }
}