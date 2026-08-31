package p360t6;

import com.google.android.gms.common.api.C3553a;
import p302m6.AbstractC6406h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: t6.G */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7107G {
    /* JADX INFO: renamed from: a */
    public static final int m31396a(String str, int i7, int i8, int i9) {
        return (int) AbstractC7105E.m31388c(str, i7, i8, i9);
    }

    /* JADX INFO: renamed from: b */
    public static final long m31397b(String str, long j7, long j8, long j9) {
        String strM31389d = AbstractC7105E.m31389d(str);
        if (strM31389d == null) {
            return j7;
        }
        Long lO = AbstractC6406h.m27545o(strM31389d);
        if (lO == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM31389d + '\'').toString());
        }
        long jLongValue = lO.longValue();
        if (j8 <= jLongValue && jLongValue <= j9) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: c */
    public static final String m31398c(String str, String str2) {
        String strM31389d = AbstractC7105E.m31389d(str);
        return strM31389d == null ? str2 : strM31389d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m31399d(String str, boolean z7) {
        String strM31389d = AbstractC7105E.m31389d(str);
        return strM31389d != null ? Boolean.parseBoolean(strM31389d) : z7;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m31400e(String str, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = C3553a.e.API_PRIORITY_OTHER;
        }
        return AbstractC7105E.m31387b(str, i7, i8, i9);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m31401f(String str, long j7, long j8, long j9, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j8 = 1;
        }
        long j10 = j8;
        if ((i7 & 8) != 0) {
            j9 = Long.MAX_VALUE;
        }
        return AbstractC7105E.m31388c(str, j7, j10, j9);
    }
}
