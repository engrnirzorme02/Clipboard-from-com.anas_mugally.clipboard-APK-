package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i7 == 2) {
            zzc(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i7 != 3) {
                return false;
            }
            zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
