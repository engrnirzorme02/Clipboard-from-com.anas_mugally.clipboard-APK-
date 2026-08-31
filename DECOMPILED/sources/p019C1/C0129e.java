package p019C1;

import java.io.IOException;

/* JADX INFO: renamed from: C1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0129e extends IOException {

    /* JADX INFO: renamed from: a */
    private final int f688a;

    public C0129e(int i7) {
        this("Http request failed", i7);
    }

    public C0129e(String str, int i7) {
        this(str, i7, null);
    }

    public C0129e(String str, int i7, Throwable th) {
        super(str + ", status code: " + i7, th);
        this.f688a = i7;
    }
}
