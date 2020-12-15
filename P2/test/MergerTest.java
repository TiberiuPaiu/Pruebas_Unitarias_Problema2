import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergerTest {

    @BeforeEach
    void initVar() {
        Merger m = new Merger();
        List<Integer> res = new ArrayList<Integer>();
    }
    @Test
    void test1() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach
        List<Integer> res = new ArrayList<Integer>();

        List<Integer> lista1= Collections.emptyList();
        List<Integer> lista2= Collections.emptyList();
        res=m.mergeSorted(lista1,lista2);
        assertNotNull(res);
        assertTrue(res.size()>0);

    }

    @Test
    void test2() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach
        List<Integer> res = new ArrayList<Integer>();
        List<Integer> lista_True= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista_Fase1= Arrays.asList(1, 2, 4, 5); // no introdusca el ultimo elmento de lista1
        List<Integer> lista_Fase2= Arrays.asList(1, 2, 3, 4); // no introdusca el ultimo elmento de lista2
        List<Integer> lista_Fase3= Arrays.asList(1, 2, 4); // no introdusca el ultimo elmento de lista1 i lista 2

        List<Integer> lista1= Arrays.asList(1, 2, 3);
        List<Integer> lista2= Arrays.asList( 4, 5);

        assertEquals(res=m.mergeSorted(lista1,lista2),lista_True);
        assertNotEquals(res=m.mergeSorted(lista1,lista2),lista_Fase1);
        assertNotEquals(res=m.mergeSorted(lista1,lista2),lista_Fase2);
        assertNotEquals(res=m.mergeSorted(lista1,lista2),lista_Fase3);
    }
    @Test
    void test3() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach

        List<Integer> lista_True= Arrays.asList(1, 2, 13, 24, 65);
        List<Integer> lista_False= Arrays.asList(1, 2, 23, 4, 5);

        assertTrue(m.ListaOrdenadoCrecientemente(lista_True));
        assertFalse(m.ListaOrdenadoCrecientemente(lista_False));

    }

    @Test
    void test4() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach

        List<Integer> lista_True= Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista_False= Arrays.asList(1, 2, 2, 4, 5);

        assertTrue(m.ListaNoRepetidos(lista_True));
        assertFalse(m.ListaNoRepetidos(lista_False));
    }

    @Test
    void test5() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach
        List<Integer> res = new ArrayList<Integer>();


        List<Integer> lista1= Arrays.asList(11, 2, 3);
        List<Integer> lista2= Arrays.asList( 4, 55,7);

        try {
            res = m.mergeSorted(lista1,lista2);
            fail("No ha saltado la excepción");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }


    }

    @Test
    void test6() {
        Merger m = new Merger(); // no ser per que no funciona @BeforeEach
        List<Integer> res = new ArrayList<Integer>();


        List<Integer> lista1= Arrays.asList(1, 2, 2,8);
        List<Integer> lista2= Arrays.asList( 1, 5, 5,7);

        try {
            res = m.mergeSorted(lista1,lista2);
            fail("No ha saltado la excepción");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }


    }

}