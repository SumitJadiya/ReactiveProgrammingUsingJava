package com.rp.sec02;

import com.rp.courseutil.Util;
import com.rp.sec02.helper.NameGenerator;

import java.util.List;

public class Lec07FluxVsList {

    public static void main(String[] args) {

        NameGenerator
                .getNames_usingFlux(5)
                .subscribe(Util.onNext());

        List<String> names = NameGenerator.getNames(5);
        System.out.println(names);


    }
}
