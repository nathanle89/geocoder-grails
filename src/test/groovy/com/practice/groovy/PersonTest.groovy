package com.practice.groovy

import static org.junit.Assert.*
import org.junit.Test
import static groovy.test.GroovyAssert.shouldFail

class PersonTest {

    @Test
    void shouldTestHello() {
        assertTrue(true)
    }

    @Test
    void shouldTestPersonCount() {
        def tinumap = new People('Tinumap')
        def minumap = new People('Minumap')

        assertEquals("Hello Tinumap", tinumap.hello())
        assertEquals("Hello Minumap", minumap.hello())
        assertEquals(2, People.peopleCounter)
    }

    void shouldReturnCorrectCount() {
        def tinumap = new People('Tinumap')
        def minumap = new People('Minumap')

        shouldFail {

        }
        assertEquals("Hello Tinumap", tinumap.hello())
        assertEquals("Hello Minumap", minumap.hello())
        assertEquals(2, People.peopleCounter)
    }
}
