package p149T2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: T2.d */
/* JADX INFO: loaded from: classes.dex */
public class C1464d extends AbstractC1945a {
    public static final Parcelable.Creator<C1464d> CREATOR = new C1469i();

    /* JADX INFO: renamed from: a */
    private final byte[] f5008a;

    /* JADX INFO: renamed from: b */
    private final boolean f5009b;

    /* JADX INFO: renamed from: c */
    private final String f5010c;

    C1464d(byte[] bArr, boolean z7, String str) {
        this.f5008a = bArr;
        this.f5009b = z7;
        this.f5010c = str;
    }

    /* JADX INFO: renamed from: T */
    public byte[] m6128T() {
        return this.f5008a;
    }

    /* JADX INFO: renamed from: U */
    public String m6129U() {
        return this.f5010c;
    }

    /* JADX INFO: renamed from: V */
    public boolean m6130V() {
        return this.f5009b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8063k(parcel, 1, m6128T(), false);
        AbstractC1947c.m8059g(parcel, 2, m6130V());
        AbstractC1947c.m8044E(parcel, 3, m6129U(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
