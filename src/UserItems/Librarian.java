package UserItems;

public class Librarian extends User {
    private String employeeId;

    public Librarian(String name, String email, String employeeId) {
        super(name, email);
        this.employeeId=employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
