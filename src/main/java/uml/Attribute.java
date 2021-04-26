package uml;

public class Attribute {
    private Access accessModifier;
    private boolean isStatic;
    private String type;
    private String name;

    public Attribute(Access accessModifier, String type, String name) {
        this.accessModifier = accessModifier;
        this.isStatic = false;
        this.type = type;
        this.name = name;
    }

    public Attribute(Access accessModifier, boolean isStatic, String type, String name) {
        this.accessModifier = accessModifier;
        this.isStatic = isStatic;
        this.type = type;
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String asJavaCode() {
        return accessModifier + " " + type + " " + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accessModifier == null) ? 0 : accessModifier.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        Attribute other = (Attribute) obj;
        if (accessModifier != other.accessModifier)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Attribute [" + asJavaCode() + "]";
    }
}
