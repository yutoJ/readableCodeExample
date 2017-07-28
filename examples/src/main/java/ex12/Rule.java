package ex12;

public interface Rule {

    public boolean ok(Value value);


    default boolean ng(Value value){
        return ! ok( value );
    }
}
