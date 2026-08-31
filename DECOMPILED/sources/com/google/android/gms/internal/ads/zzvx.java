package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvx extends zzto implements zzvl {
    private final zzfz zza;
    private final zzvh zzb;
    private final zzru zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private zzgy zzi;
    private zzaj zzj;
    private final zzyy zzk;

    /* synthetic */ zzvx(zzaj zzajVar, zzfz zzfzVar, zzvh zzvhVar, zzru zzruVar, zzyy zzyyVar, int i7, int i8, zzu zzuVar, zzght zzghtVar, byte[] bArr) {
        this.zzj = zzajVar;
        this.zza = zzfzVar;
        this.zzb = zzvhVar;
        this.zzc = zzruVar;
        this.zzk = zzyyVar;
        this.zzd = i7;
    }

    private final void zzu() {
        long j7 = this.zzf;
        boolean z7 = this.zzg;
        boolean z8 = this.zzh;
        zzaj zzajVarZzJ = zzJ();
        zzbe zzwjVar = new zzwj(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j7, j7, 0L, 0L, z7, false, false, null, zzajVarZzJ, z8 ? zzajVarZzJ.zzc : null);
        if (this.zze) {
            zzwjVar = new zzvu(this, zzwjVar);
        }
        zze(zzwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final synchronized void zzA(zzaj zzajVar) {
        this.zzj = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzC(zzun zzunVar) {
        ((zzvt) zzunVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final zzun zzG(zzup zzupVar, zzyv zzyvVar, long j7) {
        zzga zzgaVarZza = this.zza.zza();
        zzgy zzgyVar = this.zzi;
        if (zzgyVar != null) {
            zzgaVarZza.zze(zzgyVar);
        }
        zzaf zzafVar = zzJ().zzb;
        zzafVar.getClass();
        return new zzvt(zzafVar.zza, zzgaVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzupVar), this.zzk, zzf(zzupVar), this, zzyvVar, null, this.zzd, 0, null, zzeo.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final synchronized zzaj zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zza(zzgy zzgyVar) {
        this.zzi = zzgyVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzb(long j7, zzadv zzadvVar, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.zzf;
        }
        boolean zZzb = zzadvVar.zzb();
        if (!this.zze && this.zzf == j7 && this.zzg == zZzb && this.zzh == z7) {
            return;
        }
        this.zzf = j7;
        this.zzg = zZzb;
        this.zzh = z7;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzt() {
    }
}
