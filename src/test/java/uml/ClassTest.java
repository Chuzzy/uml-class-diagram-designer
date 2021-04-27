package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A UML Class")
public class ClassTest {

    Class umlClass;

    @Test
    @DisplayName("has a zero-arg constructor")
    void hasNoArgCtor() {
        new Class();
    }

    @Nested
    @DisplayName("when it has one attribute")
    class oneAttribute {
        @BeforeEach
        void createClassWithOneAttribute() {
            umlClass = new Class("SimpleClass");
            umlClass.addAttribute(new Attribute(Access.PUBLIC, "int", "value"));
        }

        @Test
        @DisplayName("outputs Java code with one attribute in it")
        void outputsJavaCodeWithOneAttribute() {
            assertEquals(String.join("\n", "public class SimpleClass {", "    public int value;", "}", ""),
                    umlClass.generateJavaCode(false, false, 4));
        }
    }
}
