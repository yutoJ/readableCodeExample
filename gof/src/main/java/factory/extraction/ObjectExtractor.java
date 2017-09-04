package factory.extraction;

import factory.data.CommonMessage;
import factory.data.Message;

import java.io.Reader;

public abstract class ObjectExtractor<T extends Message> extends Reader implements Iterable<T> {

    //protected abstract void checkFormat();
    //protected abstract CommonMessage extract();


}
