package Example;

class Teacher{
    void teach(){
        System.out.println("teaching");
    }

}
class students extends Teacher{
    void listen(){
        System.out.println("listening");
    }

}

public class single_inheritance {
    public static void main(String[] args) {
        students s1 = new students();
        s1.teach();
        s1.listen();
    }
}
