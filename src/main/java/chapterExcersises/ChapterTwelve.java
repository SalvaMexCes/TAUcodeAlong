package chapterExcersises;
import java.util.*;
import java.util.Set;

public class ChapterTwelve {
        public static void main(String[] args) {
                System.out.println("\n");

                //CHAPTER 12A

                //Collections Framework:
                //Set - Unordered unique elements
                Set<String> fruit = new HashSet();
                fruit.add("Kiwi");
                fruit.add("Apple");
                fruit.add("Pear");
                System.out.println(fruit.size());
                System.out.println(fruit);
                System.out.println("=========");

                //List - Ordered elements which can be accessed by position
                List cars = new ArrayList<>();
                cars.add("BMW");
                cars.add("Lexus");
                cars.add("Bugatti");
                System.out.println(cars);
                System.out.println(cars.size());
                System.out.println(cars.get(2));
                System.out.println("=========");

                //Queue - Ordered elements for processing. Access in the order elements were added.
                Queue artists = new LinkedList();//Queues follow FIFO first in first out algorithm
                artists.add("Drake");
                artists.add("Kendrick Lamar");
                artists.add("Rick Ross");
                artists.add("The Weeknd");
                artists.add("Travis Scott");
                artists.add("Future");

                artists.remove();              //This will simply remove first one in the queue
                System.out.println(artists);
                System.out.println(artists.peek());     //PEAK
                System.out.println("=========");

                //Map - Unordered unique key value pairs
                Map soccerPlayers = new HashMap();
                soccerPlayers.put("Messi", 10);
                soccerPlayers.put("Ronaldo", 7);
                soccerPlayers.put("Neymar", 11);
                soccerPlayers.put("Iniesta", 8);
                soccerPlayers.put("Iniesta", 6);
                soccerPlayers.put("Xavi", 6);
                soccerPlayers.put("Xavi", 8);
                System.out.println(soccerPlayers.entrySet());
                System.out.println(soccerPlayers.get("Xavi"));
                System.out.println(soccerPlayers.get("Messi"));
                soccerPlayers.remove("Ronaldo");
                System.out.println(soccerPlayers.entrySet());
                System.out.println("=========");

                //List.of()
                //Set.of()
                //Map.of()
                //Used to add/put elements we want in one line
                List unchangeableList = List.of("Apple", "Kiwi", "Banana", "Orange", "Watermelon");
                //Collection becomes immutable, meaning it cannot be changed.

                //CHAPTER 12B
                //Looping through Collections & Maps
                var i = fruit.iterator();
                while (i.hasNext()){
                        System.out.println(i.next());
                }

                System.out.println("\n");

                for (String item : fruit){
                        System.out.println(item);
                }

                System.out.println("\n");

                fruit.forEach(x -> System.out.println(x));


                System.out.println("=========");

                mapDemo();

                //INDEPENDENT EXERCISE
                System.out.println("=========");
                Map<String, Integer> originalTest = TestResults.getOriginalGrades();
                Map<String, Integer> makeUpTest = TestResults.getMakeUpGrades();

                for(var student : makeUpTest.entrySet()){
                        Integer gradeBefore = originalTest.get(student.getKey());
                        Integer gradeAfter = makeUpTest.get(student.getKey());

                        if(gradeAfter > gradeBefore){
                                originalTest.put(student.getKey(), gradeAfter);
                        }
                }
                System.out.println("Final grades:" );
                originalTest.forEach((k,v)->System.out.println("Student: " + k + ", Grade: " + v));
        }



        public static void mapDemo(){
                Map<String, Integer> foodCalories = new HashMap();
                foodCalories.put("Lasagna", 800);
                foodCalories.put("Pizza", 650);
                foodCalories.put("Quesadilla", 525);
                foodCalories.put("CheeseBurger", 510);
                foodCalories.put("Taco", 175);

                for (var entry : foodCalories.entrySet()){
                        System.out.println(entry.getValue());
                }

                foodCalories.forEach((k,v) -> System.out.println("Food: " + k + ", Calories: " + v));
        }

}
