package collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.*;

/*

pull iteration

push iteration
 */
public class Main {


    public void typeOfstream() {


        Stream.empty();

        List<Object> objects = new ArrayList<>();
        objects.stream();

        Map<Object, Object> map = new HashMap<>();
        map.entrySet().stream();

        int arr[] = new int[0];
        Arrays.stream(arr);

        Stream.of('a','b','c');

    }

    public static void main(String[] args) {


//        Stream.of(1,2,3).forEach(System.out::print);


//        Stream.generate(()->6).limit(10).forEach(System.out::println);
//        Stream.iterate(2, (x) -> x + 2).forEach(System.out::println);

//        Stream.Builder<Integer> sb = Stream.<Integer>builder()
//                .add(0)
//                .add(1);
//
//        for (int i = 2; i < 8; i++) {
//            sb.accept(i);
//        }
//
//        sb.build().forEach(System.out::println);
//
//        sb.add(9).add(10).build().forEach(System.out::println);

//
//        Stream.concat(
//                Stream.of(1,2,3),
//                Stream.of(3,5,6)
//        ).forEach(System.out::println);

//        IntStream.range(0,10).forEach(System.out::println);
//        LongStream.range(0L, 10L).forEach(System.out::println);

//
//        Stream.of(0,1,2,3,4,5,6,7).filter((x)->x % 2 == 0).forEach(System.out::print);

//        System.out.println(Integer.parseInt("10",16));

//        Stream.of("10","11","").map(x -> Integer.parseInt(x, 16)).forEach(System.out::print);

//        IntStream.range(0, 10)
//                .skip(5)
//                .limit(3)
//                .skip(1)
//                .forEach(System.out::println);

        List<Map> listOfMap1 = new ArrayList<>();
        List<Map> listOfMap2 = new ArrayList<>();




        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");
        map2.put("key2", "correctValue");
        map2.put("key3", "value3");

        Map<String, String> map3 = new HashMap<>();
        map3.put("key1", "value2");
        map3.put("key2", "value2");
        map3.put("key3", "value3");

        listOfMap1.add(map1);
        listOfMap1.add(map2);
        listOfMap1.add(map3);

        listOfMap2.add(map1);
        listOfMap2.add(map2);
        listOfMap2.add(map3);



        List<Map<String, ? extends Object>> result = new ArrayList<>();


//        result = listOfMap1.stream().collect(Collectors.toList(
//                Collectors.toMap(x-> x.)
//
//        ));



//        listOfMap2.stream().peek(x -> x.f).flatMap(x -> x.entrySet().stream())
//                .filter((k)->k.getKey().equals("key2"))
//                .filter((v)->v.getValue().equals("correctValue"))
//                .forEach(System.out::println);


//        System.out.println(tempMap);


//        listOfMap1.stream().flatMap(x -> x.entrySet().stream())
//                .flatMap((k) -> {
//                    if (k.getKey().equals("key2") && k.getValue().equals("correctValue")) {
//                         return
//                    }
//
//                }).collect(Collectors.toMap(k,v));



//        Map<String , List<String>> maplist = new HashMap<>();
//
//        List<String> testlist = new ArrayList<>();
//        testlist.add("test1");
//        testlist.add("test2");
//        testlist.add("test3");
//        maplist.put("key1", testlist);
//
//
//        String word = "key1";
//        maplist.computeIfAbsent(word, k-> new ArrayList<>()).add("omgomg");
//
//        System.out.println(maplist);

//        listOfMap1.stream().flatMap(x -> x.entrySet().stream()).forEach(System.out::println);

//        listOfMap1.forEach(x -> x.forEach((k,v) -> System.out.println(k + " " + v)));

//
//        listOfMap1.forEach(x -> x.forEach((xk,xv) -> {
//            listOfMap2.forEach(y -> y.forEach((yk,yv) -> {
//                System.out.println(xk +" "+ xv);
//            }));
//        }));

        listOfMap1.forEach(x -> {
            listOfMap2.forEach(y -> {
                if (x.get("key2").equals(y.get("key2"))) {
                    x.put("omg", new HashMap<>(y));
                }
            });
        });

        listOfMap1.forEach(x -> System.out.println(x));


    }
}
