package factory.extraction;

import factory.data.CommonMessage;
import factory.data.Message;
import factory.mapper.CommonMessageMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CsvObjectReader extends ObjectExtractor {

    private BufferedReader reader;
    private IOException ioException;
    private CommonMessageMapper messageMapper;

    public CsvObjectReader(BufferedReader reader, CommonMessageMapper messageMapper) {

        this.reader = reader;
        this.messageMapper = messageMapper;
    }

    public CsvObjectReader(Reader reader, CommonMessageMapper messageMapper ) {
        this.reader = new BufferedReader(reader);
        this.messageMapper = messageMapper;
    }

    private class MessageIterator<E extends Message> implements Iterator<E> {

        //TODO
        //private CommonMessage[] messages;

        private String line;


        public boolean hasNext() {
            try {
                return this.hasNextLine();
            } catch (IOException e) {
                ioException = e;
                return false;
            }
        }


        public E next() {
            try {
                return (E) messageMapper.map(this.nextLine());
            } catch (IOException e) {
                ioException = e;
                throw new IllegalStateException(e);
            }
        }

        public void remove() {
            // Dont use it.
            throw new UnsupportedOperationException();
        }

        private String nextLine() throws IOException {
            String line = this.line;
            if (line == null) {
                line = reader.readLine();
                if (line == null) {
                    throw new NoSuchElementException();
                }
            } else {
                this.line = null;
            }
            return line;
        }

        private boolean hasNextLine() throws IOException {
            if (this.line == null) {
                this.line = reader.readLine();
            }
            return this.line != null;
        }

        //TODO
        //private boolean hasNextMessage() throws IOException {}

    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return reader.read(cbuf, off, len);
    }

    public Iterator<CommonMessage> iterator() {
        return new MessageIterator();
    }
}
