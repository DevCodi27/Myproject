public class NameAge {
    public static void main(String[] args){
        NA obj = new NA();
        boolean name = obj.validate("Stan");
        boolean age = obj.validate(10);
        System.out.println(name);
        System.out.println(age);
    }

}
class NA{
    public boolean validate(String name){
         return name.matches("[a-zA-Z\\s]*");
    }
    public boolean validate(int age){
        return age>=3&&age<=15;
    }
        }
