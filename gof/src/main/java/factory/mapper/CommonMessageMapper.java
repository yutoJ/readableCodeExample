package factory.mapper;

import factory.data.CommonMessage;

public class CommonMessageMapper {

    public CommonMessageMapper() {
    }

    public CommonMessage map(String line){
        String[] fileds = line.split(",");
        return new CommonMessage(fileds[0], fileds[1]);
    }
}
