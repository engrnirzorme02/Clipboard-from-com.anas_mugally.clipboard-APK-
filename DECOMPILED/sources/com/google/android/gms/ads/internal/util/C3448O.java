package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import p388x2.C7403a;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.O */
/* JADX INFO: loaded from: classes.dex */
public final class C3448O extends zzaxz implements InterfaceC3452Q {
    C3448O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final boolean zze(InterfaceC3772a interfaceC3772a, String str, String str2) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzde = zzde(1, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3452Q
    public final boolean zzg(InterfaceC3772a interfaceC3772a, C7403a c7403a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c7403a);
        Parcel parcelZzde = zzde(3, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
