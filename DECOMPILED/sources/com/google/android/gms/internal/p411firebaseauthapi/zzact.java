package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p192Z3.InterfaceC2144v;

/* JADX INFO: loaded from: classes2.dex */
final class zzact extends zzaff<Void, InterfaceC2144v> {
    public zzact() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        ((InterfaceC2144v) this.zze).zza();
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzb);
    }
}
