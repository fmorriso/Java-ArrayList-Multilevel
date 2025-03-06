public class State {


    private String name;
    private String abbreviation;

    private State() {/* prevent uninitialized instances */}

    public State(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("State{")
                .append("name='").append(name)
                .append(", abbreviation='").append(abbreviation)
                .append('}').toString();
    }
}
