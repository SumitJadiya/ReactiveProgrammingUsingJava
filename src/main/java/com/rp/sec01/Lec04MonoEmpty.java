package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmpty {

    public static void main(String[] args) {

        userRepo(1).subscribe(Util.onNext(), Util.onError(), Util.onComplete()); // onNext and onComplete
        userRepo(2).subscribe(Util.onNext(), Util.onError(), Util.onComplete()); // onComplete only
        userRepo(3).subscribe(Util.onNext(), Util.onError(), Util.onComplete()); // onError only
    }

    private static Mono<String> userRepo(int userId) {

        if(userId == 1)
            return Mono.just(Util.faker().name().firstName());
        else if(userId == 2)
            return Mono.empty();
        else
            return Mono.error(new RuntimeException("Not Allowed"));
    }
}
