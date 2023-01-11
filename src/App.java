public class App {
    public static void main(String[] args) throws Exception {
        Student newStudent = new Student();
        newStudent.setName("Fulano");
        newStudent.setEmail("fulano@email.com");
        newStudent.setMessage("Estou tendo dificuldade nessa questão.");

        Question newQuestion = new Question();
        newQuestion.setSubject("Geografia");
        newQuestion.setNumber(1);

        newStudent.setQuestion(newQuestion);

        System.out.println(newStudent.getName());
        System.out.println(newStudent.getEmail());
        System.out.println(newStudent.getMessage());
        System.out.println(newStudent.getQuestion().getSubject());
        System.out.println(newStudent.getQuestion().getNumber());
    }
}
