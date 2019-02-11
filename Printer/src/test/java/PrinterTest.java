import org.junit.Test;

public class PrinterTest {

    Printer printer;

    @Test
    public void hasPaper(){
        printer = new Printer(10);
        assertEquals(10, printer.paper());
    }
}
