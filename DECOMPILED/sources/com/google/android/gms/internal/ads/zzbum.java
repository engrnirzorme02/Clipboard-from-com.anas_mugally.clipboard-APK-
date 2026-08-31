package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C3424C;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbum extends zzaya implements zzbun {
    public zzbum() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayb.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzayb.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i7 == 2) {
            C3424C c3424c = (C3424C) zzayb.zzb(parcel, C3424C.CREATOR);
            zzayb.zzh(parcel);
            zzf(c3424c);
        } else {
            if (i7 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzayb.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbuv zzbuvVar = (zzbuv) zzayb.zzb(parcel, zzbuv.CREATOR);
            zzayb.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbuvVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
