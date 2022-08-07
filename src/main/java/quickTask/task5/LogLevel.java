package quickTask.task5;

import java.util.EnumSet;

public enum LogLevel {
    None,
    Info,
    Debug,
    Warning,
    Error,
    FunctionalMessage,
    FunctionalError;
    static EnumSet<LogLevel> All() {return EnumSet.allOf(LogLevel.class);}
}
