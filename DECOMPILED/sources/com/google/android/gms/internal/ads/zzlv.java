package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzlv extends zze implements zzik {
    private final zzjs zzb;
    private final zzde zzc;

    zzlv(zzii zziiVar) {
        zzde zzdeVar = new zzde(zzdb.zza);
        this.zzc = zzdeVar;
        try {
            this.zzb = new zzjs(zziiVar, this);
            zzdeVar.zza();
        } catch (Throwable th) {
            this.zzc.zza();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzA(Surface surface) {
        this.zzc.zzd();
        this.zzb.zzA(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzB(zzmg zzmgVar) {
        this.zzc.zzd();
        this.zzb.zzB(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzC(zzmg zzmgVar) {
        this.zzc.zzd();
        this.zzb.zzC(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final int zzD() {
        this.zzc.zzd();
        this.zzb.zzD();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzE(zzur zzurVar) {
        this.zzc.zzd();
        this.zzb.zzE(zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzik
    public final void zzF() {
        this.zzc.zzd();
        this.zzb.zzF();
    }

    public final zzhz zzG() {
        this.zzc.zzd();
        return this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zze
    protected final void zzb(int i7, long j7, int i8, boolean z7) {
        this.zzc.zzd();
        this.zzb.zzb(i7, j7, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final Looper zzc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzd(zzay zzayVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zze(zzay zzayVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzf() {
        this.zzc.zzd();
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzg() {
        this.zzc.zzd();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzh() {
        this.zzc.zzd();
        return this.zzb.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzi(boolean z7) {
        this.zzc.zzd();
        this.zzb.zzi(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzj() {
        this.zzc.zzd();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzk() {
        this.zzc.zzd();
        this.zzb.zzk();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzl() {
        this.zzc.zzd();
        this.zzb.zzl();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzm() {
        this.zzc.zzd();
        this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbm zzn() {
        this.zzc.zzd();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final zzbe zzo() {
        this.zzc.zzd();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzp() {
        this.zzc.zzd();
        return this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzq() {
        this.zzc.zzd();
        return this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzr() {
        this.zzc.zzd();
        return this.zzb.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzs() {
        this.zzc.zzd();
        return this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzt() {
        this.zzc.zzd();
        return this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzu() {
        this.zzc.zzd();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final boolean zzv() {
        this.zzc.zzd();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzw() {
        this.zzc.zzd();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final int zzx() {
        this.zzc.zzd();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final long zzy() {
        this.zzc.zzd();
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzba
    public final void zzz(float f7) {
        this.zzc.zzd();
        this.zzb.zzz(f7);
    }
}
