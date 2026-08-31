package p144S4;

import p158U4.C1687k;
import p186Y4.AbstractC2032B;

/* JADX INFO: renamed from: S4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1420e implements Comparable {
    /* JADX INFO: renamed from: d */
    public static AbstractC1420e m6034d(int i7, C1687k c1687k, byte[] bArr, byte[] bArr2) {
        return new C1416a(i7, c1687k, bArr, bArr2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1420e abstractC1420e) {
        int iCompare = Integer.compare(mo6014m(), abstractC1420e.mo6014m());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = mo6013k().compareTo(abstractC1420e.mo6013k());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iM8443h = AbstractC2032B.m8443h(mo6011h(), abstractC1420e.mo6011h());
        return iM8443h != 0 ? iM8443h : AbstractC2032B.m8443h(mo6012j(), abstractC1420e.mo6012j());
    }

    /* JADX INFO: renamed from: h */
    public abstract byte[] mo6011h();

    /* JADX INFO: renamed from: j */
    public abstract byte[] mo6012j();

    /* JADX INFO: renamed from: k */
    public abstract C1687k mo6013k();

    /* JADX INFO: renamed from: m */
    public abstract int mo6014m();
}
