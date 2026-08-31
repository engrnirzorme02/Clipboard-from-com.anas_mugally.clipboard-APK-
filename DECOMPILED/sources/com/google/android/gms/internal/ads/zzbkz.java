package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkz extends AbstractC1945a {
    public static final Parcelable.Creator<zzbkz> CREATOR = new zzbla();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    zzbkz(boolean z7, String str, int i7, byte[] bArr, String[] strArr, String[] strArr2, boolean z8, long j7) {
        this.zza = z7;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z8;
        this.zzh = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 1, z7);
        AbstractC1947c.m8044E(parcel, 2, this.zzb, false);
        AbstractC1947c.m8072t(parcel, 3, this.zzc);
        AbstractC1947c.m8063k(parcel, 4, this.zzd, false);
        AbstractC1947c.m8045F(parcel, 5, this.zze, false);
        AbstractC1947c.m8045F(parcel, 6, this.zzf, false);
        AbstractC1947c.m8059g(parcel, 7, this.zzg);
        AbstractC1947c.m8076x(parcel, 8, this.zzh);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
