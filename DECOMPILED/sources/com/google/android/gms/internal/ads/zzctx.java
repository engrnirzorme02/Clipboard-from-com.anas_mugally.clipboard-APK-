package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import p036E2.C0318M;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctx implements zzcyy, zzdel {
    private final Context zza;
    private final zzfdc zzb;
    private final C7584a zzc;
    private final InterfaceC3494q0 zzd;
    private final zzdux zze;
    private final zzfie zzf;
    private final zzdvs zzg;

    public zzctx(Context context, zzfdc zzfdcVar, C7584a c7584a, InterfaceC3494q0 interfaceC3494q0, zzdux zzduxVar, zzfie zzfieVar, zzdvs zzdvsVar) {
        this.zza = context;
        this.zzb = zzfdcVar;
        this.zzc = c7584a;
        this.zzd = interfaceC3494q0;
        this.zze = zzduxVar;
        this.zzf = zzfieVar;
        this.zzg = zzdvsVar;
    }

    private final void zzc() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzew)).booleanValue()) {
            InterfaceC3494q0 interfaceC3494q0 = this.zzd;
            Context context = this.zza;
            C7584a c7584a = this.zzc;
            zzfdc zzfdcVar = this.zzb;
            zzfie zzfieVar = this.zzf;
            zzdvs zzdvsVar = this.zzg;
            C7351t.m32358p().m32312b(context, c7584a, zzfdcVar.zzg, interfaceC3494q0.zzi(), zzfieVar, zzdvsVar.zzs());
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(C0318M c0318m) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzex)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
    }
}
