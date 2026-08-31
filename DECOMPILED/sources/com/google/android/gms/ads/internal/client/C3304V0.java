package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3304V0 extends zzaxz implements InterfaceC3310X0 {
    C3304V0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3310X0
    public final void zze(String str, InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, interfaceC3772a2);
        zzdf(1, parcelZza);
    }
}
