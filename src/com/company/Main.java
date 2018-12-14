package com.company;

import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
public class Main {
    public static void main(String[] args) {

        public static Boolean stringToBoolean (String exp)
            ScriptEngineManager SEM = new ScriptEngineManager();
            ScriptEngine engine = SEM.getEngineByName("JavaScript");

            Boolean one = (Boolean) engine.eval(exp.toLowerCase());

            return one;
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter expression using 'a + ! or b' ");
        String response = kbReader.nextLine();


        }


    }

