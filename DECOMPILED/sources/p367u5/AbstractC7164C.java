package p367u5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: u5.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7164C {
    /* JADX INFO: renamed from: a */
    private static String m31667a(int i7) {
        if (i7 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i7 == 1) {
            return "MMMM d, yyyy";
        }
        if (i7 == 2) {
            return "MMM d, yyyy";
        }
        if (i7 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i7);
    }

    /* JADX INFO: renamed from: b */
    private static String m31668b(int i7) {
        if (i7 == 0 || i7 == 1) {
            return "h:mm:ss a z";
        }
        if (i7 == 2) {
            return "h:mm:ss a";
        }
        if (i7 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i7);
    }

    /* JADX INFO: renamed from: c */
    public static DateFormat m31669c(int i7, int i8) {
        return new SimpleDateFormat(m31667a(i7) + " " + m31668b(i8), Locale.US);
    }
}
