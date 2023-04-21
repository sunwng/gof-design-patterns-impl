package creational.abstract_factory;

public class OrcCastle implements Castle {
    static final String DESCRIPTION = "Orc Castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
