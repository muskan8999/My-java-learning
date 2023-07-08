
class GeneTo <T>
{
    T obj;
     GeneTo(T obj)
    {


        this.obj=obj;
    }
    T getObj()
    {
        return obj;
    }

}
 class Genr {
    public static void main(String[] args) {
GeneTo<Integer> obj= new GeneTo<Integer>(23);
        System.out.println(obj.getObj());
        GeneTo<String> sobj= new GeneTo<>("Muskan");
        System.out.println(sobj.getObj());
    }
}
