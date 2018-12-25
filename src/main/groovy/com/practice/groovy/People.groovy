package com.practice.groovy

class People {

    static def peopleCounter = 0
    Name name

    def People(name) {
        peopleCounter++
        this.name = new Name(name)
    }

    def hello() {
        return "Hello ${this.name.fullName}".toString()
    }
}
