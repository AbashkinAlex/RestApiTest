package com.ubr.demo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NashornDemo {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");

        if (scriptEngine == null) {
            throw new Exception("No Nashorn!");
        }

        InputStream scriptFile = NashornDemo.class.getResourceAsStream("/js/helloWorld.js");

        if (scriptFile == null) {
            throw new Exception("No Script File!");
        }

        HelloWorld helloWorld = (HelloWorld)scriptEngine.eval(new InputStreamReader(scriptFile));

        String hello = helloWorld.sayHello("Nashorn");

        System.out.println(hello);

    }
}
