package quickTask.task4;

import quickTask.task4.exceptions.NullParameterException;
import quickTask.task4.exceptions.OverflowException;
import quickTask.task4.exceptions.UnderflowException;

import java.util.Collection;

public interface Calculator {

    Double add(Double d1, Double d2) throws NullParameterException, OverflowException, UnderflowException;
    Double divide(Double d1, Double d2) throws NullParameterException, UnderflowException, OverflowException;
    Double average(Collection<Double> ds) throws NullParameterException, OverflowException, UnderflowException;
}
