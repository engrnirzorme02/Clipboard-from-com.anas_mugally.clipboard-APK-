package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzzv implements zzabr {
    private final zzaau zza;
    private final zzaav zzb;
    private final zzaba zzc;
    private final Queue zzd;
    private Surface zze;
    private zzu zzf;
    private long zzg;
    private zzabo zzh;
    private Executor zzi;
    private zzaar zzj;

    public zzzv(zzaau zzaauVar, zzaav zzaavVar, zzdb zzdbVar) {
        this.zza = zzaauVar;
        this.zzb = zzaavVar;
        zzaauVar.zzg(zzdbVar);
        this.zzc = new zzaba(new zzzu(this, null), zzaauVar, zzaavVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzs().zzM();
        this.zzg = -9223372036854775807L;
        this.zzh = zzabo.zzb;
        this.zzi = zzzq.zza;
        this.zzj = zzzo.zza;
    }

    final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    final /* synthetic */ zzabo zzB() {
        return this.zzh;
    }

    final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    final /* synthetic */ zzaar zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzc(zzabo zzaboVar, Executor executor) {
        this.zzh = zzaboVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzd(zzu zzuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzg(boolean z7) {
        if (z7) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzh(boolean z7) {
        return this.zza.zzi(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzl(zzaar zzaarVar) {
        this.zzj = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzm(float f7) {
        this.zza.zzn(f7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzo(long j7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzp(Surface surface, zzeg zzegVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzr(int i7) {
        this.zza.zzm(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzs(int i7, zzu zzuVar, long j7, int i8, List list) {
        zzghc.zzh(list.isEmpty());
        int i9 = zzuVar.zzv;
        zzu zzuVar2 = this.zzf;
        if (i9 != zzuVar2.zzv || zzuVar.zzw != zzuVar2.zzw) {
            this.zzc.zzc(i9, zzuVar.zzw);
        }
        float f7 = zzuVar.zzz;
        if (f7 != this.zzf.zzz) {
            this.zza.zze(f7);
        }
        this.zzf = zzuVar;
        if (j7 != this.zzg) {
            this.zzc.zzd(i8, j7);
            this.zzg = j7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final boolean zzu(long j7, zzabp zzabpVar) {
        this.zzd.add(zzabpVar);
        this.zzc.zze(j7);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzv(long j7, long j8) throws zzabq {
        try {
            this.zzc.zzb(j7, j8);
        } catch (zzhz e7) {
            throw new zzabq(e7, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzw(boolean z7) {
        this.zza.zzj(z7);
    }

    @Override // com.google.android.gms.internal.ads.zzabr
    public final void zzx() {
    }

    final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}
