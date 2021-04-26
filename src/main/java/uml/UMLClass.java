package uml;

import java.util.ArrayList;

public class UMLClass {
    private ArrayList<Attribute> attributes;
    private ArrayList<Operation> operations;
    private String name;

    public UMLClass() {
        this("");
    }

    public UMLClass(String name) {
        attributes = new ArrayList<>();
        operations = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public boolean addAttribute(Attribute attribute) {
        return attributes.add(attribute);
    }

    public boolean removeAttribute(Attribute attribute) {
        return attributes.remove(attribute);
    }

    public boolean addOperation(Operation operation) {
        return operations.add(operation);
    }

    public boolean removeOperation(Operation operation) {
        return operations.remove(operation);
    }

    /**
     * Generates Java source code which represents the attributes and operations in
     * the UML class.
     * 
     * @param useCarriageReturn whether to use {@code CRLF} as opposed to {@code LF}
     *                          to represent line endings
     * @param useTabs whether to use tabs as opposed to spaces to indent code
     * @param indentCount the number of tabs/spaces used to indent code
     * @return Java source code which models the UML class
     */
    public String generateJavaCode(boolean useCarriageReturn, boolean useTabs, int indentCount) {
        String lineEnding = useCarriageReturn ? "\r\n" : "\n";
        String indentation = (useTabs ? "\t" : " ").repeat(indentCount);
        StringBuilder code = new StringBuilder("public class " + name + " {" + lineEnding);
        for (Attribute attribute : attributes) {
            code.append(indentation + attribute.asJavaCode() + lineEnding);
        }
        code.append(lineEnding);
        for (Operation operation : operations) {
            code.append(indentation + operation.asJavaCode() + lineEnding);
        }
        code.append("}" + lineEnding);
        return code.toString();
    }
}
