import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Test
    public void hasSheetsRemaining(){
        printer = new Printer(20, 50);
        assertEquals(20, printer.sheetsRemaining());
    }

    @Test
    public void canPrint(){
        printer = new Printer(20, 50);
        printer.print(3,5);
        assertEquals(5, printer.sheetsRemaining());
    }

    @Test
    public void insufficientPaper(){
        printer = new Printer(10, 50);
        printer.print(7,2);
        assertEquals(10, printer.sheetsRemaining());
    }


    @Test
    public void canFill(){
        printer = new Printer(10, 50);
        printer.fill();
        assertEquals(20, printer.sheetsRemaining());
    }

    @Test
    public void hasTonerVolume(){
        printer = new Printer(10, 50);
        assertEquals(50, printer.volume());
    }

    @Test
    public void reduceToner(){
        printer = new Printer(10, 50);
        printer.print(5, 1);
        assertEquals(45, printer.volume());
    }

}
