package peaksoft.models;

public class Director {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Режиссер: " + fullName;
    }
}
