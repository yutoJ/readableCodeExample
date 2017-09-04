package factory.data;


import lombok.Data;

@Data
public class CommonMessage extends Message{
    private String id;
    private String name;

    public CommonMessage(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CommonMessage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
