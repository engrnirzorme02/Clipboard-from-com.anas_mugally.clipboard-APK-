package p276j4;

import java.util.List;

/* JADX INFO: renamed from: j4.f */
/* JADX INFO: loaded from: classes.dex */
final class C5875f extends AbstractC5868F.d {

    /* JADX INFO: renamed from: a */
    private final List f23262a;

    /* JADX INFO: renamed from: b */
    private final String f23263b;

    /* JADX INFO: renamed from: j4.f$b */
    static final class b extends AbstractC5868F.d.a {

        /* JADX INFO: renamed from: a */
        private List f23264a;

        /* JADX INFO: renamed from: b */
        private String f23265b;

        b() {
        }

        @Override // p276j4.AbstractC5868F.d.a
        /* JADX INFO: renamed from: a */
        public AbstractC5868F.d mo26375a() {
            List list = this.f23264a;
            if (list != null) {
                return new C5875f(list, this.f23265b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // p276j4.AbstractC5868F.d.a
        /* JADX INFO: renamed from: b */
        public AbstractC5868F.d.a mo26376b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f23264a = list;
            return this;
        }

        @Override // p276j4.AbstractC5868F.d.a
        /* JADX INFO: renamed from: c */
        public AbstractC5868F.d.a mo26377c(String str) {
            this.f23265b = str;
            return this;
        }
    }

    @Override // p276j4.AbstractC5868F.d
    /* JADX INFO: renamed from: b */
    public List mo26373b() {
        return this.f23262a;
    }

    @Override // p276j4.AbstractC5868F.d
    /* JADX INFO: renamed from: c */
    public String mo26374c() {
        return this.f23263b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5868F.d) {
            AbstractC5868F.d dVar = (AbstractC5868F.d) obj;
            if (this.f23262a.equals(dVar.mo26373b()) && ((str = this.f23263b) != null ? str.equals(dVar.mo26374c()) : dVar.mo26374c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f23262a.hashCode() ^ 1000003) * 1000003;
        String str = this.f23263b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f23262a + ", orgId=" + this.f23263b + "}";
    }

    private C5875f(List list, String str) {
        this.f23262a = list;
        this.f23263b = str;
    }
}
