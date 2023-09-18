package org.example;

import regular.Decorator;
import regular.UsefulClass;

/**
Основной класс, здесь содержится точка входа в программу.

 C:\Users\Robotruten\gblessons\Java core\seminar_1\seminar_1\out\artifacts\seminar_1_jar> java -jar seminar_1.jar
 C:\Users\Robotruten\gblessons\Java core\seminar_1\seminar_1\src\main> javac -sourcepath ./java -d out ./java/org/example/Main.java
 C:\Users\Robotruten\gblessons\Java core\seminar_1\seminar_1\src\main> java -classpath ./out org.example.Main

 FROM bellsoft/liberica-openjdk-alpine
 COPY ./java ./src
 RUN mkdir ./out
 RUN javac -sourcepath ./src -d out ./src/org/example/Main.java
 CMD java -classpath ./out org.example.Main


 C:\Users\Robotruten\gblessons\Java core\seminar_1\seminar_1\src\main> docker build . -t seminar_1.javacore

 C:\Users\Robotruten\gblessons\Java core\seminar_1\seminar_1\src\main> javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out
 */
public class Main {
    /**
    Точка входа в программу. Здесь последовательно запускаются процедуры
    классов UsefulClass и Decorator.
    */
    public static void main(String[] args) {
        System.out.println(Decorator.decorate(UsefulClass.say()));
        System.out.println(Decorator.decorate(UsefulClass.move()));
        System.out.println(Decorator.decorate(UsefulClass.stop()));
        System.out.println(Decorator.decorate(UsefulClass.dosomething()));
    }
}