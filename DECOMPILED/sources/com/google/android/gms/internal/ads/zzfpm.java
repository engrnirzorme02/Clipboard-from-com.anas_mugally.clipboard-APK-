package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpm extends AbstractC1945a {
    public static final Parcelable.Creator<zzfpm> CREATOR = new zzfpn();
    public final int zza;
    private zzast zzb = null;
    private byte[] zzc;

    zzfpm(int i7, byte[] bArr) {
        this.zza = i7;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzast zzastVar = this.zzb;
        if (zzastVar != null || this.zzc == null) {
            if (zzastVar == null || this.zzc != null) {
                if (zzastVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzastVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        byte[] bArrZzaN = this.zzc;
        if (bArrZzaN == null) {
            bArrZzaN = this.zzb.zzaN();
        }
        AbstractC1947c.m8063k(parcel, 2, bArrZzaN, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final zzast zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzast.zzh(this.zzc, zzhhr.zza());
                this.zzc = null;
            } catch (zzhiw | NullPointerException e7) {
                throw new IllegalStateException(e7);
            }
        }
        zzb();
        return this.zzb;
    }
}
