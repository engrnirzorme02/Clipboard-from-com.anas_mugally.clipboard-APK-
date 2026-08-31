package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3316Z0 extends zzaxz implements InterfaceC3328c1 {
    C3316Z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zze() {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zzf() {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final List zzg() {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(C3385q2.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final C3385q2 zzh() {
        Parcel parcelZzde = zzde(4, zza());
        C3385q2 c3385q2 = (C3385q2) zzayb.zzb(parcelZzde, C3385q2.CREATOR);
        parcelZzde.recycle();
        return c3385q2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final Bundle zzi() {
        Parcel parcelZzde = zzde(5, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zzj() {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }
}
