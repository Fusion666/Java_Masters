public class Table {
    private String typeOfTables;
    private String typeOfMaterial;
    private int numberOfTables;

    public Table(String typeOfTables, String typeOfMaterial, int numberOfTables) {
        this.typeOfTables = typeOfTables;
        this.typeOfMaterial = typeOfMaterial;
        this.numberOfTables = numberOfTables;
    }

    public String getTypeOfTables() {
        return typeOfTables;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }
}
