package sample.exceptions;

import org.omg.CORBA.portable.ApplicationException;

import java.util.Arrays;

public class MyAppException extends Exception {
    private String id;
    private Object[] params;

    public MyAppException(String id, Object... params){
        super();
        this.id = id;
        this.params = Arrays.copyOf(params, params.length);
    }

    public MyAppException(String id, Throwable cause, Object... params){
        super(cause);
        this.id = id;
        this.params = Arrays.copyOf(params, params.length);
    }

    public String getId() {
        return id;
    }

    public Object[] getParams() {
        return params;
    }
}
