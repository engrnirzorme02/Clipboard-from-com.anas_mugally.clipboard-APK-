package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3367m0 extends zzaxz implements InterfaceC3375o0 {
    C3367m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3375o0
    public final void zzb(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(1, parcelZza);
    }
}
