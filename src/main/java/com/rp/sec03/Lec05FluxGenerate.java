package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxGenerate {

    public static void main(String[] args) {
        Flux.generate(synchronousSink -> {
                    String country = Util.faker().country().name();
                    System.out.println("Emitting : " + country);
                    synchronousSink.next(country);
                    if (country.toLowerCase().equals("india"))
                        synchronousSink.complete();

                })
                .take(10)
                .subscribe(Util.subscriber());
    }
}
