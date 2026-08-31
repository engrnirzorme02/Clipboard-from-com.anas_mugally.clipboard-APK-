package p302m6;

import p278j6.C5904f;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: m6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6400b {
    /* JADX INFO: renamed from: a */
    public static int m27516a(int i7) {
        if (2 <= i7 && i7 < 37) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new C5904f(2, 36));
    }

    /* JADX INFO: renamed from: b */
    public static final int m27517b(char c7, int i7) {
        return Character.digit((int) c7, i7);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m27518c(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }
}
