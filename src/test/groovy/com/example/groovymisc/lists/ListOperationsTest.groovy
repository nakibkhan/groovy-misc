package com.example.groovymisc.lists

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ListOperationsTest {
    List<String> values

    @BeforeEach
    void setUp() {
        values =  ["Mark Smith", "Tom Thumb", "Anthony Gartman", "Mark Ashton", "Tom Jackson", "Jason Bateman", "Mary Poppins"]
    }

    @Nested
    @DisplayName("Test Transformations")
    class TransformTest {

        @Test
        @DisplayName("Size of Persons should be the same as the List of String")
        void transform()    {
            List<Person> result = ListOperations.transform(values)
            Assertions.assertEquals(7, result.size())
        }
    }

}
