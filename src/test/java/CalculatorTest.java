import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import quickTask.task4.Calculator;
import quickTask.task4.DoubleCalculator;
import quickTask.task4.exceptions.NullParameterException;
import quickTask.task4.exceptions.OverflowException;
import quickTask.task4.exceptions.UnderflowException;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    Calculator calculator = new DoubleCalculator();

    @Test
    void simulateNullException() {
        Assertions.assertThrows(NullParameterException.class, () -> calculator.add(null, 1.0));
        Assertions.assertThrows(NullParameterException.class, () -> {
            List<Double> ds = new ArrayList<>();
            ds.add(9.887312241742738E307);
            ds.add(null);
            ds.add(0.0);
            ds.add(-9.887312241742738E307);
            calculator.average(ds);
        });
    }

    @Test
    void simulateInfinityExceptions() {
        Assertions.assertThrows(OverflowException.class, () -> calculator.add(9.887312241742738E307, 9.887312241742738E307));
        Assertions.assertThrows(UnderflowException.class, () -> calculator.add(-9.887312241742738E307, -9.887312241742738E307));
        Assertions.assertThrows(OverflowException.class, () -> calculator.divide(5.0, 0.0));
        Assertions.assertThrows(UnderflowException.class, () -> calculator.divide(-5.0, 0.0));
        Assertions.assertThrows(OverflowException.class, () -> calculator.divide(9.887312241742738E307, 0.5));
        Assertions.assertThrows(UnderflowException.class, () -> calculator.divide(9.887312241742738E307, -0.5));
        Assertions.assertDoesNotThrow(() ->
            calculator.average(List.of(1.0, 0.0, 4.943656120871369E307, 9.887312241742738E307, 9.887312241742738E307))
        );
    }
}
