package com.example.groovymisc.lists

class ListOperations {

    static List<Person> transform(List<String> input)    {
        input.collect {
            String [] names = it.split()
            new Person(
                firstName: names[0],
                lastName: names[1]
            )
        }
    }

    static List unique(List input)    {
        input.unique()
    }

    static String filter(List input, String name)    {
        input.find { listName ->
            listName == name
        }
    }
}

class Person {
    String firstName
    String lastName
}