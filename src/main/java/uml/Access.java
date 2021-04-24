package uml;

public enum Access {
    PRIVATE,
    PROTECTED,
    PACKAGE,
    PUBLIC;

    public String toString() {
        switch (this) {
            case PRIVATE:
                return "private";
            case PROTECTED:
                return "protected";
            case PACKAGE:
                return "package";
            case PUBLIC:
                return "public";
            default:
                throw new IllegalStateException("Unknown access modifier " + this);
        }
    }
}