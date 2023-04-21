package creational.abstract_factory;

public class ElfArmy implements Army {
    static final String DESCRIPTION = "Elf Army";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
