package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.r */
/* JADX INFO: loaded from: classes.dex */
final class C5887r extends AbstractC5868F.e.d.a.b.AbstractC7705e {

    /* JADX INFO: renamed from: a */
    private final String f23391a;

    /* JADX INFO: renamed from: b */
    private final int f23392b;

    /* JADX INFO: renamed from: c */
    private final List f23393c;

    /* JADX INFO: renamed from: j4.r$b */
    static final class b extends AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a {

        /* JADX INFO: renamed from: a */
        private String f23394a;

        /* JADX INFO: renamed from: b */
        private int f23395b;

        /* JADX INFO: renamed from: c */
        private List f23396c;

        /* JADX INFO: renamed from: d */
        private byte f23397d;

        b() {
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.e.d.a.b.AbstractC7705e mo26524a() {
            String str;
            List list;
            if (this.f23397d == 1 && (str = this.f23394a) != null && (list = this.f23396c) != null) {
                return new C5887r(str, this.f23395b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f23394a == null) {
                sb.append(" name");
            }
            if ((1 & this.f23397d) == 0) {
                sb.append(" importance");
            }
            if (this.f23396c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a mo26525b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f23396c = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a mo26526c(int i7) {
            this.f23395b = i7;
            this.f23397d = (byte) (this.f23397d | 1);
            return this;
        }

        @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a
        /* JADX INFO: renamed from: d */
        public AbstractC5868F.e.d.a.b.AbstractC7705e.AbstractC7706a mo26527d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f23394a = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e
    /* JADX INFO: renamed from: b */
    public List mo26521b() {
        return this.f23393c;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e
    /* JADX INFO: renamed from: c */
    public int mo26522c() {
        return this.f23392b;
    }

    @Override // p276j4.AbstractC5868F.e.d.a.b.AbstractC7705e
    /* JADX INFO: renamed from: d */
    public String mo26523d() {
        return this.f23391a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.e.d.a.b.AbstractC7705e) {
            AbstractC5868F.e.d.a.b.AbstractC7705e abstractC7705e = (AbstractC5868F.e.d.a.b.AbstractC7705e) obj;
            if (this.f23391a.equals(abstractC7705e.mo26523d()) && this.f23392b == abstractC7705e.mo26522c() && this.f23393c.equals(abstractC7705e.mo26521b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23391a.hashCode() ^ 1000003) * 1000003) ^ this.f23392b) * 1000003) ^ this.f23393c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f23391a + ", importance=" + this.f23392b + ", frames=" + this.f23393c + "}";
    }

    private C5887r(String str, int i7, List list) {
        this.f23391a = str;
        this.f23392b = i7;
        this.f23393c = list;
    }
}
