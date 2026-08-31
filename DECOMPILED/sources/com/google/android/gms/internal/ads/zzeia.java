package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeia implements zzeef {
    private final Context zza;
    private final zzdor zzb;

    public zzeia(Context context, zzdor zzdorVar) {
        this.zza = context;
        this.zzb = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        try {
            zzbqw zzbqwVar = (zzbqw) zzeecVar.zzb;
            zzbqwVar.zzo(zzfcjVar.zzZ);
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzp.zza == 3) {
                zzbqwVar.zzp(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfdcVar.zzd, BinderC3773b.m18221N0(this.zza), new zzehz(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
            } else {
                zzbqwVar.zzl(zzfcjVar.zzU, zzfcjVar.zzv.toString(), zzfdcVar.zzd, BinderC3773b.m18221N0(this.zza), new zzehz(this, zzeecVar, null), (zzbpd) zzeecVar.zzc);
            }
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Remote exception loading a rewarded RTB ad", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) {
        zzefx zzefxVar = new zzefx(zzfcjVar, (zzbqw) zzeecVar.zzb, EnumC6551c.REWARDED);
        zzdon zzdonVarZzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdoo(zzefxVar));
        zzefxVar.zzc(zzdonVarZzf.zzd());
        ((zzefo) zzeecVar.zzc).zzc(zzdonVarZzf.zzn());
        return zzdonVarZzf.zzh();
    }
}
