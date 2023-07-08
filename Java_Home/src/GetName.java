 class GetName {
    int age;
  private  String Name;
     void setAge(int age)
     {
         this.age=age;
     }
     int getAge()
     {
         return age;
     }

     void setName(String Name){
         this.Name=Name;
     }

     String getName(){
         return Name;
     }

}
class Main{
    public static void main(String[] args) {
        System.out.println("hello world");
        GetName obj= new GetName();
        obj.setAge(23);
        System.out.println(obj.getAge());
        obj.setName("muskan");
        System.out.println(obj.getName());

    }
}
