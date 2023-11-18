package org.example.week7.lab.LoggingSystem;


@FunctionalInterface
public interface Logger {
    public void logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger{
    public void logMessage(String message){
        message = "You are logged in, ";
        System.out.println(message + this.loggerName);
    }
}

class ClassLogger implements Logger{
    private String loggerName;

    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public void logMessage(String message){
        message = "You are logged in, ";
        System.out.println(message + this.loggerName);
    }
}

class RunLogin{
    public static void main(String[] args) {

        RecordLogger rLogger = new RecordLogger("Huso");
        rLogger.logMessage("You are logged in, ");
        System.out.print(" - this is record based logger.");
        ClassLogger cLogger = new ClassLogger("Iman");
        System.out.println("  ");
        cLogger.logMessage("You are logged in, ");
        System.out.println(" - this is class based logger.");
        System.out.println();

        Logger lambdaRecordLogger = message -> System.out.println("LambdaRecordLogger: " + message);

        lambdaRecordLogger.logMessage("This is a lambda record-based log message");


        Logger lambdaClassLogger = message -> System.out.println("LambdaClassLogger: " + message);

        lambdaClassLogger.logMessage("This is a lambda class-based log message");


    }
}

