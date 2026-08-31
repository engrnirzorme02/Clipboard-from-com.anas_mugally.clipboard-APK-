package p216c2;

import java.util.Arrays;
import p198a2.EnumC2190f;

/* JADX INFO: renamed from: c2.d */
/* JADX INFO: loaded from: classes.dex */
final class C2988d extends AbstractC3000p {

    /* JADX INFO: renamed from: a */
    private final String f12386a;

    /* JADX INFO: renamed from: b */
    private final byte[] f12387b;

    /* JADX INFO: renamed from: c */
    private final EnumC2190f f12388c;

    /* JADX INFO: renamed from: c2.d$b */
    static final class b extends AbstractC3000p.a {

        /* JADX INFO: renamed from: a */
        private String f12389a;

        /* JADX INFO: renamed from: b */
        private byte[] f12390b;

        /* JADX INFO: renamed from: c */
        private EnumC2190f f12391c;

        b() {
        }

        @Override // p216c2.AbstractC3000p.a
        /* JADX INFO: renamed from: a */
        public AbstractC3000p mo14932a() {
            String str = "";
            if (this.f12389a == null) {
                str = " backendName";
            }
            if (this.f12391c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C2988d(this.f12389a, this.f12390b, this.f12391c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p216c2.AbstractC3000p.a
        /* JADX INFO: renamed from: b */
        public AbstractC3000p.a mo14933b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f12389a = str;
            return this;
        }

        @Override // p216c2.AbstractC3000p.a
        /* JADX INFO: renamed from: c */
        public AbstractC3000p.a mo14934c(byte[] bArr) {
            this.f12390b = bArr;
            return this;
        }

        @Override // p216c2.AbstractC3000p.a
        /* JADX INFO: renamed from: d */
        public AbstractC3000p.a mo14935d(EnumC2190f enumC2190f) {
            if (enumC2190f == null) {
                throw new NullPointerException("Null priority");
            }
            this.f12391c = enumC2190f;
            return this;
        }
    }

    @Override // p216c2.AbstractC3000p
    /* JADX INFO: renamed from: b */
    public String mo14929b() {
        return this.f12386a;
    }

    @Override // p216c2.AbstractC3000p
    /* JADX INFO: renamed from: c */
    public byte[] mo14930c() {
        return this.f12387b;
    }

    @Override // p216c2.AbstractC3000p
    /* JADX INFO: renamed from: d */
    public EnumC2190f mo14931d() {
        return this.f12388c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3000p) {
            AbstractC3000p abstractC3000p = (AbstractC3000p) obj;
            if (this.f12386a.equals(abstractC3000p.mo14929b())) {
                if (Arrays.equals(this.f12387b, abstractC3000p instanceof C2988d ? ((C2988d) abstractC3000p).f12387b : abstractC3000p.mo14930c()) && this.f12388c.equals(abstractC3000p.mo14931d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12386a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12387b)) * 1000003) ^ this.f12388c.hashCode();
    }

    private C2988d(String str, byte[] bArr, EnumC2190f enumC2190f) {
        this.f12386a = str;
        this.f12387b = bArr;
        this.f12388c = enumC2190f;
    }
}
