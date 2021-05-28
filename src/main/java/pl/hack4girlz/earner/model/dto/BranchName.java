package pl.hack4girlz.earner.model.dto;

public enum BranchName {
    GENERAL("Ogólny");
    private final String value;

    BranchName(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
