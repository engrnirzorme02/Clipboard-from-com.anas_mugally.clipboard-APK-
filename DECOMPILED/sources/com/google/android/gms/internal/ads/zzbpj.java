package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpj extends zzaxz implements IInterface {
    zzbpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final List zzf() {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    public final String zzg() {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final zzbfw zzh() {
        Parcel parcelZzde = zzde(5, zza());
        zzbfw zzbfwVarZzh = zzbfv.zzh(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfwVarZzh;
    }

    public final String zzi() {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final String zzj() {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final void zzk() {
        zzdf(8, zza());
    }

    public final void zzl(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(9, parcelZza);
    }

    public final void zzm(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(10, parcelZza);
    }

    public final boolean zzn() {
        Parcel parcelZzde = zzde(11, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final boolean zzo() {
        Parcel parcelZzde = zzde(12, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final Bundle zzp() {
        Parcel parcelZzde = zzde(13, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    public final void zzq(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(14, parcelZza);
    }

    public final InterfaceC3772a zzr() {
        Parcel parcelZzde = zzde(15, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    public final InterfaceC3340f1 zzs() {
        Parcel parcelZzde = zzde(16, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    public final zzbfp zzt() {
        Parcel parcelZzde = zzde(19, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfpVarZzj;
    }

    public final InterfaceC3772a zzu() {
        Parcel parcelZzde = zzde(20, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    public final InterfaceC3772a zzv() {
        Parcel parcelZzde = zzde(21, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    public final void zzw(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, interfaceC3772a2);
        zzayb.zze(parcelZza, interfaceC3772a3);
        zzdf(22, parcelZza);
    }
}
