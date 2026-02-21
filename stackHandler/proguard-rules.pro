-dontwarn **
-dontnote **
-dontoptimize
-overloadaggressively

-keep public class umg.edu.gt.stackhandler.App {

    public static void main(java.lang.String[]);
}

-keep class umg.edu.gt.data_structure.stack.** { *; }

-keepattributes *Annotation*
-keepattributes Signature