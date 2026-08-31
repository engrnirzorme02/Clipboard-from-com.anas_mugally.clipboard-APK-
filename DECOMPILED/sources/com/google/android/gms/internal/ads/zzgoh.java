package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzgoh extends zzgnv {
    private zzgog zza;

    zzgoh(zzgjv zzgjvVar, boolean z7, Executor executor, Callable callable) {
        super(zzgjvVar, z7, false);
        this.zza = new zzgof(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzA(int i7) {
        super.zzA(i7);
        if (i7 == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzgog zzgogVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    protected final void zzi() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzw(int i7, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnv
    final void zzx() {
        zzgog zzgogVar = this.zza;
        if (zzgogVar != null) {
            zzgogVar.zze();
        }
    }
}
