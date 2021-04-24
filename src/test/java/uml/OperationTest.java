package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperationTest {
    
    @Test
    public void toStringOperationWithNoArguments() {
        Operation noArgOperation = new Operation(Access.PUBLIC, "void", "myOperation");
        assertEquals("Operation [public void myOperation()]", noArgOperation.toString());
    }

    @Test
    public void toStringOperationWithOneArgument() {
        Operation oneArgOperation = new Operation(Access.PRIVATE, "int", "log", new Argument("int", "x"));
        assertEquals("Operation [private int log(int x)]", oneArgOperation.toString());
    }
}
