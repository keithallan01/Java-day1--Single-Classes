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

    public int volume(){
        return this.volume;
    }

    public void fill(){
        this.sheets = 20;
    }


//    public void print(int numPages, int numCopies) {
//        if (this.sheets >= numPages * numCopies) {
//            this.sheets -= numPages * numCopies;
//            this.volume -= numPages * 1;
//        }
//    }


    public void print(int numPages, int numCopies) {
        int totalPages = numPages * numCopies;
        if (totalPages < sheets) {
            this.sheets -= totalPages;
            this.volume -= totalPages;
        }
    }
}