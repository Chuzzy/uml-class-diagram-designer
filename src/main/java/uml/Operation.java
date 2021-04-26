package uml;

import java.util.Arrays;
import java.util.List;

public class Operation {
    private Access accessModifier;
    private boolean isStatic;
    private String returnType;
    private List<Argument> arguments;
    private String name;

    public Operation(Access accessModifier, String returnType, String name, Argument... arguments) {
        this.accessModifier = accessModifier;
        this.isStatic = false;
        this.returnType = returnType;
        this.name = name;
        this.arguments = Arrays.asList(arguments);
    }

    public Operation(Access accessModifier, boolean isStatic, String returnType, String name, Argument... arguments) {
        this.accessModifier = accessModifier;
        this.isStatic = isStatic;
        this.returnType = returnType;
        this.name = name;
        this.arguments = Arrays.asList(arguments);
    }

    public Access getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(Access accessModifier) {
        this.accessModifier = accessModifier;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean isStatic) {
        this.isStatic = isStatic;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public List<Argument> getArguments() {
        return arguments;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accessModifier == null) ? 0 : accessModifier.hashCode());
        result = prime * result + ((arguments == null) ? 0 : arguments.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((returnType == null) ? 0 : returnType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Operation other = (Operation) obj;
        if (accessModifier != other.accessModifier)
            return false;
        if (arguments == null) {
            if (other.arguments != null)
                return false;
        } else if (!arguments.equals(other.arguments))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (returnType == null) {
            if (other.returnType != null)
                return false;
        } else if (!returnType.equals(other.returnType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Operation [%s %s %s(%s)]", accessModifier, returnType, name, argsString());
    }

    /**
     * <p>
     * Returns the representation of the arguments of this operation as they would
     * appear in a C-style language.
     * </p>
     * 
     * <p>
     * For example:
     * </p>
     * 
     * <pre>
     * Operation op = new Operation(Access.PRIVATE, false, "void", "doSomething", new Argument("int", "a"), new Argument("String", "b"));
     * </pre>
     * 
     * <p>
     * The result of {@code op.argString()} would be the string
     * {@code int a, String b}
     * </p>
     * 
     * @return string representation of this operation's arguments
     */
    private String argsString() {
        String[] argsString = arguments.stream().map(arg -> arg.getType() + " " + arg.getName()).toArray(String[]::new);
        return String.join(", ", argsString);
    }
}
