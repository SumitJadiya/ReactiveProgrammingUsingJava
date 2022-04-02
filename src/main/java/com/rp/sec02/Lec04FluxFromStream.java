package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

public class Lec04FluxFromStream {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

//        Error
//        Stream<Integer> stream =  integers.stream();
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); // stream already completed

        Flux.fromStream(integers::stream).subscribe(Util.onNext());
        Flux.fromStream(integers::stream).subscribe(Util.onNext());
        Flux.fromStream(integers::stream).subscribe(Util.onNext());
    }
}
