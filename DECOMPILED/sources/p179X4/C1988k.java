package p179X4;

/* JADX INFO: renamed from: X4.k */
/* JADX INFO: loaded from: classes.dex */
final class C1988k extends C1973U.a {

    /* JADX INFO: renamed from: a */
    private final C1990m f6603a;

    /* JADX INFO: renamed from: b */
    private final boolean f6604b;

    /* JADX INFO: renamed from: c */
    private final int f6605c;

    /* JADX INFO: renamed from: d */
    private final int f6606d;

    /* JADX INFO: renamed from: e */
    private final int f6607e;

    C1988k(C1990m c1990m, boolean z7, int i7, int i8, int i9) {
        this.f6603a = c1990m;
        this.f6604b = z7;
        this.f6605c = i7;
        this.f6606d = i8;
        this.f6607e = i9;
    }

    @Override // p179X4.C1973U.a
    /* JADX INFO: renamed from: a */
    boolean mo8245a() {
        return this.f6604b;
    }

    @Override // p179X4.C1973U.a
    /* JADX INFO: renamed from: b */
    int mo8246b() {
        return this.f6606d;
    }

    @Override // p179X4.C1973U.a
    /* JADX INFO: renamed from: c */
    C1990m mo8247c() {
        return this.f6603a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1973U.a) {
            C1973U.a aVar = (C1973U.a) obj;
            C1990m c1990m = this.f6603a;
            if (c1990m != null ? c1990m.equals(aVar.mo8247c()) : aVar.mo8247c() == null) {
                if (this.f6604b == aVar.mo8245a() && this.f6605c == aVar.mo8248f() && this.f6606d == aVar.mo8246b() && this.f6607e == aVar.mo8249g()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p179X4.C1973U.a
    /* JADX INFO: renamed from: f */
    int mo8248f() {
        return this.f6605c;
    }

    @Override // p179X4.C1973U.a
    /* JADX INFO: renamed from: g */
    int mo8249g() {
        return this.f6607e;
    }

    public int hashCode() {
        C1990m c1990m = this.f6603a;
        return (((((((((c1990m == null ? 0 : c1990m.hashCode()) ^ 1000003) * 1000003) ^ (this.f6604b ? 1231 : 1237)) * 1000003) ^ this.f6605c) * 1000003) ^ this.f6606d) * 1000003) ^ this.f6607e;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f6603a + ", applied=" + this.f6604b + ", hashCount=" + this.f6605c + ", bitmapLength=" + this.f6606d + ", padding=" + this.f6607e + "}";
    }
}
