package p329q;

import java.util.Arrays;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
class C6783c {

    /* JADX INFO: renamed from: a */
    private final int f27246a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f27247b;

    C6783c(int i7, CharSequence charSequence) {
        this.f27246a = i7;
        this.f27247b = charSequence;
    }

    /* JADX INFO: renamed from: a */
    private static String m29638a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private boolean m29639d(CharSequence charSequence) {
        String strM29638a = m29638a(this.f27247b);
        String strM29638a2 = m29638a(charSequence);
        if (strM29638a == null && strM29638a2 == null) {
            return true;
        }
        return strM29638a != null && strM29638a.equals(strM29638a2);
    }

    /* JADX INFO: renamed from: b */
    int m29640b() {
        return this.f27246a;
    }

    /* JADX INFO: renamed from: c */
    CharSequence m29641c() {
        return this.f27247b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6783c) {
            C6783c c6783c = (C6783c) obj;
            if (this.f27246a == c6783c.f27246a && m29639d(c6783c.f27247b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f27246a), m29638a(this.f27247b)});
    }
}
