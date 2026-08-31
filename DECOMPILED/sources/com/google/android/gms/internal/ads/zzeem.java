package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3393s2;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7343l;
import p380w2.C7351t;
import p396y2.C7535w;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
final class zzeem implements zzdgp {
    private final C7584a zza;
    private final InterfaceFutureC1673e zzb;
    private final zzfcj zzc;
    private final zzcek zzd;
    private final zzfdc zze;
    private final zzbjo zzf;
    private final boolean zzg;
    private final zzecy zzh;
    private final zzdsm zzi;

    zzeem(C7584a c7584a, InterfaceFutureC1673e interfaceFutureC1673e, zzfcj zzfcjVar, zzcek zzcekVar, zzfdc zzfdcVar, boolean z7, zzbjo zzbjoVar, zzecy zzecyVar, zzdsm zzdsmVar) {
        this.zza = c7584a;
        this.zzb = interfaceFutureC1673e;
        this.zzc = zzfcjVar;
        this.zzd = zzcekVar;
        this.zze = zzfdcVar;
        this.zzg = z7;
        this.zzf = zzbjoVar;
        this.zzh = zzecyVar;
        this.zzi = zzdsmVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z7, Context context, zzcwf zzcwfVar) {
        zzcnv zzcnvVar = (zzcnv) zzgot.zzs(this.zzb);
        zzcek zzcekVar = this.zzd;
        zzcekVar.zzag(true);
        boolean z8 = this.zzg;
        boolean zZzc = z8 ? this.zzf.zzc(true) : true;
        boolean z9 = z8 && this.zzf.zzd();
        float fZze = z8 ? this.zzf.zze() : 0.0f;
        zzfcj zzfcjVar = this.zzc;
        C7343l c7343l = new C7343l(zZzc, true, z9, fZze, -1, z7, zzfcjVar.zzO, false);
        if (zzcwfVar != null) {
            zzcwfVar.zzb();
        }
        C7351t.m32348f();
        zzdge zzdgeVarZzj = zzcnvVar.zzj();
        int i7 = zzfcjVar.zzQ;
        if (i7 == -1) {
            C3393s2 c3393s2 = this.zze.zzk;
            if (c3393s2 == null) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i9 = c3393s2.f14089a;
                if (i9 == 1) {
                    i7 = 7;
                } else if (i9 == 2) {
                    i7 = 6;
                } else {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        C7584a c7584a = this.zza;
        String str = zzfcjVar.zzB;
        zzfco zzfcoVar = zzfcjVar.zzs;
        C7535w.m33168a(context, new AdOverlayInfoParcel(null, zzdgeVarZzj, null, zzcekVar, i7, c7584a, str, c7343l, zzfcoVar.zzb, zzfcoVar.zza, this.zze.zzg, zzcwfVar, zzfcjVar.zzb() ? this.zzh : null, zzcekVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzc;
    }
}
