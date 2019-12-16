package uml2;

public enum Category {
    SPORT("Sport division"),
    FICTION("Fiction division"),
    HISTORY("History division");

    private String name;

    private Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
