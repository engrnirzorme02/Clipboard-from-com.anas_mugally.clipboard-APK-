package p282k2;

import p216c2.AbstractC2993i;
import p216c2.AbstractC3000p;

/* JADX INFO: renamed from: k2.b */
/* JADX INFO: loaded from: classes.dex */
final class C5993b extends AbstractC6002k {

    /* JADX INFO: renamed from: a */
    private final long f23763a;

    /* JADX INFO: renamed from: b */
    private final AbstractC3000p f23764b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2993i f23765c;

    C5993b(long j7, AbstractC3000p abstractC3000p, AbstractC2993i abstractC2993i) {
        this.f23763a = j7;
        if (abstractC3000p == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f23764b = abstractC3000p;
        if (abstractC2993i == null) {
            throw new NullPointerException("Null event");
        }
        this.f23765c = abstractC2993i;
    }

    @Override // p282k2.AbstractC6002k
    /* JADX INFO: renamed from: b */
    public AbstractC2993i mo27018b() {
        return this.f23765c;
    }

    @Override // p282k2.AbstractC6002k
    /* JADX INFO: renamed from: c */
    public long mo27019c() {
        return this.f23763a;
    }

    @Override // p282k2.AbstractC6002k
    /* JADX INFO: renamed from: d */
    public AbstractC3000p mo27020d() {
        return this.f23764b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6002k) {
            AbstractC6002k abstractC6002k = (AbstractC6002k) obj;
            if (this.f23763a == abstractC6002k.mo27019c() && this.f23764b.equals(abstractC6002k.mo27020d()) && this.f23765c.equals(abstractC6002k.mo27018b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f23763a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23764b.hashCode()) * 1000003) ^ this.f23765c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f23763a + ", transportContext=" + this.f23764b + ", event=" + this.f23765c + "}";
    }
}
