public class Printer {
    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int sheetsRemaining(){
       return this.sheets;
    }

    public void print(int numPages, int numCopies){
        this.sheets -= numPages * numCopies;
    }
}