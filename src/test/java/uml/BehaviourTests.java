package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BehaviourTests {
    
    @Test
    void toStringBehaviourWithNoArguments() {
        Behaviour noArgBehaviour = new Behaviour(Access.PUBLIC, "void", "myBehaviour");
        assertEquals("Behaviour [public void myBehaviour()]", noArgBehaviour.toString());
    }

    @Test
    void toStringBehaviourWithOneArgument() {
        Behaviour oneArgBehaviour = new Behaviour(Access.PRIVATE, "int", "log", new Argument("int", "x"));
        assertEquals("Behaviour [private int log(int x)]", oneArgBehaviour.toString());
    }
}
