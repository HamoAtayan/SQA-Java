package Week_4;

/**
 * Created by Vane Gharakhanian on Nov, 2019
 */
public class Author {
    private String name;
    private int age;
    private String nationality;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        age = (int)Math.random()*100;
    }

    public int getAge() {
        return age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
