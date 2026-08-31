package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpk extends AbstractC1945a {
    public static final Parcelable.Creator<zzfpk> CREATOR = new zzfpl();
    public final int zza;
    public final String zzb;
    public final String zzc;

    zzfpk(int i7, String str, String str2) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.zzb, false);
        AbstractC1947c.m8044E(parcel, 3, this.zzc, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public zzfpk(String str, String str2) {
        this(1, str, str2);
    }
}
