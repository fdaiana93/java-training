package ch2;

public class Actor {
    private String name;
    private Integer age;
    private Premiu[] awards;

    public Actor(String name, Integer age, Premiu[] awards) {
        this.name = name;
        this.age = age;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Premiu[] getAwards() {
        return awards;
    }

    public void setAwards(Premiu[] awards) {
        this.awards = awards;
    }
}
