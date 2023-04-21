package creational.abstract_factory;

public class ElfCastle implements Castle {
    static final String DESCRIPTION = "Elf Castle";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
