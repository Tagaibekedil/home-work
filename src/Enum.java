public enum Enum {

    MALE("male"),
    FEMALE("female");
    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    Enum(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return gender;
    }
}

