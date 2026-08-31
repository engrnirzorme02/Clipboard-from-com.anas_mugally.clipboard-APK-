package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblk extends AbstractC1945a {
    public static final Parcelable.Creator<zzblk> CREATOR = new zzbll();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzblk(String str, boolean z7, int i7, String str2) {
        this.zza = str;
        this.zzb = z7;
        this.zzc = i7;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8059g(parcel, 2, this.zzb);
        AbstractC1947c.m8072t(parcel, 3, this.zzc);
        AbstractC1947c.m8044E(parcel, 4, this.zzd, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
