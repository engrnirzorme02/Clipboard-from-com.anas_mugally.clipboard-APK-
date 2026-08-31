package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
        } else {
            if (i7 != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
