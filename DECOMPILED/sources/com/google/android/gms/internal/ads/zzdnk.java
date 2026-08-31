package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdnk implements zzbjl {
    private final zzbha zza;
    private final zzdnx zzb;
    private final zzhpr zzc;

    public zzdnk(zzdje zzdjeVar, zzdiu zzdiuVar, zzdnx zzdnxVar, zzhpr zzhprVar) {
        this.zza = zzdjeVar.zzg(zzdiuVar.zzS());
        this.zzb = zzdnxVar;
        this.zzc = zzhprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgq) this.zzc.zzb(), str);
        } catch (RemoteException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String string = sb.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g(string, e7);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
