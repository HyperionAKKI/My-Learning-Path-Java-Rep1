public class Dog extends Animal {
//         method ovveriding mein hum naya method class mein define kar dete ab extended ki jagah priority class wale method ko milti hai
    @Override
   public void speak(){
        System.out.println("the dog Barked");

    }
   public Dog(String name , int life) {
        this.name=name;
        this.life=life;
   }
//   method1
    public String getname(){
        return this.name;
    }
}
