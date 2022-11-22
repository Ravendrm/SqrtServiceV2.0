package ru.netology.sqr.homework.packages.and.cycles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrtServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

    public void shouldCalculateNumberOfRoots(int expected, int min, int max) {
        SqrtService service = new SqrtService();
        int actual = service.sqrCalc(min, max);

        Assertions.assertEquals(expected, actual);

    }
}

