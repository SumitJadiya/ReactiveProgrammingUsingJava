package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class Lec06SupplierRefactoring {

    public static void main(String[] args) {
        getName();
        getName().subscribeOn(Schedulers.boundedElastic()).subscribe(Util.onNext());
        getName();

        Util.sleepSeconds(4);
    }

    private static Mono<String> getName(){
        System.out.println("entered getName method");

        // build pipeline
        return Mono.fromSupplier(() -> {
            System.out.println("Generating Name");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
