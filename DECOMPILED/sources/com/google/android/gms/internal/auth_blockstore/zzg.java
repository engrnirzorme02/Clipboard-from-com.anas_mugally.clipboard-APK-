package com.google.android.gms.internal.auth_blockstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p149T2.C1461a;
import p149T2.C1462b;
import p149T2.C1464d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends zza implements IInterface {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zza(zzi zziVar, C1461a c1461a) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zziVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, c1461a);
        transactAndReadExceptionReturnVoid(13, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzb(zzk zzkVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzkVar);
        transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzc(zzm zzmVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzmVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    public final void zzd(zzm zzmVar, C1462b c1462b) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzmVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, c1462b);
        transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
    }

    public final void zze(zzo zzoVar, C1464d c1464d) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(parcelObtainAndWriteInterfaceToken, zzoVar);
        zzc.zzb(parcelObtainAndWriteInterfaceToken, c1464d);
        transactAndReadExceptionReturnVoid(10, parcelObtainAndWriteInterfaceToken);
    }
}
