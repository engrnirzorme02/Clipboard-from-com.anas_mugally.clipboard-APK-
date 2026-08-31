package p122P3;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: P3.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1213q {
    /* JADX INFO: renamed from: a */
    public static boolean m5323a(String str) {
        return AbstractC1208l.m5288c(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m5324b(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i7 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i8 = 0; i8 < objArr.length; i8++) {
                objArr[i8] = m5325c(objArr[i8]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) strValueOf, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) strValueOf, i9, strValueOf.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    private static String m5325c(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e7) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e7);
            return "<" + str + " threw " + e7.getClass().getName() + ">";
        }
    }
}
