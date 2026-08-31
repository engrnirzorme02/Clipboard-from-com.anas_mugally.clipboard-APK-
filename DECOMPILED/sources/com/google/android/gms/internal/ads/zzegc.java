package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegc implements zzeef {
    private final Context zza;
    private final zzdgh zzb;

    public zzegc(Context context, zzdgh zzdghVar) {
        this.zza = context;
        this.zzb = zzdghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            zzbqwVar.zzj(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfcuVar.zza.zza.zzd, BinderC3773b.m18221N0(this.zza), new zzegb(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Remote exception loading a interstitial RTB ad", e7);
            throw new zzfdj(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        zzefx zzefxVar = new zzefx(zzfcjVar, (zzbqw) zzeecVar.zzb, EnumC6551c.INTERSTITIAL);
        zzdfb zzdfbVarZzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(zzefxVar, null));
        zzefxVar.zzc(zzdfbVarZzd.zzd());
        ((zzefo) zzeecVar.zzc).zzc(zzdfbVarZzd.zzg());
        return zzdfbVarZzd.zzh();
    }
}
