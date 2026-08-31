package p098M0;

import java.util.Objects;

/* JADX INFO: renamed from: M0.d */
/* JADX INFO: loaded from: classes.dex */
public class C0874d {

    /* JADX INFO: renamed from: a */
    private final AbstractC0875e[] f3455a;

    /* JADX INFO: renamed from: b */
    private final String f3456b;

    /* JADX INFO: renamed from: c */
    private final byte[] f3457c;

    /* JADX INFO: renamed from: d */
    private final int f3458d;

    public C0874d(String str, AbstractC0875e[] abstractC0875eArr) {
        this.f3456b = str;
        this.f3457c = null;
        this.f3455a = abstractC0875eArr;
        this.f3458d = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m4016a(int i7) {
        if (i7 == this.f3458d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + m4017c(this.f3458d) + " expected, but got " + m4017c(i7));
    }

    /* JADX INFO: renamed from: c */
    private String m4017c(int i7) {
        if (i7 != 0) {
            return i7 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    /* JADX INFO: renamed from: b */
    public String m4018b() {
        m4016a(0);
        return this.f3456b;
    }

    public C0874d(byte[] bArr, AbstractC0875e[] abstractC0875eArr) {
        Objects.requireNonNull(bArr);
        this.f3457c = bArr;
        this.f3456b = null;
        this.f3455a = abstractC0875eArr;
        this.f3458d = 1;
    }
}
