package factory;

public enum FormatType {
    JSON("json"), CSV("csv"), XML("xml");

    private String extension;

    FormatType(String extension) {
        this.extension = extension;
    }
}
