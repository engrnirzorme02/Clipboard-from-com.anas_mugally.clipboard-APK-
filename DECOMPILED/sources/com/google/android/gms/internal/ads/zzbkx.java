package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbkx extends AbstractC1945a {
    public static final Parcelable.Creator<zzbkx> CREATOR = new zzbky();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    zzbkx(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8045F(parcel, 2, this.zzb, false);
        AbstractC1947c.m8045F(parcel, 3, this.zzc, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
