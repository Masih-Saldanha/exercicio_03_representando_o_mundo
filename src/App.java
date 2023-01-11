public class App {
    public static void main(String[] args) throws Exception {
        Student newStudent = new Student();
        newStudent.setName("Fulano");
        newStudent.setEmail("fulano@email.com");
        newStudent.setMessage("Estou tendo dificuldade nessa questão.");

        newStudent.question.setSubject("Geografia");
        newStudent.question.setNumber(1);

        System.out.println("Aluno: " + newStudent.getName());
        System.out.println("E-mail: " + newStudent.getEmail());
        System.out.println("Mensagem: " + newStudent.getMessage());
        System.out.println("Matéria: " + newStudent.getQuestion().getSubject());
        System.out.println("Questão Nº: " + newStudent.getQuestion().getNumber());
    }
}
