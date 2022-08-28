package case_study.sercive;

import java.io.IOException;

public interface IEmployeeService {
    void displayListEmployees() throws IOException;
    void addNewEmployee() throws IOException;
    void editEmployee();
}
