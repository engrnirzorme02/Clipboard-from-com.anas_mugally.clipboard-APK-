package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblr;
import com.google.android.gms.internal.ads.zzbox;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3415z0 extends zzaxz implements InterfaceC3248C0 {
    C3415z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzj(String str, InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final float zzk() {
        Parcel parcelZzde = zzde(7, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final boolean zzl() {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzo(zzbox zzboxVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzboxVar);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzp(zzblr zzblrVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzblrVar);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final List zzq() {
        Parcel parcelZzde = zzde(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(zzblk.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzr(C3302U1 c3302u1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3302u1);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3248C0
    public final void zzv(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(18, parcelZza);
    }
}
