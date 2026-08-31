package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzciz implements zzdgg {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;
    private zzejp zzf;

    /* synthetic */ zzciz(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zza */
    public final zzdgh zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        zzhqf.zzc(this.zzf, zzejp.class);
        return new zzcja(this.zza, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, zzehv.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* synthetic */ zzdgg zzb(zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* synthetic */ zzdgg zzc(zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zzd(zzejp zzejpVar) {
        this.zzf = zzejpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zze(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zzf(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }
}
