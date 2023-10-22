public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void processData(String newName, int newAge) {
        model.setName(newName);
        model.setAge(newAge);
        String name = model.getName();
        int age = model.getAge();
        view.printStudentData(name, age);
    }
}
