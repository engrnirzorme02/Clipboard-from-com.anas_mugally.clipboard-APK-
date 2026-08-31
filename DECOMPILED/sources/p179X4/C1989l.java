package p179X4;

/* JADX INFO: renamed from: X4.l */
/* JADX INFO: loaded from: classes.dex */
final class C1989l extends C1973U.b {

    /* JADX INFO: renamed from: a */
    private final int f6608a;

    /* JADX INFO: renamed from: b */
    private final int f6609b;

    /* JADX INFO: renamed from: c */
    private final String f6610c;

    /* JADX INFO: renamed from: d */
    private final String f6611d;

    /* JADX INFO: renamed from: e */
    private final C1973U.a f6612e;

    C1989l(int i7, int i8, String str, String str2, C1973U.a aVar) {
        this.f6608a = i7;
        this.f6609b = i8;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.f6610c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.f6611d = str2;
        this.f6612e = aVar;
    }

    @Override // p179X4.C1973U.b
    /* JADX INFO: renamed from: a */
    C1973U.a mo8252a() {
        return this.f6612e;
    }

    @Override // p179X4.C1973U.b
    /* JADX INFO: renamed from: c */
    String mo8253c() {
        return this.f6611d;
    }

    @Override // p179X4.C1973U.b
    /* JADX INFO: renamed from: d */
    int mo8254d() {
        return this.f6609b;
    }

    public boolean equals(Object obj) {
        C1973U.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1973U.b) {
            C1973U.b bVar = (C1973U.b) obj;
            if (this.f6608a == bVar.mo8255f() && this.f6609b == bVar.mo8254d() && this.f6610c.equals(bVar.mo8256g()) && this.f6611d.equals(bVar.mo8253c()) && ((aVar = this.f6612e) != null ? aVar.equals(bVar.mo8252a()) : bVar.mo8252a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p179X4.C1973U.b
    /* JADX INFO: renamed from: f */
    int mo8255f() {
        return this.f6608a;
    }

    @Override // p179X4.C1973U.b
    /* JADX INFO: renamed from: g */
    String mo8256g() {
        return this.f6610c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f6608a ^ 1000003) * 1000003) ^ this.f6609b) * 1000003) ^ this.f6610c.hashCode()) * 1000003) ^ this.f6611d.hashCode()) * 1000003;
        C1973U.a aVar = this.f6612e;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f6608a + ", existenceFilterCount=" + this.f6609b + ", projectId=" + this.f6610c + ", databaseId=" + this.f6611d + ", bloomFilter=" + this.f6612e + "}";
    }
}
