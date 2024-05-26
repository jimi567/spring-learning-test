package cholog;

//@JsonPropertyOrder(value = {"category", "name", "age"})
public class Crew {

    private String name;
    private int age;
    private Category category;

    public Crew(String name, int age, Category category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Category getCategory() {
        return category;
    }

    public int getAgeTenYearAgo() {
        return age - 10;
    }
}
