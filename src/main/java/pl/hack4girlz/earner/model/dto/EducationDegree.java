package pl.hack4girlz.earner.model.dto;

public enum EducationDegree {
    HIGHER("Studia wyższe");

    private final String value;

    EducationDegree(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
