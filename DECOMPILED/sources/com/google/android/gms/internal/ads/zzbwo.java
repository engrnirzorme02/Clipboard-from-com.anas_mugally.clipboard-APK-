package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p068I2.AbstractC0610e;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwo extends AbstractC1945a {
    public static final Parcelable.Creator<zzbwo> CREATOR = new zzbwp();
    public final String zza;
    public final String zzb;

    public zzbwo(AbstractC0610e abstractC0610e) {
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8044E(parcel, 2, this.zzb, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public zzbwo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
