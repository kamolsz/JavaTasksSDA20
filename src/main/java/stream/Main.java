package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> personList = getPersonsFromList(wczytajPlik());
//        getPersonsFromList(wczytajPlik()).forEach(System.out::println);


/*
        List<String> list = personList
                .stream()
                .filter(a -> a.getAge() < 18)
                .map(p -> p.getName() + p.getLastName())
                .collect(Collectors.toList());

        System.out.println(list);*/

/*        boolean test = personList
                .stream()
                .anyMatch(s -> s.getLastName().equalsIgnoreCase("alam"));
//znajdowanie czy jest takie nazwisko
        System.out.println(test);*/
//sortowania

/*        personList.sort(Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getName));
        personList.forEach(System.out::println);*/

  /*      Collections.sort(personList);

        personList.forEach(System.out::println);
*/
/*  //sortowanie listy list
  List<List<Integer>> myList = List.of(
          List.of(1,23,4,5,6,74),
          List.of(12,223,43,54,65,74),
          List.of(1,231,43,51,67,74),
          List.of(1,232,54,55,6,734),
          List.of(1,263,41,56,65,74)
  );

  myList.stream()
          .sorted((o1,o2) -> o1.stream().mapToInt(i->i).sum() - o2.stream().mapToInt(i->i).sum())
          .forEach(System.out::println);
//mapToInt jest to zrobienie streamu na "małe" inty*/

//zadanie 12

        Map<String, Set<Person>> mapOfPersons = personList.stream().
                collect(Collectors.groupingBy(p -> p.getName(), Collectors.toSet()));

        for (Map.Entry<String, Set<Person>> e : mapOfPersons.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    //obróbka listy z wykorzystaniem lambdy i strumienia. Tworzymy nowa klase Person w postaci listy
    private static List<Person> getPersonsFromList(List<String> naszaLista) {

/*       return naszaLista.stream().map(a-> {
          String [] s = a.split(",");
           return new Person(Integer.parseInt(s[0]),s[1],s[2],Integer.parseInt(s[3]));
        }).collect(Collectors.toList());*/

        return naszaLista.stream()
                .skip(1)     //pomija 1 linie w pliku tam dzie jest header
                .map(a -> a.split(","))
                .map(s -> new Person(Integer.parseInt(s[0]), s[1], s[2], Integer.parseInt(s[3])))
                .collect(Collectors.toList());

    }


    //wczytanie pliku i zwrócenie jako listy
    private static List<String> wczytajPlik() throws IOException {

        return Files.lines(Paths.get("persons.csv")).collect(Collectors.toList());

    }

}
