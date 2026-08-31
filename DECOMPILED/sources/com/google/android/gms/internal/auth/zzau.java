package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzau extends zza implements IInterface {
    zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zzd(zzat zzatVar, zzaq zzaqVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzaqVar);
        zzc(7, parcelZza);
    }

    public final void zze(zzat zzatVar, zzbb zzbbVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzbbVar);
        zzc(8, parcelZza);
    }

    public final void zzf(zzat zzatVar, zzav zzavVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzavVar);
        zzc(9, parcelZza);
    }

    public final void zzg(zzat zzatVar, zzax zzaxVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzaxVar);
        zzc(6, parcelZza);
    }

    public final void zzh(zzat zzatVar, zzaz zzazVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzatVar);
        zzc.zzc(parcelZza, zzazVar);
        zzc(5, parcelZza);
    }
}
