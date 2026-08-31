package p199a3;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: a3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2199d extends AbstractC1945a {
    public static final Parcelable.Creator<C2199d> CREATOR = new C2201f();

    /* JADX INFO: renamed from: a */
    final int f7130a;

    /* JADX INFO: renamed from: b */
    final String f7131b;

    /* JADX INFO: renamed from: c */
    final int f7132c;

    C2199d(int i7, String str, int i8) {
        this.f7130a = i7;
        this.f7131b = str;
        this.f7132c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f7130a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.f7131b, false);
        AbstractC1947c.m8072t(parcel, 3, this.f7132c);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C2199d(String str, int i7) {
        this.f7130a = 1;
        this.f7131b = str;
        this.f7132c = i7;
    }
}
