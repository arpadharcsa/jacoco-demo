package hu.aharcsa.jacoco.demo;

import java.util.List;

public interface DummyService {
    List<Dummy> getDummies();

    Dummy getDummy(String id);

}
