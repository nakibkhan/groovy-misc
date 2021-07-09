package com.example.groovymisc.maps

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class MapFunctionsTest {

    MapFunctions mapFunctions
    def map

    @BeforeEach
    void setUp() {
        map = [:]
        mapFunctions = new MapFunctions (
            keyMap: map
        )
    }

    @Test
    void testProcess_empty() {
        Assertions.assertFalse(mapFunctions.process("fdsasdfasdfasdf"))
    }

    @Nested()
    @DisplayName("Test for cases where key exists")
    class KeyReallyExists   {
        @BeforeEach
        void addKeyValuePair()  {
            map["Hello"] = "World"
        }

        @Test
        void testProcess_false() {
            mapFunctions.operate()
            Assertions.assertFalse(mapFunctions.process("fdsasdfasdfasdf"))
        }

        @Test
        void testProcess_true() {
            Assertions.assertTrue(mapFunctions.process("Hello"))
        }
    }


}
