package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3295S0 extends zzaxz implements InterfaceC3301U0 {
    C3295S0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3301U0
    /* JADX INFO: renamed from: j0 */
    public final void mo17215j0(C3377o2 c3377o2) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3377o2);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3301U0
    public final boolean zzf() {
        Parcel parcelZzde = zzde(2, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
