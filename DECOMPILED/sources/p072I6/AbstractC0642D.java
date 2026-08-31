package p072I6;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0642D {
    /* JADX INFO: renamed from: a */
    public static final long m2960a(String str, int i7, int i8) {
        int i9;
        AbstractC6118n.m27187e(str, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i8 + " < " + i7).toString());
        }
        if (i8 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + str.length()).toString());
        }
        long j7 = 0;
        while (i7 < i8) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 128) {
                j7++;
            } else {
                if (cCharAt < 2048) {
                    i9 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i9 = 3;
                } else {
                    int i10 = i7 + 1;
                    char cCharAt2 = i10 < i8 ? str.charAt(i10) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j7++;
                        i7 = i10;
                    } else {
                        j7 += (long) 4;
                        i7 += 2;
                    }
                }
                j7 += (long) i9;
            }
            i7++;
        }
        return j7;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m2961b(String str, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = str.length();
        }
        return m2960a(str, i7, i8);
    }
}
