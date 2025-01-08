public class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        Subject subject = new Subject(null);
        System.out.println(subject.getName());
        subject.setName(null);
        System.out.println(subject.getName());
    }
}
// exception
