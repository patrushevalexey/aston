package module2.myHashSet;

public class Runner {
    public static void main(String[] args) {
        MyHashSet<String> set = new MyHashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println("Contains 'apple': " + set.contains("apple"));
        System.out.println("Contains 'grape': " + set.contains("grape"));

        set.add("apple");
        set.remove("banana");

        System.out.println("Contains 'banana': " + set.contains("banana"));
        System.out.println("Contains 'orange': " + set.contains("orange"));
    }
}
