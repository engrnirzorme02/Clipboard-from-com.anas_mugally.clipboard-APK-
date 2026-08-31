package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzeic extends zzejd {
    private final zzdei zza;

    public zzeic(zzcvq zzcvqVar, zzddx zzddxVar, zzcwk zzcwkVar, zzcwz zzcwzVar, zzcxe zzcxeVar, zzcwf zzcwfVar, zzdaw zzdawVar, zzdev zzdevVar, zzcyd zzcydVar, zzdei zzdeiVar, zzdas zzdasVar) {
        super(zzcvqVar, zzddxVar, zzcwkVar, zzcwzVar, zzcxeVar, zzdawVar, zzcydVar, zzdevVar, zzdasVar, zzcwfVar);
        this.zza = zzdeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzp(zzbvt zzbvtVar) {
        this.zza.zzb(zzbvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzr(zzbvx zzbvxVar) {
        this.zza.zzb(new zzbvt(zzbvxVar.zze(), zzbvxVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzt() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzejd, com.google.android.gms.internal.ads.zzbpd
    public final void zzz() {
        this.zza.zzb(null);
    }
}
