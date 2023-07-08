package Example;


class T1{
    void teach(){
        System.out.println("teaching");
    }

}
class stud extends Teacher{
    void listen(){
        System.out.println("listening");
    }

}

class c extends stud{
    void writing(){
        System.out.println("writing");
    }
}


public class multi_level_I {
    public static void main(String[] args) {
        c S1 = new c();
        S1.writing();
        S1.listen();
        S1.teach();

    }
}
