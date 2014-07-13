package iteration;

/**
 * Created by saikat on 7/13/2014.
 */


import java.util.Queue;
import java.util.Stack;

public class MyFolder<T, U> implements Folder<T, U>
{


    public U fold(U u, Queue<T> ts, Function2<T, U, U> function)
    {

        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();

        if (ts.isEmpty()) {
            return u;
        }

        Stack<T> stack = new Stack();
        while(!ts.isEmpty()){
            stack.push(ts.poll());
        }
        U r = null;
        while(!stack.isEmpty()){
            r = function.apply(stack.pop(),u);
        }


      return r;
    }
}