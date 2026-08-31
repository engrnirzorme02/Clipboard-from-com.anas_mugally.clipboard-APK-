package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhk;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.S */
/* JADX INFO: loaded from: classes.dex */
public final class C3294S extends zzaxz implements InterfaceC3300U {
    C3294S(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final InterfaceC3289Q zze() {
        InterfaceC3289Q c3283o;
        Parcel parcelZzde = zzde(1, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3283o = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c3283o = iInterfaceQueryLocalInterface instanceof InterfaceC3289Q ? (InterfaceC3289Q) iInterfaceQueryLocalInterface : new C3283O(strongBinder);
        }
        parcelZzde.recycle();
        return c3283o;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzf(InterfaceC3271K interfaceC3271K) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3271K);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzi(String str, zzbhd zzbhdVar, zzbha zzbhaVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbhdVar);
        zzayb.zze(parcelZza, zzbhaVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzj(zzbfl zzbflVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbflVar);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3300U
    public final void zzm(zzbhk zzbhkVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbhkVar);
        zzdf(10, parcelZza);
    }
}
