package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblw extends AbstractC1945a {
    public static final Parcelable.Creator<zzblw> CREATOR = new zzblx();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzblw(int i7, int i8, String str, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = str;
        this.zzd = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zzb;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.zzc, false);
        AbstractC1947c.m8072t(parcel, 3, this.zzd);
        AbstractC1947c.m8072t(parcel, zzbbn.zzq.zzf, this.zza);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
