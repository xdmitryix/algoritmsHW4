package ru.geekbrains.lesson4;

public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);


        String prevValue = hashMap.put("+79001112233", "Андрей");
        prevValue = hashMap.put("+79001112231", "Федор");
        prevValue = hashMap.put("+79001112931", "Петр");
        prevValue = hashMap.put("+79001312231", "Дмитрий");
        prevValue = hashMap.put("+79201112231", "Алексей");
        prevValue = hashMap.put("+79051112231", "Павел");
        prevValue = hashMap.put("+79023112231", "Сергей");
        prevValue = hashMap.put("+79001115631", "Станислав");
        prevValue = hashMap.put("+79001112229", "Николай");

        String searchValue = hashMap.get("+79001112233");

        searchValue = hashMap.get("+79001112233");


        Human human1 = new Human();
        human1.name = "User";
        human1.age = 34;

        Human human2 = new Human();
        human2.name = "User";
        human2.age = 34;

        System.out.println(human1.equals(human2));
        hashMap.foreach(null);

    }

}

class Human{
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Human){
            Human human = (Human) obj;
            if (name.equals(human.name) && age == human.age)
                return true;
        }
        return false;
    }
}
