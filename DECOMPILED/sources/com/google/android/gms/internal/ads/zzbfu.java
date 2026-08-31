package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfu extends zzaxz implements zzbfw {
    zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final InterfaceC3772a zzb() {
        Parcel parcelZzde = zzde(1, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zzc() {
        Parcel parcelZzde = zzde(2, zza());
        Uri uri = (Uri) zzayb.zzb(parcelZzde, Uri.CREATOR);
        parcelZzde.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzd() {
        Parcel parcelZzde = zzde(3, zza());
        double d7 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zze() {
        Parcel parcelZzde = zzde(4, zza());
        int i7 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzf() {
        Parcel parcelZzde = zzde(5, zza());
        int i7 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Map zzg() {
        Parcel parcelZzde = zzde(6, zza());
        HashMap mapZzg = zzayb.zzg(parcelZzde);
        parcelZzde.recycle();
        return mapZzg;
    }
}
