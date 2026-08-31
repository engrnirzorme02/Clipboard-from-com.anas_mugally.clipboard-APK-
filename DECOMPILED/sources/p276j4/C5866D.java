package p276j4;

/* JADX INFO: renamed from: j4.D */
/* JADX INFO: loaded from: classes.dex */
final class C5866D extends AbstractC5869G.b {

    /* JADX INFO: renamed from: a */
    private final int f23048a;

    /* JADX INFO: renamed from: b */
    private final String f23049b;

    /* JADX INFO: renamed from: c */
    private final int f23050c;

    /* JADX INFO: renamed from: d */
    private final long f23051d;

    /* JADX INFO: renamed from: e */
    private final long f23052e;

    /* JADX INFO: renamed from: f */
    private final boolean f23053f;

    /* JADX INFO: renamed from: g */
    private final int f23054g;

    /* JADX INFO: renamed from: h */
    private final String f23055h;

    /* JADX INFO: renamed from: i */
    private final String f23056i;

    C5866D(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f23048a = i7;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f23049b = str;
        this.f23050c = i8;
        this.f23051d = j7;
        this.f23052e = j8;
        this.f23053f = z7;
        this.f23054g = i9;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f23055h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f23056i = str3;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: a */
    public int mo26291a() {
        return this.f23048a;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: b */
    public int mo26292b() {
        return this.f23050c;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: d */
    public long mo26293d() {
        return this.f23052e;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: e */
    public boolean mo26294e() {
        return this.f23053f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5869G.b) {
            AbstractC5869G.b bVar = (AbstractC5869G.b) obj;
            if (this.f23048a == bVar.mo26291a() && this.f23049b.equals(bVar.mo26296g()) && this.f23050c == bVar.mo26292b() && this.f23051d == bVar.mo26299j() && this.f23052e == bVar.mo26293d() && this.f23053f == bVar.mo26294e() && this.f23054g == bVar.mo26298i() && this.f23055h.equals(bVar.mo26295f()) && this.f23056i.equals(bVar.mo26297h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: f */
    public String mo26295f() {
        return this.f23055h;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: g */
    public String mo26296g() {
        return this.f23049b;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: h */
    public String mo26297h() {
        return this.f23056i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f23048a ^ 1000003) * 1000003) ^ this.f23049b.hashCode()) * 1000003) ^ this.f23050c) * 1000003;
        long j7 = this.f23051d;
        int i7 = (iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f23052e;
        return ((((((((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ (this.f23053f ? 1231 : 1237)) * 1000003) ^ this.f23054g) * 1000003) ^ this.f23055h.hashCode()) * 1000003) ^ this.f23056i.hashCode();
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: i */
    public int mo26298i() {
        return this.f23054g;
    }

    @Override // p276j4.AbstractC5869G.b
    /* JADX INFO: renamed from: j */
    public long mo26299j() {
        return this.f23051d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f23048a + ", model=" + this.f23049b + ", availableProcessors=" + this.f23050c + ", totalRam=" + this.f23051d + ", diskSpace=" + this.f23052e + ", isEmulator=" + this.f23053f + ", state=" + this.f23054g + ", manufacturer=" + this.f23055h + ", modelClass=" + this.f23056i + "}";
    }
}
