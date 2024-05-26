package cholog;

public record CrewRecord(String name, int age, Category category) {
    public int isAgeTenYearAgo() {
        return age - 10;
    }
}
