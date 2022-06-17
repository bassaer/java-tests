package app;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CodeGeneratorTest {
    @ParameterizedTest
    @CsvSource({
        "1, A",
        "12, B",
        "123, C",
        "1234, D"
    })
    void test1(String input, String expected) {
        assertThat(CodeGenerator.generate(input)).isEqualTo(expected);
    }
}
