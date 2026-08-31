package p276j4;

import java.util.Arrays;

/* JADX INFO: renamed from: j4.g */
/* JADX INFO: loaded from: classes.dex */
final class C5876g extends AbstractC5868F.d.b {

    /* JADX INFO: renamed from: a */
    private final String f23266a;

    /* JADX INFO: renamed from: b */
    private final byte[] f23267b;

    /* JADX INFO: renamed from: j4.g$b */
    static final class b extends AbstractC5868F.d.b.a {

        /* JADX INFO: renamed from: a */
        private String f23268a;

        /* JADX INFO: renamed from: b */
        private byte[] f23269b;

        b() {
        }

        @Override // p276j4.AbstractC5868F.d.b.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.d.b mo26381a() {
            byte[] bArr;
            String str = this.f23268a;
            if (str != null && (bArr = this.f23269b) != null) {
                return new C5876g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23268a == null) {
                sb.append(" filename");
            }
            if (this.f23269b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.d.b.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.d.b.a mo26382b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f23269b = bArr;
            return this;
        }

        @Override // p276j4.AbstractC5868F.d.b.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.d.b.a mo26383c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f23268a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.d.b
    /* JADX INFO: renamed from: b */
    public byte[] mo26379b() {
        return this.f23267b;
    }

    @Override // p276j4.AbstractC5868F.d.b
    /* JADX INFO: renamed from: c */
    public String mo26380c() {
        return this.f23266a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.d.b) {
            AbstractC5868F.d.b bVar = (AbstractC5868F.d.b) obj;
            if (this.f23266a.equals(bVar.mo26380c())) {
                if (Arrays.equals(this.f23267b, bVar instanceof C5876g ? ((C5876g) bVar).f23267b : bVar.mo26379b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23266a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23267b);
    }

    public String toString() {
        return "File{filename=" + this.f23266a + ", contents=" + Arrays.toString(this.f23267b) + "}";
    }

    private C5876g(String str, byte[] bArr) {
        this.f23266a = str;
        this.f23267b = bArr;
    }
}
