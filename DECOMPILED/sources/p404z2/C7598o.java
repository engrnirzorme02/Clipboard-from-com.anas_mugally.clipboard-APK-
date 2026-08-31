package p404z2;

/* JADX INFO: renamed from: z2.o */
/* JADX INFO: loaded from: classes.dex */
final class C7598o extends AbstractC7608y {

    /* JADX INFO: renamed from: a */
    private final int f30265a;

    /* JADX INFO: renamed from: b */
    private final int f30266b;

    /* JADX INFO: renamed from: c */
    private final double f30267c;

    /* JADX INFO: renamed from: d */
    private final boolean f30268d;

    C7598o(int i7, int i8, double d7, boolean z7) {
        this.f30265a = i7;
        this.f30266b = i8;
        this.f30267c = d7;
        this.f30268d = z7;
    }

    @Override // p404z2.AbstractC7608y
    /* JADX INFO: renamed from: a */
    public final int mo33322a() {
        return this.f30265a;
    }

    @Override // p404z2.AbstractC7608y
    /* JADX INFO: renamed from: b */
    public final int mo33323b() {
        return this.f30266b;
    }

    @Override // p404z2.AbstractC7608y
    /* JADX INFO: renamed from: c */
    public final double mo33324c() {
        return this.f30267c;
    }

    @Override // p404z2.AbstractC7608y
    /* JADX INFO: renamed from: d */
    public final boolean mo33325d() {
        return this.f30268d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7608y) {
            AbstractC7608y abstractC7608y = (AbstractC7608y) obj;
            if (this.f30265a == abstractC7608y.mo33322a() && this.f30266b == abstractC7608y.mo33323b() && Double.doubleToLongBits(this.f30267c) == Double.doubleToLongBits(abstractC7608y.mo33324c()) && this.f30268d == abstractC7608y.mo33325d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d7 = this.f30267c;
        return ((((int) (Double.doubleToLongBits(d7) ^ (Double.doubleToLongBits(d7) >>> 32))) ^ ((((this.f30265a ^ 1000003) * 1000003) ^ this.f30266b) * 1000003)) * 1000003) ^ (true != this.f30268d ? 1237 : 1231);
    }

    public final String toString() {
        int i7 = this.f30265a;
        int length = String.valueOf(i7).length();
        int i8 = this.f30266b;
        int length2 = String.valueOf(i8).length();
        double d7 = this.f30267c;
        int length3 = String.valueOf(d7).length();
        boolean z7 = this.f30268d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z7).length() + 1);
        sb.append("PingStrategy{maxAttempts=");
        sb.append(i7);
        sb.append(", initialBackoffMs=");
        sb.append(i8);
        sb.append(", backoffMultiplier=");
        sb.append(d7);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
