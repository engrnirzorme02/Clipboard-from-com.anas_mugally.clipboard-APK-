package p170W2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: W2.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1828E extends AbstractC1945a {
    public static final Parcelable.Creator<C1828E> CREATOR = new C1829F();

    /* JADX INFO: renamed from: a */
    private final boolean f5956a;

    /* JADX INFO: renamed from: b */
    private final String f5957b;

    /* JADX INFO: renamed from: c */
    private final int f5958c;

    /* JADX INFO: renamed from: d */
    private final int f5959d;

    C1828E(boolean z7, String str, int i7, int i8) {
        this.f5956a = z7;
        this.f5957b = str;
        this.f5958c = AbstractC1835L.m7593a(i7) - 1;
        this.f5959d = AbstractC1853r.m7650a(i8) - 1;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m7583T() {
        return this.f5956a;
    }

    /* JADX INFO: renamed from: U */
    public final int m7584U() {
        return AbstractC1853r.m7650a(this.f5959d);
    }

    /* JADX INFO: renamed from: V */
    public final int m7585V() {
        return AbstractC1835L.m7593a(this.f5958c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, this.f5956a);
        AbstractC1947c.m8044E(parcel, 2, this.f5957b, false);
        AbstractC1947c.m8072t(parcel, 3, this.f5958c);
        AbstractC1947c.m8072t(parcel, 4, this.f5959d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zza() {
        return this.f5957b;
    }
}
