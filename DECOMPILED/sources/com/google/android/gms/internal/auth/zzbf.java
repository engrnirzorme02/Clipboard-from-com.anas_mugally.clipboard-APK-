package com.google.android.gms.internal.auth;

import android.os.Parcel;
import p128Q2.C1256c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C1256c c1256c = (C1256c) zzc.zza(parcel, C1256c.CREATOR);
            zzc.zzb(parcel);
            zzb(c1256c);
        } else {
            if (i7 != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.zzb(parcel);
            zzc(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
