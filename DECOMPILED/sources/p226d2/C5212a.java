package p226d2;

import java.util.Arrays;

/* JADX INFO: renamed from: d2.a */
/* JADX INFO: loaded from: classes.dex */
final class C5212a extends AbstractC5217f {

    /* JADX INFO: renamed from: a */
    private final Iterable f19919a;

    /* JADX INFO: renamed from: b */
    private final byte[] f19920b;

    /* JADX INFO: renamed from: d2.a$b */
    static final class b extends AbstractC5217f.a {

        /* JADX INFO: renamed from: a */
        private Iterable f19921a;

        /* JADX INFO: renamed from: b */
        private byte[] f19922b;

        b() {
        }

        @Override // p226d2.AbstractC5217f.a
        /* JADX INFO: renamed from: a */
        public AbstractC5217f mo24119a() {
            String str = "";
            if (this.f19921a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C5212a(this.f19921a, this.f19922b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p226d2.AbstractC5217f.a
        /* JADX INFO: renamed from: b */
        public AbstractC5217f.a mo24120b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f19921a = iterable;
            return this;
        }

        @Override // p226d2.AbstractC5217f.a
        /* JADX INFO: renamed from: c */
        public AbstractC5217f.a mo24121c(byte[] bArr) {
            this.f19922b = bArr;
            return this;
        }
    }

    @Override // p226d2.AbstractC5217f
    /* JADX INFO: renamed from: b */
    public Iterable mo24117b() {
        return this.f19919a;
    }

    @Override // p226d2.AbstractC5217f
    /* JADX INFO: renamed from: c */
    public byte[] mo24118c() {
        return this.f19920b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5217f) {
            AbstractC5217f abstractC5217f = (AbstractC5217f) obj;
            if (this.f19919a.equals(abstractC5217f.mo24117b())) {
                if (Arrays.equals(this.f19920b, abstractC5217f instanceof C5212a ? ((C5212a) abstractC5217f).f19920b : abstractC5217f.mo24118c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19919a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19920b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f19919a + ", extras=" + Arrays.toString(this.f19920b) + "}";
    }

    private C5212a(Iterable iterable, byte[] bArr) {
        this.f19919a = iterable;
        this.f19920b = bArr;
    }
}
