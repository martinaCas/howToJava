public class Main {
    public static void main(String[] args) {
        // Create instances of Model, View, and Controller
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Simulate user input
        String userInput = "Mario";
        int userInputAge = 12;

        controller.processData(userInput, userInputAge);
    }
}
