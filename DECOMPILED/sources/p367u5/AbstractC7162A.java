package p367u5;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: u5.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7162A {
    /* JADX INFO: renamed from: a */
    private static void m31663a(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: b */
    public static BigDecimal m31664b(String str) {
        m31663a(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: " + str);
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m31665c(String str) {
        m31663a(str);
        return new BigInteger(str);
    }
}
