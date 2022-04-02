package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

    public static void main(String[] args) {

        // publisher
        Mono<Integer> ball = Mono.just("ball")
                .map(String::length);
//                .map(l -> l / 0); // for error

        // mono subscribe
        ball.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }
}
