package pl.hack4girlz.earner.model.dto;

public enum Voivodeship {
    DOLNOSLASKIE("dolnośląskie");
    private final String value;

    Voivodeship(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
