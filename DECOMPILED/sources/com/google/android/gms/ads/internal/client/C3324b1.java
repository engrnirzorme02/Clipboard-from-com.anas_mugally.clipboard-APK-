package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p314o2.C6550b;
import p314o2.C6561m;
import p314o2.C6571w;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3324b1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3324b1> CREATOR = new C3416z1();

    /* JADX INFO: renamed from: a */
    public final int f13918a;

    /* JADX INFO: renamed from: b */
    public final String f13919b;

    /* JADX INFO: renamed from: c */
    public final String f13920c;

    /* JADX INFO: renamed from: d */
    public C3324b1 f13921d;

    /* JADX INFO: renamed from: e */
    public IBinder f13922e;

    public C3324b1(int i7, String str, String str2, C3324b1 c3324b1, IBinder iBinder) {
        this.f13918a = i7;
        this.f13919b = str;
        this.f13920c = str2;
        this.f13921d = c3324b1;
        this.f13922e = iBinder;
    }

    /* JADX INFO: renamed from: T */
    public final C6550b m17220T() {
        C6550b c6550b;
        C3324b1 c3324b1 = this.f13921d;
        if (c3324b1 == null) {
            c6550b = null;
        } else {
            String str = c3324b1.f13920c;
            c6550b = new C6550b(c3324b1.f13918a, c3324b1.f13919b, str);
        }
        return new C6550b(this.f13918a, this.f13919b, this.f13920c, c6550b);
    }

    /* JADX INFO: renamed from: U */
    public final C6561m m17221U() {
        C6550b c6550b;
        C3324b1 c3324b1 = this.f13921d;
        InterfaceC3328c1 c3316z0 = null;
        if (c3324b1 == null) {
            c6550b = null;
        } else {
            c6550b = new C6550b(c3324b1.f13918a, c3324b1.f13919b, c3324b1.f13920c);
        }
        int i7 = this.f13918a;
        String str = this.f13919b;
        String str2 = this.f13920c;
        IBinder iBinder = this.f13922e;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c3316z0 = iInterfaceQueryLocalInterface instanceof InterfaceC3328c1 ? (InterfaceC3328c1) iInterfaceQueryLocalInterface : new C3316Z0(iBinder);
        }
        return new C6561m(i7, str, str2, c6550b, C6571w.m27861e(c3316z0));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f13918a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.f13919b, false);
        AbstractC1947c.m8044E(parcel, 3, this.f13920c, false);
        AbstractC1947c.m8042C(parcel, 4, this.f13921d, i7, false);
        AbstractC1947c.m8071s(parcel, 5, this.f13922e, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
