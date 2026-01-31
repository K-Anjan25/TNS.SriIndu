package com.tnsif.java.day15;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
public static void main(String[] args) {
List<String> list = Arrays.asList("Apple","Banana","Cherry","Date");

// Stream operation to filter and print items with length greater than 5
list.stream()
.filter(item -> item.length() > 5)
.forEach(System.out::println);
}
}
