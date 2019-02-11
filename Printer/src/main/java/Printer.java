public class Printer {
    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int sheetsRemaining(){
       return this.sheets;
    }
}