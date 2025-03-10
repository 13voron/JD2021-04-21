package by.it.krukouski.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            int modifiers = method.getModifiers();
            StringBuilder methodString = new StringBuilder();
            if (!(Modifier.isStatic(modifiers))){
                methodString.append(method.getName());
            }else continue;
            System.out.println(methodString);
        }
    }
}
