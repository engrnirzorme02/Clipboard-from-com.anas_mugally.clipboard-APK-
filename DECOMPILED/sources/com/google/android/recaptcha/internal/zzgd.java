package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgd {
    public zzbn zza;
    private final zzgf zzb;
    private int zzd;
    private final zzge zze;
    private final zzfw zzg;
    private final zzcg zzh;
    private String zzc = "recaptcha.m.Main.rge";
    private final zzbn zzf = new zzbn();

    public zzgd(zzgf zzgfVar) {
        this.zzb = zzgfVar;
        this.zze = zzgfVar.zza();
        this.zzg = zzgfVar.zzd();
        this.zzh = zzgfVar.zzc();
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzbn zzb() {
        return this.zzf;
    }

    public final zzge zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze() {
        this.zzb.zzb();
    }

    public final void zzf(String str) {
        this.zzc = str;
    }

    public final void zzg(int i7) {
        this.zzd = i7;
    }

    public final zzcg zzh() {
        return this.zzh;
    }

    public final zzfw zzi() {
        return this.zzg;
    }
}
