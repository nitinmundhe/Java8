package com.java8.day3.nashornjavascriptengine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class InvokeJavaScript {

    public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        //engine.eval(new FileReader("C:\\akash_workspace\\Java8\\src\\com\\java8\\day3\\nashornjavascriptengine\\sample.js"));
        engine.eval(new FileReader("src//com//java8//day3//nashornjavascriptengine//sample.js"));
        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("fun1", "Nitin Mundhe");
        System.out.println(result);

        Object result2 = invocable.invokeFunction("fun2", new Date());
        System.out.println(result2);
    }

}

