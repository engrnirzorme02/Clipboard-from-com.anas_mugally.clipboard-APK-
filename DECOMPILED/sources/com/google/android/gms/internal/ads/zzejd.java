package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public class zzejd extends zzbpc {
    private final zzcvq zza;
    private final zzddx zzb;
    private final zzcwk zzc;
    private final zzcwz zzd;
    private final zzcxe zze;
    private final zzdaw zzf;
    private final zzcyd zzg;
    private final zzdev zzh;
    private final zzdas zzi;
    private final zzcwf zzj;

    public zzejd(zzcvq zzcvqVar, zzddx zzddxVar, zzcwk zzcwkVar, zzcwz zzcwzVar, zzcxe zzcxeVar, zzdaw zzdawVar, zzcyd zzcydVar, zzdev zzdevVar, zzdas zzdasVar, zzcwf zzcwfVar) {
        this.zza = zzcvqVar;
        this.zzb = zzddxVar;
        this.zzc = zzcwkVar;
        this.zzd = zzcwzVar;
        this.zze = zzcxeVar;
        this.zzf = zzdawVar;
        this.zzg = zzcydVar;
        this.zzh = zzdevVar;
        this.zzi = zzdasVar;
        this.zzj = zzcwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdz();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() {
        this.zzg.zzdY(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzm(zzbgq zzbgqVar, String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(zzbvt zzbvtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    @Deprecated
    public final void zzs(int i7) {
        zzy(new C3324b1(i7, "", "undefined", null, null));
    }

    public void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzu() {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzv(String str) {
        zzy(new C3324b1(0, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(int i7, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx(C3324b1 c3324b1) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(C3324b1 c3324b1) {
        this.zzj.zzc(zzfee.zzc(8, c3324b1));
    }

    public void zzz() {
    }
}
