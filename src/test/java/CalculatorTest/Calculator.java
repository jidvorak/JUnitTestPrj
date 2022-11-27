package CalculatorTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Calculator {

    @Test
    public void myFirstTest(){
        int result = 1 + 3;

        assertThat(result)
                .overridingErrorMessage("result is not 3")
                .isEqualTo(3);
    }

}
