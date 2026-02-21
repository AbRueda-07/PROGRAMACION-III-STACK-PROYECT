-dontwarn **
-dontnote **
-dontoptimize
-overloadaggressively

# Mantener clases públicas de la librería

-keep public class umg.edu.gt.data_structure.stack.** {
    public *;
}

-keepattributes *Annotation*
-keepattributes Signature