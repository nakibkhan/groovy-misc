package com.example.groovymisc.maps

import java.util.function.BiConsumer


class MapFunctions {

    Map<String, String> keyMap

    boolean process(String key)   {
        keyMap[key]
    }

    void operate()  {
        BiConsumer<String, String> customConsumer = new BiConsumer<String, String>() {
            @Override
            void accept(String key, String value) {
                println("Key is $key" )
                println("Value is $value" )
            }
        }

        keyMap.forEach(customConsumer)
    }

}