package p158U4;

import java.util.List;

/* JADX INFO: renamed from: U4.a */
/* JADX INFO: loaded from: classes.dex */
final class C1677a extends AbstractC1692p {

    /* JADX INFO: renamed from: c */
    private final int f5585c;

    /* JADX INFO: renamed from: d */
    private final String f5586d;

    /* JADX INFO: renamed from: e */
    private final List f5587e;

    /* JADX INFO: renamed from: f */
    private final AbstractC1692p.b f5588f;

    C1677a(int i7, String str, List list, AbstractC1692p.b bVar) {
        this.f5585c = i7;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f5586d = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.f5587e = list;
        if (bVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f5588f = bVar;
    }

    @Override // p158U4.AbstractC1692p
    /* JADX INFO: renamed from: d */
    public String mo7041d() {
        return this.f5586d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1692p) {
            AbstractC1692p abstractC1692p = (AbstractC1692p) obj;
            if (this.f5585c == abstractC1692p.mo7042f() && this.f5586d.equals(abstractC1692p.mo7041d()) && this.f5587e.equals(abstractC1692p.mo7044h()) && this.f5588f.equals(abstractC1692p.mo7043g())) {
                return true;
            }
        }
        return false;
    }

    @Override // p158U4.AbstractC1692p
    /* JADX INFO: renamed from: f */
    public int mo7042f() {
        return this.f5585c;
    }

    @Override // p158U4.AbstractC1692p
    /* JADX INFO: renamed from: g */
    public AbstractC1692p.b mo7043g() {
        return this.f5588f;
    }

    @Override // p158U4.AbstractC1692p
    /* JADX INFO: renamed from: h */
    public List mo7044h() {
        return this.f5587e;
    }

    public int hashCode() {
        return ((((((this.f5585c ^ 1000003) * 1000003) ^ this.f5586d.hashCode()) * 1000003) ^ this.f5587e.hashCode()) * 1000003) ^ this.f5588f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f5585c + ", collectionGroup=" + this.f5586d + ", segments=" + this.f5587e + ", indexState=" + this.f5588f + "}";
    }
}
