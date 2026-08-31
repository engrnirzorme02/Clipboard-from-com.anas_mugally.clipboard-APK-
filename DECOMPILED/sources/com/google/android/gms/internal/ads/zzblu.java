package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblu extends AbstractC1945a {
    public static final Parcelable.Creator<zzblu> CREATOR = new zzblv();
    public final String zza;
    public final Bundle zzb;

    public zzblu(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8062j(parcel, 2, this.zzb, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
