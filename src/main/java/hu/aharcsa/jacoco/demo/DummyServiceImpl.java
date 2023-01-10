package hu.aharcsa.jacoco.demo;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
class DummyServiceImpl implements DummyService {
    @Override
    public List<Dummy> getDummies() {
        return Collections.emptyList();
    }

    @Override
    public Dummy getDummy(String id) {
        return new Dummy(id, Instant.now().toString());
    }
}
