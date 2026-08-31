package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C3431F0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7343l;
import p380w2.C7351t;
import p396y2.C7535w;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
final class zzeft implements zzdgp {
    private final Context zza;
    private final C7584a zzb;
    private final InterfaceFutureC1673e zzc;
    private final zzfcj zzd;
    private final zzcek zze;
    private final zzfdc zzf;
    private final zzbjo zzg;
    private final boolean zzh;
    private final zzecy zzi;
    private final zzdsm zzj;

    zzeft(Context context, C7584a c7584a, InterfaceFutureC1673e interfaceFutureC1673e, zzfcj zzfcjVar, zzcek zzcekVar, zzfdc zzfdcVar, boolean z7, zzbjo zzbjoVar, zzecy zzecyVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = c7584a;
        this.zzc = interfaceFutureC1673e;
        this.zzd = zzfcjVar;
        this.zze = zzcekVar;
        this.zzf = zzfdcVar;
        this.zzg = zzbjoVar;
        this.zzh = z7;
        this.zzi = zzecyVar;
        this.zzj = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) {
        zzdfb zzdfbVar = (zzdfb) zzgot.zzs(this.zzc);
        zzcek zzcekVar = this.zze;
        zzcekVar.zzag(true);
        boolean z8 = this.zzh;
        boolean zZzc = z8 ? this.zzg.zzc(false) : false;
        C7351t.m32349g();
        boolean zM17422m = C3431F0.m17422m(this.zza);
        boolean z9 = z8 && this.zzg.zzd();
        float fZze = z8 ? this.zzg.zze() : 0.0f;
        zzfcj zzfcjVar = this.zzd;
        C7343l c7343l = new C7343l(zZzc, zM17422m, z9, fZze, -1, z7, zzfcjVar.zzO, false);
        if (zzcwfVar != null) {
            zzcwfVar.zzb();
        }
        C7351t.m32348f();
        zzdge zzdgeVarZzj = zzdfbVar.zzj();
        int i7 = zzfcjVar.zzQ;
        C7584a c7584a = this.zzb;
        String str = zzfcjVar.zzB;
        zzfco zzfcoVar = zzfcjVar.zzs;
        C7535w.m33168a(context, new AdOverlayInfoParcel(null, zzdgeVarZzj, null, zzcekVar, i7, c7584a, str, c7343l, zzfcoVar.zzb, zzfcoVar.zza, this.zzf.zzg, zzcwfVar, zzfcjVar.zzb() ? this.zzi : null, zzcekVar.zzn()), true, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzd;
    }
}
