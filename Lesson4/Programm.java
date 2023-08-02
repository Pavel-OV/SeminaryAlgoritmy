package Lesson4;

public class Programm {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap(4);
        String prevVulue = hashMap.put("+7512645451", "Андрей");
        prevVulue = hashMap.put("+7556645451", "Андрей");
        prevVulue = hashMap.put("+7556645451", "Сергей");
        System.out.println(prevVulue);
        // String searchValue = hashMap.get("+7556645451");
      
        //  prevVulue=hashMap.remove("+7556645451");
     

         //prevVulue=hashMap.remove("+7512645451");
        // searchValue = hashMap.get("+7556645451");
        for (HashMap.Entity item : hashMap) {
            System.out.println(item);
        }
        

       

        // Human human = new Human();
        // human.name = "User";
        // human.age = 45;

        // Human human2 = new Human();
        // human2.name = "User";
        // human2.age = 45;

        // System.out.println(human.equals(human2));

    }

    // class Human {
    //     String name;
    //     int age;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (odj instanceof Human) {
    //         Human human = (Human) obj;
    //         if(name.equals(human.name) && age==human.age);
    //         return true;
    //             }
    //             return false;

    // }

}
