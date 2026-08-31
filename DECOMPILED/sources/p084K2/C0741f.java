package p084K2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: K2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0741f extends AbstractC1945a {
    public static final Parcelable.Creator<C0741f> CREATOR = new C0742g();

    /* JADX INFO: renamed from: a */
    private final String f2920a;

    /* JADX INFO: renamed from: b */
    private final int f2921b;

    public C0741f(String str, int i7) {
        this.f2920a = str;
        this.f2921b = i7;
    }

    /* JADX INFO: renamed from: T */
    public final int m3501T() {
        return this.f2921b;
    }

    /* JADX INFO: renamed from: U */
    public final String m3502U() {
        return this.f2920a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f2920a, false);
        AbstractC1947c.m8072t(parcel, 2, this.f2921b);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
