package p002A0;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: A0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0006d {

    /* JADX INFO: renamed from: a */
    public static final String[] f13a = new String[0];

    /* JADX INFO: renamed from: a */
    public static final void m8a(StringBuilder builder, int i7) {
        AbstractC6118n.m27187e(builder, "builder");
        for (int i8 = 0; i8 < i7; i8++) {
            builder.append("?");
            if (i8 < i7 - 1) {
                builder.append(",");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final StringBuilder m9b() {
        return new StringBuilder();
    }
}
