package p208b2;

import java.util.Arrays;

/* JADX INFO: renamed from: b2.g */
/* JADX INFO: loaded from: classes.dex */
final class C2941g extends AbstractC2951q {

    /* JADX INFO: renamed from: a */
    private final byte[] f12141a;

    /* JADX INFO: renamed from: b */
    private final byte[] f12142b;

    /* JADX INFO: renamed from: b2.g$b */
    static final class b extends AbstractC2951q.a {

        /* JADX INFO: renamed from: a */
        private byte[] f12143a;

        /* JADX INFO: renamed from: b */
        private byte[] f12144b;

        b() {
        }

        @Override // p208b2.AbstractC2951q.a
        /* JADX INFO: renamed from: a */
        public AbstractC2951q mo14735a() {
            return new C2941g(this.f12143a, this.f12144b);
        }

        @Override // p208b2.AbstractC2951q.a
        /* JADX INFO: renamed from: b */
        public AbstractC2951q.a mo14736b(byte[] bArr) {
            this.f12143a = bArr;
            return this;
        }

        @Override // p208b2.AbstractC2951q.a
        /* JADX INFO: renamed from: c */
        public AbstractC2951q.a mo14737c(byte[] bArr) {
            this.f12144b = bArr;
            return this;
        }
    }

    @Override // p208b2.AbstractC2951q
    /* JADX INFO: renamed from: b */
    public byte[] mo14733b() {
        return this.f12141a;
    }

    @Override // p208b2.AbstractC2951q
    /* JADX INFO: renamed from: c */
    public byte[] mo14734c() {
        return this.f12142b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2951q) {
            AbstractC2951q abstractC2951q = (AbstractC2951q) obj;
            boolean z7 = abstractC2951q instanceof C2941g;
            if (Arrays.equals(this.f12141a, z7 ? ((C2941g) abstractC2951q).f12141a : abstractC2951q.mo14733b())) {
                if (Arrays.equals(this.f12142b, z7 ? ((C2941g) abstractC2951q).f12142b : abstractC2951q.mo14734c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f12141a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12142b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f12141a) + ", encryptedBlob=" + Arrays.toString(this.f12142b) + "}";
    }

    private C2941g(byte[] bArr, byte[] bArr2) {
        this.f12141a = bArr;
        this.f12142b = bArr2;
    }
}
