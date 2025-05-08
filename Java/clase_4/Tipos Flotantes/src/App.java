import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) {
        final int integer = 1;
        final byte bytes = 1;
        final float f = 1.0f;
        final Double d = 1.0;
        final short s = 1;
        printMaxValues(s, d, f, bytes, integer);

    }

    @SafeVarargs
    private static <T> void printMaxValues(T... values) {
        final String VAL_MIN = "Valor mínimo ";
        final String VAL_MAX = "Valor máximo ";

        final String MIN_VALUE = "MIN_VALUE";
        final String MAX_VALUE = "MAX_VALUE";        
    
        for (T val : values) {
            var clazz = val.getClass();
    
            try {
                Field minField = clazz.getField(MIN_VALUE);
                Field maxField = clazz.getField(MAX_VALUE);
    
                Object minValue = minField.get(MIN_VALUE);
                Object maxValue = maxField.get(MAX_VALUE);
    
                System.out.println(clazz.getSimpleName());
                System.out.println(VAL_MIN + minValue);
                System.out.println(VAL_MAX + maxValue);
            } catch (Exception e) {
                System.out.println("Valor no compatible: " + clazz.getSimpleName());
            }
        }
    }
}
