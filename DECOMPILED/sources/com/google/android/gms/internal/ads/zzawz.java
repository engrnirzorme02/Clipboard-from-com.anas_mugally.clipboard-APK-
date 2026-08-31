package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawz extends zzaxl {
    public zzawz(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8) {
        super(zzavxVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", zzarwVar, i7, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        Boolean bool = (Boolean) C3250D.m17200c().zzd(zzbci.zzdm);
        bool.booleanValue();
        zzavd zzavdVar = new zzavd((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzc(zzavdVar.zza);
            zzarwVar.zzP(zzavdVar.zzb);
        }
    }
}
