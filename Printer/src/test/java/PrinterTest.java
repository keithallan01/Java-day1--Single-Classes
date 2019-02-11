import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Test
    public void hasSheetsRemaining(){
        printer = new Printer(20);
        assertEquals(20, printer.sheetsRemaining());
    }
}
