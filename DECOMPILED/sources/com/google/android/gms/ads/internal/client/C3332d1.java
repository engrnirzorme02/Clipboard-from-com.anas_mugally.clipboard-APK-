package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3332d1 extends zzaxz implements InterfaceC3340f1 {
    C3332d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzj() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzk() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final void zzl(InterfaceC3352i1 interfaceC3352i1) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3352i1);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final float zzm() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3340f1
    public final InterfaceC3352i1 zzo() {
        InterfaceC3352i1 c3344g1;
        Parcel parcelZzde = zzde(11, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3344g1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c3344g1 = iInterfaceQueryLocalInterface instanceof InterfaceC3352i1 ? (InterfaceC3352i1) iInterfaceQueryLocalInterface : new C3344g1(strongBinder);
        }
        parcelZzde.recycle();
        return c3344g1;
    }
}
