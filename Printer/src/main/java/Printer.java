public class Printer {
    private int sheets;
    private int volume;

    public Printer(int sheets, int volume){
        this.sheets = sheets;
        this.volume= volume;
    }

    public int sheetsRemaining(){
       return this.sheets;
    }


    public void print(int numPages, int numCopies) {
        if (this.sheets >= numPages * numCopies) {
            this.sheets -= numPages * numCopies;
            this.volume -= numPages * 1;
        }
    }

    public void fill(){
        this.sheets = 20;
    }

    public int volume(){
        return this.volume;
    }
}