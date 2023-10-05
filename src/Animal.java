public abstract class Animal {
    private String name;
    private String skills;
    private static int counter;
    private final int id = ++counter;

    public Animal(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String updatedSkills) {
        this.skills = updatedSkills;
    }

    public abstract void displayCommands();

    public abstract void teachNewCommand(String command);

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
