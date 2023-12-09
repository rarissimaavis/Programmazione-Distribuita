package ejb;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@javax.interceptor.Interceptor
@InterceptorCount
public class Interceptor implements Serializable {
    
    private Map<String, Integer> map = new HashMap();
    
    @AroundInvoke
    public Object countMethod(InvocationContext ctx) throws Exception {
        try{
            Integer count = map.get(ctx.getMethod().getName());
            if(count != null){
                map.put(ctx.getMethod().getName(), count + 1);
            } else {
                map.put(ctx.getMethod().getName(), 1);
            }
            return ctx.proceed();
        } finally { 
            System.out.println("Il metodo " + ctx.getMethod().getName() + " è stato richiamato per " + map.get(ctx.getMethod().getName()));
        }
    }
}
