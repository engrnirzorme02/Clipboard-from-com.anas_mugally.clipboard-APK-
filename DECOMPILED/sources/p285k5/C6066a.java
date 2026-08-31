package p285k5;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: loaded from: classes.dex */
final class C6066a extends AbstractC6071f {

    /* JADX INFO: renamed from: a */
    private final String f23836a;

    /* JADX INFO: renamed from: b */
    private final String f23837b;

    C6066a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f23836a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f23837b = str2;
    }

    @Override // p285k5.AbstractC6071f
    /* JADX INFO: renamed from: b */
    public String mo27101b() {
        return this.f23836a;
    }

    @Override // p285k5.AbstractC6071f
    /* JADX INFO: renamed from: c */
    public String mo27102c() {
        return this.f23837b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6071f) {
            AbstractC6071f abstractC6071f = (AbstractC6071f) obj;
            if (this.f23836a.equals(abstractC6071f.mo27101b()) && this.f23837b.equals(abstractC6071f.mo27102c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23836a.hashCode() ^ 1000003) * 1000003) ^ this.f23837b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f23836a + ", version=" + this.f23837b + "}";
    }
}
