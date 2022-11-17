package com.seunggabi.study.kotlininaction.ch4

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.name.compareTo(o2.name)
        }
    }
}

//val persons = listOf(Person("Bob"), Person("Alice")).sortedWith(Person.NameComparator)
