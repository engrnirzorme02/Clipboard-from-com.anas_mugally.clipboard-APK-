package p276j4;

/* JADX INFO: renamed from: j4.E */
/* JADX INFO: loaded from: classes.dex */
final class C5867E extends AbstractC5869G.c {

    /* JADX INFO: renamed from: a */
    private final String f23057a;

    /* JADX INFO: renamed from: b */
    private final String f23058b;

    /* JADX INFO: renamed from: c */
    private final boolean f23059c;

    C5867E(String str, String str2, boolean z7) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f23057a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f23058b = str2;
        this.f23059c = z7;
    }

    @Override // p276j4.AbstractC5869G.c
    /* JADX INFO: renamed from: b */
    public boolean mo26300b() {
        return this.f23059c;
    }

    @Override // p276j4.AbstractC5869G.c
    /* JADX INFO: renamed from: c */
    public String mo26301c() {
        return this.f23058b;
    }

    @Override // p276j4.AbstractC5869G.c
    /* JADX INFO: renamed from: d */
    public String mo26302d() {
        return this.f23057a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5869G.c) {
            AbstractC5869G.c cVar = (AbstractC5869G.c) obj;
            if (this.f23057a.equals(cVar.mo26302d()) && this.f23058b.equals(cVar.mo26301c()) && this.f23059c == cVar.mo26300b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23057a.hashCode() ^ 1000003) * 1000003) ^ this.f23058b.hashCode()) * 1000003) ^ (this.f23059c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f23057a + ", osCodeName=" + this.f23058b + ", isRooted=" + this.f23059c + "}";
    }
}
