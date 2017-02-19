package user;

/**
 * It includes private fields
 */
public class User {
    private String name;
    private String surname;
    private double age;
    private String sex;

    /**
     * @param name    person's name
     * @param surname person's LastName
     * @param age     person's age
     * @param sex     person's sex
     */
    public User(String name, String surname, double age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    /**
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return person's surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return person's age
     */
    public double getAge() {
        return age;
    }

    /**
     * @return person's sex
     */
    public String getSex() {
        return sex;
    }
}
