package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbaa;
import com.google.android.gms.internal.ads.zzbab;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwa;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3351i0 extends zzaxz implements InterfaceC3359k0 {
    C3351i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(2, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbwa zzg(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(3, parcelZza);
        zzbwa zzbwaVarZzt = zzbvz.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbwaVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzh(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(4, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbab zzi(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(5, parcelZza);
        zzbab zzbabVarZzb = zzbaa.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbabVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzj(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(6, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final InterfaceC3312Y zzk(String str) {
        InterfaceC3312Y c3306w;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(7, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3306w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3306w = iInterfaceQueryLocalInterface instanceof InterfaceC3312Y ? (InterfaceC3312Y) iInterfaceQueryLocalInterface : new C3306W(strongBinder);
        }
        parcelZzde.recycle();
        return c3306w;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final void zzl(zzbox zzboxVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzboxVar);
        zzdf(8, parcelZza);
    }
}
