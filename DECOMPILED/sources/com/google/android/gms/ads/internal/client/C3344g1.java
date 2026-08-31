package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3344g1 extends zzaxz implements InterfaceC3352i1 {
    C3344g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzf() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzg() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzh() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3352i1
    public final void zzi(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(5, parcelZza);
    }
}
