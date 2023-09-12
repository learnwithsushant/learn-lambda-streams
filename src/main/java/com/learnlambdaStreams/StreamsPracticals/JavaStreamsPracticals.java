package com.learnlambdaStreams.StreamsPracticals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsPracticals {

    public static void main(String[] args) throws IOException {
        //intStreamDemo();
        //intStreamWithSkipDemo();
       // printSumInStream();
        //sortString();
       // arraySortFilterPrint();
        //arrayOfSquared();
        //printStringToLowerCase();
        //bandNamesFilter();
        //bandNamesWithString();
        //filtetrCSVFile();
        //filterFileBasedOnValue();
        //saveFileDataToMap();
        //sunReduction();
        summaryStat();
    }




    public static void intStreamDemo(){

        IntStream.range(1,10).forEach(System.out::println);
        System.out.println();

    }

    public static void intStreamWithSkipDemo(){

        IntStream.
                range(1,10).
                skip(4).
                forEach(x-> System.out.println(x));
        System.out.println();

    }

    public static void printSumInStream(){
        System.out.println("Stream Demo");
        System.out.println(IntStream.range(1,5).sum());
    }

    public static void sortString(){

        Stream.of("Shivshakti","Pragyan","Vikram")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void arraySortFilterPrint(){
        String name[] = {"Sachin","Dravid","Ganguly","Sehwag","Agarkar","Kumble","jadeja","Srinath","Prasad"};

        Arrays.stream(name).filter(n->n.startsWith("S")).sorted().forEach(System.out::println);


    }

    public static void arrayOfSquared(){

        Arrays.stream(new int[]{2,4,6,8})
                .map(a->a*a)
                .average()
                .ifPresent(System.out::println);
    }

    public static void printStringToLowerCase(){
List<String> people = Arrays.asList("Sachin","Dravid","Ganguly","Sehwag","Agarkar","Kumble","jadeja","Srinath","Prasad");
        people.stream()
                .map(String::toLowerCase)
                .filter(p->p.startsWith("a"))
                .forEach(System.out::println);

    }

    public static void bandNamesFilter() throws IOException {
        System.out.println("Band Names");
        Stream<String> bands = Files.lines(Paths.get("src/main/resources/bands.txt"));
        bands.sorted()
                .filter(x -> x.length() > 5)
                .map(String::toLowerCase)
                .forEach(System.out::println);
        bands.close();

    }

    private static void bandNamesWithString() throws IOException {

        List<String> bandName = Files.lines(Paths.get("src/main/resources/bands.txt"))
                .filter(x->x.contains("jit"))
                .collect(Collectors.toList());
        System.out.println("List Length: "+bandName.size());
        bandName.forEach(x-> System.out.println(x));
    }

    private static void filtetrCSVFile() throws IOException {
        Stream<String> fileStream = Files.lines(Paths.get("src/main/resources/csvFile.txt"));
        int formattedRows = (int) fileStream.map(x->x.split(","))
                .filter(c->c.length==3)
                .count();
        System.out.println("Row count: "+formattedRows);


        fileStream.close();
    }

    private static void filterFileBasedOnValue() throws IOException {
        Stream<String> fileStream = Files.lines(Paths.get("src/main/resources/csvFile.txt"));
        fileStream.map(x->x.split(","))
                .filter(x->x.length==3)
                .filter(x->Integer.parseInt(x[1])>15)
                .forEach(x-> System.out.println(x[0]+ " "+x[1]+" "+x[2]));
        fileStream.close();

    }

    private static void saveFileDataToMap() throws IOException {
        Stream<String> fileStream = Files.lines(Paths.get("src/main/resources/csvFile.txt"));
        Map<String,Integer> fileMap = new HashMap<>();
        fileMap = fileStream.map(x->x.split(","))
                .filter(x->x.length==3)
                .filter(x->Integer.parseInt(x[1])>15)
                .collect(Collectors.toMap(x->x[0],x->Integer.parseInt(x[1])));

        fileStream.close();
        for (String key : fileMap.keySet()){

            System.out.println("Key: "+key+" Value: "+fileMap.get(key));
        }

    }

    private static void sunReduction(){

        double total = Stream.of(9.3,2.7,9.1)
                .reduce(0.0,(Double a, Double b)-> a + b);

        System.out.println("Double Total: "+ total);
    }

    private static void summaryStat(){

        IntSummaryStatistics stat = IntStream.of(1,66,89,45,67,33,77,91).summaryStatistics();
        System.out.println(stat);

        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(44.36,1.2,1269.66,445.36).summaryStatistics();
        System.out.println(doubleSummaryStatistics);

    }
}
