package com.rp.sec01;

import reactor.core.publisher.Mono;

public class Lec02MonoJust {

    public static void main(String[] args) {

        // publisher
        Mono<Integer> mono = Mono.just(1);

        // in reactive programming, nothing happens if you don't subscribe
        mono.subscribe(i-> System.out.println("Received " + i));
    }
}
