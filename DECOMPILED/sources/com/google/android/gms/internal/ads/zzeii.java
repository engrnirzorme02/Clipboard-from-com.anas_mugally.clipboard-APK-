package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7343l;
import p380w2.C7351t;
import p396y2.C7535w;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
final class zzeii implements zzdgp {
    private final Context zza;
    private final zzdpi zzb;
    private final zzfdc zzc;
    private final C7584a zzd;
    private final zzfcj zze;
    private final InterfaceFutureC1673e zzf;
    private final zzcek zzg;
    private final zzbjo zzh;
    private final boolean zzi;
    private final zzecy zzj;
    private final zzdsg zzk;
    private final zzdsm zzl;

    zzeii(Context context, zzdpi zzdpiVar, zzfdc zzfdcVar, C7584a c7584a, zzfcj zzfcjVar, InterfaceFutureC1673e interfaceFutureC1673e, zzcek zzcekVar, zzbjo zzbjoVar, boolean z7, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdpiVar;
        this.zzc = zzfdcVar;
        this.zzd = c7584a;
        this.zze = zzfcjVar;
        this.zzf = interfaceFutureC1673e;
        this.zzg = zzcekVar;
        this.zzh = zzbjoVar;
        this.zzi = z7;
        this.zzj = zzecyVar;
        this.zzk = zzdsgVar;
        this.zzl = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) {
        zzdon zzdonVar = (zzdon) zzgot.zzs(this.zzf);
        try {
            zzfcj zzfcjVar = this.zze;
            final zzcek zzcekVarZza = this.zzg;
            if (zzcekVarZza.zzaB()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbc)).booleanValue()) {
                    zzcekVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbke.zzb(zzcekVarZza, zzdonVar.zzk());
                    final zzdpm zzdpmVar = new zzdpm();
                    zzdpmVar.zza(this.zza, zzcekVarZza.zzE());
                    zzdonVar.zzl().zzi(zzcekVarZza, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzeih
                        @Override // com.google.android.gms.internal.ads.zzcgg
                        public final /* synthetic */ void zza(boolean z8, int i7, String str, String str2) {
                            zzdpmVar.zzb();
                            zzcek zzcekVar = zzcekVarZza;
                            zzcekVar.zzJ();
                            zzcekVar.zzP().zzq();
                        }
                    });
                    zzcekVarZza.zzP().zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzeig
                        @Override // com.google.android.gms.internal.ads.zzcgh
                        public final /* synthetic */ void zza() {
                            zzcekVarZza.zzI();
                        }
                    });
                    zzfco zzfcoVar = zzfcjVar.zzs;
                    zzcekVarZza.zzau(zzfcoVar.zzb, zzfcoVar.zza, null);
                }
            }
            zzcek zzcekVar = zzcekVarZza;
            zzcekVar.zzag(true);
            boolean z8 = this.zzi;
            boolean z9 = false;
            boolean zZzc = z8 ? this.zzh.zzc(false) : false;
            C7351t.m32349g();
            boolean zM17422m = C3431F0.m17422m(this.zza);
            if (z8 && this.zzh.zzd()) {
                z9 = true;
            }
            float fZze = z8 ? this.zzh.zze() : 0.0f;
            zzfcj zzfcjVar2 = this.zze;
            C7343l c7343l = new C7343l(zZzc, zM17422m, z9, fZze, -1, z7, zzfcjVar2.zzO, zzfcjVar2.zzP);
            if (zzcwfVar != null) {
                zzcwfVar.zzb();
            }
            C7351t.m32348f();
            zzdge zzdgeVarZzj = zzdonVar.zzj();
            int i7 = zzfcjVar2.zzQ;
            C7584a c7584a = this.zzd;
            String str = zzfcjVar2.zzB;
            zzfco zzfcoVar2 = zzfcjVar2.zzs;
            C7535w.m33168a(context, new AdOverlayInfoParcel(null, zzdgeVarZzj, null, zzcekVar, i7, c7584a, str, c7343l, zzfcoVar2.zzb, zzfcoVar2.zza, this.zzc.zzg, zzcwfVar, zzfcjVar2.zzb() ? this.zzj : null, zzcekVar.zzn()), true, this.zzl);
        } catch (zzcez e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zze;
    }
}
