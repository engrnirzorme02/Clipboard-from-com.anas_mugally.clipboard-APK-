package p216c2;

import java.util.Arrays;
import p198a2.C2187c;

/* JADX INFO: renamed from: c2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2992h {

    /* JADX INFO: renamed from: a */
    private final C2187c f12407a;

    /* JADX INFO: renamed from: b */
    private final byte[] f12408b;

    public C2992h(C2187c c2187c, byte[] bArr) {
        if (c2187c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f12407a = c2187c;
        this.f12408b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m14944a() {
        return this.f12408b;
    }

    /* JADX INFO: renamed from: b */
    public C2187c m14945b() {
        return this.f12407a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2992h)) {
            return false;
        }
        C2992h c2992h = (C2992h) obj;
        if (this.f12407a.equals(c2992h.f12407a)) {
            return Arrays.equals(this.f12408b, c2992h.f12408b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12407a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12408b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f12407a + ", bytes=[...]}";
    }
}
