package polymorfisme.output;

/*
 * FileName Value Object omdat je met een String niet kutn aangeven 
 * Wat de bedoeling van de String moet zijn, op deze manier wel
 */
public class FileName {

    private String fileName;

    public FileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}
