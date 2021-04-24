package uml;

import java.util.Arrays;
import java.util.List;

public class Behaviour {
    private Access accessModifier;
    private String returnType;
    private List<Argument> arguments;
    private String name;

    public Behaviour(Access accessModifier, String returnType, String name, Argument... arguments) {
        this.accessModifier = accessModifier;
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
        Behaviour other = (Behaviour) obj;
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
        String[] argsString = arguments.stream().map(arg -> arg.getType() + " " + arg.getName()).toArray(String[]::new);
        return String.format("Behaviour [%s %s %s(%s)]", accessModifier, returnType, name, String.join(", ", argsString));
    }
}
