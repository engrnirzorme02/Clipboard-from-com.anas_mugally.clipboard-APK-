package p144S4;

import java.util.Arrays;
import p158U4.C1687k;

/* JADX INFO: renamed from: S4.a */
/* JADX INFO: loaded from: classes.dex */
final class C1416a extends AbstractC1420e {

    /* JADX INFO: renamed from: a */
    private final int f4928a;

    /* JADX INFO: renamed from: b */
    private final C1687k f4929b;

    /* JADX INFO: renamed from: c */
    private final byte[] f4930c;

    /* JADX INFO: renamed from: d */
    private final byte[] f4931d;

    C1416a(int i7, C1687k c1687k, byte[] bArr, byte[] bArr2) {
        this.f4928a = i7;
        if (c1687k == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f4929b = c1687k;
        if (bArr == null) {
            throw new NullPointerException("Null arrayValue");
        }
        this.f4930c = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Null directionalValue");
        }
        this.f4931d = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1420e) {
            AbstractC1420e abstractC1420e = (AbstractC1420e) obj;
            if (this.f4928a == abstractC1420e.mo6014m() && this.f4929b.equals(abstractC1420e.mo6013k())) {
                boolean z7 = abstractC1420e instanceof C1416a;
                if (Arrays.equals(this.f4930c, z7 ? ((C1416a) abstractC1420e).f4930c : abstractC1420e.mo6011h())) {
                    if (Arrays.equals(this.f4931d, z7 ? ((C1416a) abstractC1420e).f4931d : abstractC1420e.mo6012j())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p144S4.AbstractC1420e
    /* JADX INFO: renamed from: h */
    public byte[] mo6011h() {
        return this.f4930c;
    }

    public int hashCode() {
        return ((((((this.f4928a ^ 1000003) * 1000003) ^ this.f4929b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f4930c)) * 1000003) ^ Arrays.hashCode(this.f4931d);
    }

    @Override // p144S4.AbstractC1420e
    /* JADX INFO: renamed from: j */
    public byte[] mo6012j() {
        return this.f4931d;
    }

    @Override // p144S4.AbstractC1420e
    /* JADX INFO: renamed from: k */
    public C1687k mo6013k() {
        return this.f4929b;
    }

    @Override // p144S4.AbstractC1420e
    /* JADX INFO: renamed from: m */
    public int mo6014m() {
        return this.f4928a;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f4928a + ", documentKey=" + this.f4929b + ", arrayValue=" + Arrays.toString(this.f4930c) + ", directionalValue=" + Arrays.toString(this.f4931d) + "}";
    }
}
