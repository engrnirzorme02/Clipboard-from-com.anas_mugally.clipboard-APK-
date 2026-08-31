package p268i4;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
final class C5706b extends AbstractC5714j {

    /* JADX INFO: renamed from: b */
    private final String f21770b;

    /* JADX INFO: renamed from: c */
    private final String f21771c;

    /* JADX INFO: renamed from: d */
    private final String f21772d;

    /* JADX INFO: renamed from: e */
    private final String f21773e;

    /* JADX INFO: renamed from: f */
    private final long f21774f;

    C5706b(String str, String str2, String str3, String str4, long j7) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f21770b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f21771c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f21772d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f21773e = str4;
        this.f21774f = j7;
    }

    @Override // p268i4.AbstractC5714j
    /* JADX INFO: renamed from: c */
    public String mo25267c() {
        return this.f21771c;
    }

    @Override // p268i4.AbstractC5714j
    /* JADX INFO: renamed from: d */
    public String mo25268d() {
        return this.f21772d;
    }

    @Override // p268i4.AbstractC5714j
    /* JADX INFO: renamed from: e */
    public String mo25269e() {
        return this.f21770b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5714j) {
            AbstractC5714j abstractC5714j = (AbstractC5714j) obj;
            if (this.f21770b.equals(abstractC5714j.mo25269e()) && this.f21771c.equals(abstractC5714j.mo25267c()) && this.f21772d.equals(abstractC5714j.mo25268d()) && this.f21773e.equals(abstractC5714j.mo25271g()) && this.f21774f == abstractC5714j.mo25270f()) {
                return true;
            }
        }
        return false;
    }

    @Override // p268i4.AbstractC5714j
    /* JADX INFO: renamed from: f */
    public long mo25270f() {
        return this.f21774f;
    }

    @Override // p268i4.AbstractC5714j
    /* JADX INFO: renamed from: g */
    public String mo25271g() {
        return this.f21773e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f21770b.hashCode() ^ 1000003) * 1000003) ^ this.f21771c.hashCode()) * 1000003) ^ this.f21772d.hashCode()) * 1000003) ^ this.f21773e.hashCode()) * 1000003;
        long j7 = this.f21774f;
        return iHashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f21770b + ", parameterKey=" + this.f21771c + ", parameterValue=" + this.f21772d + ", variantId=" + this.f21773e + ", templateVersion=" + this.f21774f + "}";
    }
}
