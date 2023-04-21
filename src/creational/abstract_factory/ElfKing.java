package creational.abstract_factory;

public class ElfKing implements King {
    static final String DESCRIPTION = "Elf King";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
