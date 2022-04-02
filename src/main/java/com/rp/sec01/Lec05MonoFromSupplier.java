package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

public class Lec05MonoFromSupplier {

    public static void main(String[] args) {

        // use just method only when you have data already
        // Mono<String> mono = Mono.just(getName());

        Supplier<String> stringSupplier = () -> getName();
        // if you're going to calculate based on demand, use supplier
        Mono<String> mono = Mono.fromSupplier(stringSupplier);
        mono.subscribe(Util.onNext());
    }

    private static String getName(){
        System.out.println("Generating Name");
        return Util.faker().name().fullName();
    }
}
