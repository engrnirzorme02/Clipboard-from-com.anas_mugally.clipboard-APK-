package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax extends AbstractC1945a {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    zzax(int i7, String str) {
        this.zza = 1;
        this.zzb = (String) AbstractC3718s.m18083l(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.zza);
        AbstractC1947c.m8044E(parcel, 2, this.zzb, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public zzax(String str) {
        this(1, str);
    }
}
