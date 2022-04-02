package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec01FluxIntro {

    public static void main(String[] args) {
        Flux<Object> flux = Flux.just(1,2,3,4, Util.faker().name().firstName());
        flux.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
