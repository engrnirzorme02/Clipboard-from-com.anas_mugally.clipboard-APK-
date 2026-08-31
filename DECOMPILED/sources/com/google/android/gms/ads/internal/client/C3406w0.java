package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbox;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3406w0 extends zzaxz implements InterfaceC3412y0 {
    C3406w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3412y0
    public final zzbox getAdapterCreator() {
        Parcel parcelZzde = zzde(2, zza());
        zzbox zzboxVarZzf = zzbow.zzf(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzboxVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3412y0
    public final C3249C1 getLiteSdkVersion() {
        Parcel parcelZzde = zzde(1, zza());
        C3249C1 c3249c1 = (C3249C1) zzayb.zzb(parcelZzde, C3249C1.CREATOR);
        parcelZzde.recycle();
        return c3249c1;
    }
}
