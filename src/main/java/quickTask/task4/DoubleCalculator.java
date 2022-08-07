package quickTask.task4;

import quickTask.task4.exceptions.NullParameterException;
import quickTask.task4.exceptions.OverflowException;
import quickTask.task4.exceptions.UnderflowException;

import java.util.Collection;

public class DoubleCalculator implements Calculator{
    @Override
    public Double add(Double d1, Double d2) throws NullParameterException, OverflowException, UnderflowException {
        nullCheck(d1, d2);
        return infinityCheck(d1 + d2);
    }

    @Override
    public Double divide(Double d1, Double d2) throws NullParameterException, UnderflowException, OverflowException {
        nullCheck(d1, d2);
        return infinityCheck(d1 / d2);
    }

    @Override
    public Double average(Collection<Double> ds) throws NullParameterException, OverflowException, UnderflowException {
        Double res = 0.0;
        for (Double d : ds) {
            res = add(res, divide(d, (double) ds.size()));
        }
        return res;
    }

    private void nullCheck(Double d1, Double d2) throws NullParameterException {
        if (d1 == null || d2 == null) throw new NullParameterException();
    }
    private Double infinityCheck(Double d1) throws OverflowException, UnderflowException {
        if (d1 == Double.POSITIVE_INFINITY) throw new OverflowException();
        if (d1 == Double.NEGATIVE_INFINITY) throw new UnderflowException();
        return d1;
    }
}
