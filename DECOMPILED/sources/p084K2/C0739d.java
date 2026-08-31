package p084K2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: K2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0739d extends AbstractC1945a {
    public static final Parcelable.Creator<C0739d> CREATOR = new C0740e();

    /* JADX INFO: renamed from: a */
    private final String f2918a;

    /* JADX INFO: renamed from: b */
    private final String f2919b;

    public C0739d(String str, String str2) {
        this.f2918a = str;
        this.f2919b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f2918a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f2919b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
