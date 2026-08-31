package p151T4;

import com.google.protobuf.AbstractC5104i;
import java.util.Objects;
import p137R4.C1348P;
import p158U4.C1698v;
import p179X4.C1976X;
import p186Y4.AbstractC2051s;

/* JADX INFO: renamed from: T4.B1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1477B1 {

    /* JADX INFO: renamed from: a */
    private final C1348P f5041a;

    /* JADX INFO: renamed from: b */
    private final int f5042b;

    /* JADX INFO: renamed from: c */
    private final long f5043c;

    /* JADX INFO: renamed from: d */
    private final EnumC1529b0 f5044d;

    /* JADX INFO: renamed from: e */
    private final C1698v f5045e;

    /* JADX INFO: renamed from: f */
    private final C1698v f5046f;

    /* JADX INFO: renamed from: g */
    private final AbstractC5104i f5047g;

    /* JADX INFO: renamed from: h */
    private final Integer f5048h;

    C1477B1(C1348P c1348p, int i7, long j7, EnumC1529b0 enumC1529b0, C1698v c1698v, C1698v c1698v2, AbstractC5104i abstractC5104i, Integer num) {
        this.f5041a = (C1348P) AbstractC2051s.m8520a(c1348p);
        this.f5042b = i7;
        this.f5043c = j7;
        this.f5046f = c1698v2;
        this.f5044d = enumC1529b0;
        this.f5045e = (C1698v) AbstractC2051s.m8520a(c1698v);
        this.f5047g = (AbstractC5104i) AbstractC2051s.m8520a(abstractC5104i);
        this.f5048h = num;
    }

    /* JADX INFO: renamed from: a */
    public Integer m6207a() {
        return this.f5048h;
    }

    /* JADX INFO: renamed from: b */
    public C1698v m6208b() {
        return this.f5046f;
    }

    /* JADX INFO: renamed from: c */
    public EnumC1529b0 m6209c() {
        return this.f5044d;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC5104i m6210d() {
        return this.f5047g;
    }

    /* JADX INFO: renamed from: e */
    public long m6211e() {
        return this.f5043c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1477B1.class == obj.getClass()) {
            C1477B1 c1477b1 = (C1477B1) obj;
            if (this.f5041a.equals(c1477b1.f5041a) && this.f5042b == c1477b1.f5042b && this.f5043c == c1477b1.f5043c && this.f5044d.equals(c1477b1.f5044d) && this.f5045e.equals(c1477b1.f5045e) && this.f5046f.equals(c1477b1.f5046f) && this.f5047g.equals(c1477b1.f5047g) && Objects.equals(this.f5048h, c1477b1.f5048h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C1698v m6212f() {
        return this.f5045e;
    }

    /* JADX INFO: renamed from: g */
    public C1348P m6213g() {
        return this.f5041a;
    }

    /* JADX INFO: renamed from: h */
    public int m6214h() {
        return this.f5042b;
    }

    public int hashCode() {
        return (((((((((((((this.f5041a.hashCode() * 31) + this.f5042b) * 31) + ((int) this.f5043c)) * 31) + this.f5044d.hashCode()) * 31) + this.f5045e.hashCode()) * 31) + this.f5046f.hashCode()) * 31) + this.f5047g.hashCode()) * 31) + Objects.hashCode(this.f5048h);
    }

    /* JADX INFO: renamed from: i */
    public C1477B1 m6215i(Integer num) {
        return new C1477B1(this.f5041a, this.f5042b, this.f5043c, this.f5044d, this.f5045e, this.f5046f, this.f5047g, num);
    }

    /* JADX INFO: renamed from: j */
    public C1477B1 m6216j(C1698v c1698v) {
        return new C1477B1(this.f5041a, this.f5042b, this.f5043c, this.f5044d, this.f5045e, c1698v, this.f5047g, this.f5048h);
    }

    /* JADX INFO: renamed from: k */
    public C1477B1 m6217k(AbstractC5104i abstractC5104i, C1698v c1698v) {
        return new C1477B1(this.f5041a, this.f5042b, this.f5043c, this.f5044d, c1698v, this.f5046f, abstractC5104i, null);
    }

    /* JADX INFO: renamed from: l */
    public C1477B1 m6218l(long j7) {
        return new C1477B1(this.f5041a, this.f5042b, j7, this.f5044d, this.f5045e, this.f5046f, this.f5047g, this.f5048h);
    }

    public String toString() {
        return "TargetData{target=" + this.f5041a + ", targetId=" + this.f5042b + ", sequenceNumber=" + this.f5043c + ", purpose=" + this.f5044d + ", snapshotVersion=" + this.f5045e + ", lastLimboFreeSnapshotVersion=" + this.f5046f + ", resumeToken=" + this.f5047g + ", expectedCount=" + this.f5048h + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1477B1(C1348P c1348p, int i7, long j7, EnumC1529b0 enumC1529b0) {
        C1698v c1698v = C1698v.f5636b;
        this(c1348p, i7, j7, enumC1529b0, c1698v, c1698v, C1976X.f6548t, null);
    }
}
