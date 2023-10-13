package ru.converter;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConverterTest {
    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2Eur() {
        float in = 200f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenConvert234RblThen2Dot3Eur() {
        float in = 234f;
        float expected = 2.3f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.1f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}