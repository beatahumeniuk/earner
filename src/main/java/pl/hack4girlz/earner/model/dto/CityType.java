package pl.hack4girlz.earner.model.dto;

public enum CityType {
    BIG("aaa");

    private final String value;

    CityType(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
