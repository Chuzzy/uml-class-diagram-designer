package uml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BehaviourTest {
    
    @Test
    public void toStringBehaviourWithNoArguments() {
        Behaviour noArgBehaviour = new Behaviour(Access.PUBLIC, "void", "myBehaviour");
        assertEquals("Behaviour [public void myBehaviour()]", noArgBehaviour.toString());
    }

    @Test
    public void toStringBehaviourWithOneArgument() {
        Behaviour oneArgBehaviour = new Behaviour(Access.PRIVATE, "int", "log", new Argument("int", "x"));
        assertEquals("Behaviour [private int log(int x)]", oneArgBehaviour.toString());
    }
}
