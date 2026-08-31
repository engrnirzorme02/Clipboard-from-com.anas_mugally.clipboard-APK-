package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfr extends zzaxz implements zzbft {
    zzbfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() {
        Parcel parcelZzde = zzde(2, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final InterfaceC3772a zzg() {
        Parcel parcelZzde = zzde(4, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzh() {
        Parcel parcelZzde = zzde(5, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzi() {
        Parcel parcelZzde = zzde(6, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final InterfaceC3340f1 zzj() {
        Parcel parcelZzde = zzde(7, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() {
        Parcel parcelZzde = zzde(10, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) {
        throw null;
    }
}
