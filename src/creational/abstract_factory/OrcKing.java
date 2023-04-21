package creational.abstract_factory;

public class OrcKing implements King {
    static final String DESCRIPTION = "Orc King";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
