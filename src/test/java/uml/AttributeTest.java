package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AttributeTest {
    
    @Test
    void toStringTest() {
        Attribute attribute = new Attribute(Access.PRIVATE, "String", "name");
        assertEquals("Attribute [private String name]", attribute.toString());
    }
}
