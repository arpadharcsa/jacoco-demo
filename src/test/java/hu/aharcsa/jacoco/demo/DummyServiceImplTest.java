package hu.aharcsa.jacoco.demo;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyServiceImplTest {
    private static final DummyService DUMMY_SERVICE = new DummyServiceImpl();

    @Test
    void getDummyTest() {
        //given
        final String id = "testId";

        //when
        final Dummy result = DUMMY_SERVICE.getDummy(id);

        //then
        assertEquals(id, result.id(), "Invalid id");
    }

    @Test
    void getDummies() {
        //given

        //when
        final List<Dummy> result = DUMMY_SERVICE.getDummies();

        //then
        assertTrue(result.isEmpty());
    }

}