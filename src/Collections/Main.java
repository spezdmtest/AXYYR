package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /***List ***/
        Collection<String> collection = new ArrayList<>();
        List<String> arrayList = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Integer> arrayInt = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<String> stack = new Stack<>();
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        Set<String> set = new HashSet<>();
        Queue<String> linkedQueue = new LinkedList<>(); //очередь
        Deque<String> linkedDeque = new LinkedList<>(); // если нужен стек то его лучше использовать
        Deque<String> arrayDeque = new ArrayDeque<>(); //  работает на основе массивов, быстрей чем linkedList,
                                                       //  работает быстрей чем класс Stack
        Queue<String> priorityQueue = new PriorityQueue<>();
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashMap1 = new HashMap<>(); // есть первый элемент и последний элемент
        Map<String,String> linkedHashMap = new LinkedHashMap<>(); // упорядоченная HashMap есть первый
                                                                  // и последний элемент (tail и head)
        Map<String, String> treeMap = new TreeMap<>(); //отсортированная коллекция.
        Map<String, String> hashtable = new Hashtable<>(); // тоже что и hashMap но у нее все методы
                                                          // синхранизированные
        Map<String, String> syncHashMap = Collections.synchronizedMap(new HashMap<>());

        collection.add("one");
        collection.add("two");
        System.out.println(collection.size());
        //  System.out.println(collection.remove("one"));
        System.out.println(collection.contains("two"));
        System.out.println();

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        for (String s : collection) {
            System.out.println(s);
        }
        System.out.println();

        linkedList.add("one");
        linkedList.add("two");
        System.out.println(linkedList.get(1));
        System.out.println();

        set.add("one");
        set.add("one");
        set.add("two");
        System.out.println(set.size());
        System.out.println();

        linkedQueue.add("one");
        linkedQueue.add("two");
        System.out.println(linkedQueue.add("three"));
        System.out.println(linkedQueue.poll());
        System.out.println(linkedQueue.poll());
        System.out.println(linkedQueue.poll());
        System.out.println();
        hashMap.put(null, "one");
        hashMap.put(null, "two");
        hashMap.put(null, "three");
        hashMap.remove("2");
        System.out.println(hashMap.get(null)); //выведет 3
        System.out.println();

        hashMap.put("1", "one");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        //  map.remove("2");
        System.out.println(hashMap.get("1"));
        System.out.println();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("B");

        /*** modify when iterate***/
             /*
                for (String s : arrayList
                ) {
                    System.out.println(s);
                    arrayList.add("D"); // работать не будет
                }
            */

        /***sort ***/
        for (String s : arrayList) {
            System.out.print(s);
        }
        System.out.println();
        Collections.sort(arrayList);
        for (String s : arrayList) {
            System.out.print(s);
        }
        System.out.println();

        students.add(new Student(3));
        students.add(new Student(1));
        students.add(new Student(2));

        for (Student s : students) {
            System.out.print(s.id + " ");
        }
        System.out.println();

        Collections.sort(students);

        for (Student s : students) {
            System.out.print(s.id + " ");
        }
        System.out.println();

        /*** binary search***/
        System.out.println(arrayList.get(Collections.binarySearch(arrayList, "C")));

        /*** to array and back ***/
        String[] strings = new String[arrayList.size()];
        strings = arrayList.toArray(strings);
        System.out.println(Arrays.toString(strings));

        List<String> stringList = Arrays.asList(strings);
        for (String s : stringList) {
            System.out.print(s + " ");
        }
        System.out.println();
        /*** list equals ***/
        System.out.println(arrayList.equals(stringList));

        /*** vector vs sync ***/

        long star = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            arrayInt.add(i);
        }
        System.out.println(System.currentTimeMillis() - star); // ~674


        long star1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            synchronizedList.add(i); // медленее vector
            //vector.add(i);
        }
        System.out.println(System.currentTimeMillis() - star1); // ~679

        for (int i = 0; i < 10_000_000; i++) {
            synchronizedList.add(i);
        }
        long star2 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            new Integer(synchronizedList.get(i));
        }
        System.out.println(System.currentTimeMillis() - star2);
        // vector 58, arrayList 64,synchronizedList 94
        /***add long of elements ***/
        for (int i = 0; i < 2_000_000; i++)
            arrayInt.add(i);


        /*** Set ***/
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
//          hashSet.add(null); - можно добавлять null
//          System.out.println(hashSet.size());
//          System.out.println(hashSet.contains(null));

//       не упорядоченое множество
//          hashSet.add("one");
//          hashSet.add("two");
//          hashSet.add("three");
//          hashSet.add("four");
//          hashSet.add("five");

//            for (String s : hashSet) {
//                System.out.println(s);
//            }

//       упорядоченное множество
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        System.out.println();
//       упорядоченное по алфавиту
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        for (String s : treeSet) {
            System.out.println(s);
        }

        Set<StudentHashSet> hashSet1 = new HashSet<>();
        Set<String> hashSet2 = new LinkedHashSet<>();
        Set<StudentTreeSet> treeSet1 = new TreeSet<>();

        hashSet1.add(new StudentHashSet(3));
        hashSet1.add(new StudentHashSet(1));
        hashSet1.add(new StudentHashSet(2));


        treeSet1.add(new StudentTreeSet("Dima"));
        treeSet1.add(new StudentTreeSet("Andrey"));
        treeSet1.add(new StudentTreeSet("Sasha"));

        hashSet2.add("a");
        hashSet2.add("a");
        hashSet2.add("b");
        hashSet2.add("c");

        for (StudentTreeSet studentSet : treeSet1) {
            System.out.println(studentSet.name);
        }

        for (StudentHashSet i : hashSet1) {
            System.out.println(i.id);
        }

        for (String s : hashSet2) {
            System.out.println(s);
        }
        System.out.println();

        /*** Queue ***/
        //ArrayDeque
        arrayDeque.add("a");
        arrayDeque.add("c");
        arrayDeque.add("b");
        for (String s : arrayDeque) {
            System.out.println(s);
         }
        System.out.println();

        // PriorityQueue - сортирует
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("b");
        for (String s : priorityQueue) {
            System.out.print(s + " "); // обычном порядке выдаст  a c b
        }
        System.out.println();
        while(priorityQueue.size() != 0) {
            System.out.print(priorityQueue.remove() + " "); // сортирует - a b c
        }
        System.out.println( );
        System.out.println( );
        //Test
        Deque<Integer> dequeQueue = new ArrayDeque<>(); // 1,2
        dequeQueue.add(1);
        dequeQueue.add(2);
        System.out.print(dequeQueue.pop() + " ");
        System.out.print(dequeQueue.pop() + "\n");

        ArrayDeque<Object> dequeStack = new ArrayDeque<>(); // 2,1
        dequeStack.push(1);
        dequeStack.push(2);
        System.out.print(dequeStack.pop() + " ");
        System.out.print(dequeStack.pop() + "\n");


        /*** HashMap ***/

        // navigable map
        TreeMap<String,String> map = new TreeMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("d","4");
        map.put("c","3");
        //backed map (subMap)
        System.out.println(map.subMap("a","b")); //a включительно b не включительно
        System.out.println(map.subMap("c","d")); //c включительно d не включительно
        System.out.println(map.subMap("a","d").firstKey()); // a предоставляет интерфейс SortedMap
        System.out.println(map.subMap("a","d").lastKey()); // c предоставляет интерфейс SortedMap
        System.out.println(map.tailMap("a"));
        System.out.println(map.headMap("c"));

        //memory treemap или HashMap - кто больше места занимает -> HashMap из-за LoadFactor
    }
}

