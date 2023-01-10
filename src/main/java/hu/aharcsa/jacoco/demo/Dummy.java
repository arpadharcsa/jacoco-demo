package hu.aharcsa.jacoco.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

record Dummy(@JsonProperty String id, @JsonProperty String timestamp) {
}
