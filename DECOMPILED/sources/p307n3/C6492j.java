package p307n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3673Q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: n3.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C6492j extends AbstractC1945a {
    public static final Parcelable.Creator<C6492j> CREATOR = new C6493k();

    /* JADX INFO: renamed from: a */
    final int f24553a;

    /* JADX INFO: renamed from: b */
    final C3673Q f24554b;

    C6492j(int i7, C3673Q c3673q) {
        this.f24553a = i7;
        this.f24554b = c3673q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f24553a);
        AbstractC1947c.m8042C(parcel, 2, this.f24554b, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
