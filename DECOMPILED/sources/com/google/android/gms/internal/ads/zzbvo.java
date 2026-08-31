package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3349h2;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvo extends AbstractC1945a {
    public static final Parcelable.Creator<zzbvo> CREATOR = new zzbvp();
    public final C3349h2 zza;
    public final String zzb;

    public zzbvo(C3349h2 c3349h2, String str) {
        this.zza = c3349h2;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        C3349h2 c3349h2 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 2, c3349h2, i7, false);
        AbstractC1947c.m8044E(parcel, 3, this.zzb, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
