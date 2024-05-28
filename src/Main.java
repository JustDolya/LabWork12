class Program {
    public static void main(String[] args) {
        Teacher userTeacher = new Teacher("Ташкинов В.В.", +100500);
        userTeacher.setLogin("tochnoNeTashkinovizITColledzha@gmail.com");
        userTeacher.setPassword("qwerty123");

        Student userStudent = new Student("Головач Лена", 15);
        userStudent.setLogin("verySuspectName@gmail.com");
        userStudent.setPassword("password");
    }
}

interface User{
    void setPassword(String password);
    void getPassword();
    void setLogin(String login);
    String getLogin();
}

abstract class People implements User{
    String FIO;
    int age;
    String post;
    String password;
    String login;

    public People(String FIO, int age, String post) {
        this.FIO = FIO;
        this.age = age;
        this.post = post;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void getPassword() {
        System.out.println("Сообщение с паролем было отправлено вам на почту, которую вы не указывали");
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }
}

class Teacher extends People{
    Teacher(String FIO, int age){
        super(FIO, age, "Преподаватель");
    }
}

class Student extends People{
    Student(String FIO, int age){
        super(FIO, age, "Студент");
    }
}