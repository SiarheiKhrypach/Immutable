package by.tut.ssmt;

 public final class ImmutableSample {

    private final int size;
    private final String name;
    private final Person employee;
    private final Person[] staff;
    private final int[] line;

    public ImmutableSample(int size, String name, Person employee, Person[] staff, int[] line) {
        this.size = size;
        this.name = name;
        this.employee = employee;
        this.staff = staff;
        this.line = line;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Person getEmployee() {
        return employee.clone();
    }

    public Person[] getStaff() {
        return arrayDeepClone(staff);
        }

    public int[] getLine() {
        return line.clone();
    }

    private Person[] arrayDeepClone (Person[] staff) {
        Person[] staffClone = new Person[staff.length];
        for (int i = 0; i < staff.length; i++) {
            staffClone[i] = staff[i].clone();
        }
        return staffClone;
    }

}