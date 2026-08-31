package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends AbstractC1945a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdd(long j7, long j8, boolean z7, Bundle bundle, String str) {
        this.zza = j7;
        this.zzb = j8;
        this.zzc = z7;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8076x(parcel, 1, j7);
        AbstractC1947c.m8076x(parcel, 2, this.zzb);
        AbstractC1947c.m8059g(parcel, 3, this.zzc);
        AbstractC1947c.m8062j(parcel, 7, this.zzd, false);
        AbstractC1947c.m8044E(parcel, 8, this.zze, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
