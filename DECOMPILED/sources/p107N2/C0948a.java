package p107N2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: N2.a */
/* JADX INFO: loaded from: classes.dex */
public class C0948a extends AbstractC1945a {
    public static final Parcelable.Creator<C0948a> CREATOR = new C0958k();

    /* JADX INFO: renamed from: a */
    final int f3660a;

    /* JADX INFO: renamed from: b */
    private final boolean f3661b;

    /* JADX INFO: renamed from: c */
    private final long f3662c;

    /* JADX INFO: renamed from: d */
    private final boolean f3663d;

    C0948a(int i7, boolean z7, long j7, boolean z8) {
        this.f3660a = i7;
        this.f3661b = z7;
        this.f3662c = j7;
        this.f3663d = z8;
    }

    /* JADX INFO: renamed from: T */
    public long m4206T() {
        return this.f3662c;
    }

    /* JADX INFO: renamed from: U */
    public boolean m4207U() {
        return this.f3663d;
    }

    /* JADX INFO: renamed from: V */
    public boolean m4208V() {
        return this.f3661b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f3660a);
        AbstractC1947c.m8059g(parcel, 2, m4208V());
        AbstractC1947c.m8076x(parcel, 3, m4206T());
        AbstractC1947c.m8059g(parcel, 4, m4207U());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
