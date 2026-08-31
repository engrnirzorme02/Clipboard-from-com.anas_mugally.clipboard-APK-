package com.google.android.gms.internal.ads;

import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbom {
    private final zzbnp zza;
    private InterfaceFutureC1673e zzb;

    zzbom(zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzbzm zzbzmVar = new zzbzm();
            this.zzb = zzbzmVar;
            this.zza.zzb(null).zze(new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbol
                @Override // com.google.android.gms.internal.ads.zzbzq
                public final /* synthetic */ void zza(Object obj) {
                    zzbzmVar.zzc((zzbnq) obj);
                }
            }, new zzbzo() { // from class: com.google.android.gms.internal.ads.zzboi
                @Override // com.google.android.gms.internal.ads.zzbzo
                public final /* synthetic */ void zza() {
                    zzbzmVar.zzd(new zzbns("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbop zza(String str, zzbnw zzbnwVar, zzbnv zzbnvVar) {
        zzd();
        return new zzbop(this.zzb, "google.afma.activeView.handleUpdate", zzbnwVar, zzbnvVar);
    }

    public final void zzb(final String str, final zzbjl zzbjlVar) {
        zzd();
        this.zzb = zzgot.zzj(this.zzb, new zzgob() { // from class: com.google.android.gms.internal.ads.zzboj
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                zzbnq zzbnqVar = (zzbnq) obj;
                zzbnqVar.zzm(str, zzbjlVar);
                return zzgot.zza(zzbnqVar);
            }
        }, zzbzh.zzg);
    }

    public final void zzc(final String str, final zzbjl zzbjlVar) {
        this.zzb = zzgot.zzk(this.zzb, new zzggr() { // from class: com.google.android.gms.internal.ads.zzbok
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzbnq zzbnqVar = (zzbnq) obj;
                zzbnqVar.zzn(str, zzbjlVar);
                return zzbnqVar;
            }
        }, zzbzh.zzg);
    }
}
