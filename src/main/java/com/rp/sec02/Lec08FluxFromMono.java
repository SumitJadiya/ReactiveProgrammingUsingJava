package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec08FluxFromMono {

    public static void main(String[] args) {

        // Mono to flux
        Mono<String> mono = Mono.just("a");
        Flux<String> flux = Flux.from(mono); // flux

        doSomething(flux);

        // flux to mono
        Flux
                .range(1, 10)
                .filter(i-> i>3)
                .next()
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }

    private static void doSomething(Flux<String> flux) {
        System.out.println("Converted mono to flux");
    }
}
