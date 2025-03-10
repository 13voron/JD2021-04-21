package by.it.naryshkin.jd01_11.calc;

import java.util.HashMap;
import java.util.Map;

abstract class Var implements Operation {
    private static Map<String, Var> vars = new HashMap<>();

    static Var setVar(String name, Var var) {
        vars.put(name, var);
        return var;
    }

    public static Map<String, Var> getVar() {
        return vars;
    }


    static Var createVar(String operand) {
        operand = operand.trim();
        operand = operand.replaceAll("\\s+", "");
        if (operand.matches(Patterns.SCALAR)) {
            return new Scalar(operand);
        }
        if (operand.matches(Patterns.VECTOR)) {
            return new Vector(operand);
        }
        if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        }
        if (vars.containsKey(operand)) {
            return vars.get(operand);
        }
        return null;
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения " + this + "+" + other + " невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания " + this + "-" + other + " невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения " + this + "*" + other + " невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления " + this + "/" + other + " невозможна");
        return null;
    }
}
