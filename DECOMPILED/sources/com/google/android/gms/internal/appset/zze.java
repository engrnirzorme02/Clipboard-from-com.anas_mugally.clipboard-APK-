package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p084K2.C0741f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (C0741f) zzc.zza(parcel, C0741f.CREATOR));
        return true;
    }
}
