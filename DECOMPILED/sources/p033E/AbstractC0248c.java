package p033E;

import android.graphics.Paint;

/* JADX INFO: renamed from: E.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248c {

    /* JADX INFO: renamed from: a */
    private static final ThreadLocal f988a = new ThreadLocal();

    /* JADX INFO: renamed from: E.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m1190a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1189a(Paint paint, String str) {
        return a.m1190a(paint, str);
    }
}
