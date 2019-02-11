import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Test
    public void hasSheetsRemaining(){
        printer = new Printer(20);
        assertEquals(20, printer.sheetsRemaining());
    }

    @Test
    public void canPrint(){
        printer = new Printer(20);
        printer.print(2,5);
        assertEquals(10, printer.sheetsRemaining());
    }
}
