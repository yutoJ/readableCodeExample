import factory.data.CommonMessage;
import factory.data.Message;
import factory.extraction.CsvObjectReader;
import factory.mapper.CommonMessageMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String path = new File(".").getAbsoluteFile().getParent();
        System.out.println(path);

        CsvObjectReader csvObjectReader;
        List<CommonMessage> output = new ArrayList<CommonMessage>();

        try{
            File file = new File("./gof/src/main/resources/sample.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            csvObjectReader = new CsvObjectReader(br, new CommonMessageMapper());
            Iterator<CommonMessage> it = csvObjectReader.iterator();

            while (it.hasNext()){
                output.add(it.next());
            }

            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }

        System.out.print(output.toString());

    }
}
