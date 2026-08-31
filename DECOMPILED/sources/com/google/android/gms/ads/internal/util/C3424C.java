package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.internal.ads.zzfee;
import com.google.android.gms.internal.ads.zzghs;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.C */
/* JADX INFO: loaded from: classes.dex */
public final class C3424C extends AbstractC1945a {
    public static final Parcelable.Creator<C3424C> CREATOR = new C3426D();

    /* JADX INFO: renamed from: a */
    public final String f14173a;

    /* JADX INFO: renamed from: b */
    public final int f14174b;

    C3424C(String str, int i7) {
        this.f14173a = str == null ? "" : str;
        this.f14174b = i7;
    }

    /* JADX INFO: renamed from: T */
    public static C3424C m17380T(Throwable th) {
        C3324b1 c3324b1Zza = zzfee.zza(th);
        return new C3424C(zzghs.zzc(th.getMessage()) ? c3324b1Zza.f13919b : th.getMessage(), c3324b1Zza.f13918a);
    }

    /* JADX INFO: renamed from: U */
    public final C3420A m17381U() {
        return new C3420A(this.f14173a, this.f14174b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14173a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8072t(parcel, 2, this.f14174b);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
