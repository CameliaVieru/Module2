package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Vehicle car = new Vehicle("B 123 ASD", 5, "Ford");
		String str = (String) invokeMethod(car, "displaySerialNumberAndPassword");
		System.out.println(str);
		
		Field privateField = Vehicle.class.getDeclaredField("serialNumber");
		privateField.setAccessible(true);
		String value = (String) privateField.get(car);
		System.out.println(value);
	}
	    
	
	public static Object invokeMethod(Object obj, String methodName,
            Object... paramSet) {
        int paramCount = paramSet.length;
        Method method;
        Object returnValue = null;
        Class<?>[] paramType = new Class<?>[paramCount];
        for (int i = 0; i < paramCount; i++) {
            paramType[i] = paramSet[i].getClass();
        }
        try {
            method = obj.getClass().getDeclaredMethod(methodName, paramType);
            method.setAccessible(true);
            returnValue = method.invoke(obj, paramSet);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
		
}
		

