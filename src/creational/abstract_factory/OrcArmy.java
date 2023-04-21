package creational.abstract_factory;

public class OrcArmy implements Army {
    static final String DESCRIPTION = "Orc Army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
