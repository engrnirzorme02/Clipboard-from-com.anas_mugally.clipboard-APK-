package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpv extends AbstractC1945a {
    public static final Parcelable.Creator<zzfpv> CREATOR = new zzfpw();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    zzfpv(int i7, byte[] bArr, int i8) {
        this.zza = i7;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8063k(parcel, 2, this.zzb, false);
        AbstractC1947c.m8072t(parcel, 3, this.zzc);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public zzfpv(byte[] bArr, int i7) {
        this(1, null, 1);
    }
}
