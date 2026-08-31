package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.C3974m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zzb((C3974m) zzc.zzb(parcel, C3974m.CREATOR));
        return true;
    }
}
