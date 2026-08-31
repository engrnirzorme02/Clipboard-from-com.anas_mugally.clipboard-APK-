package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzaed extends zzaff<Void, InterfaceC2111Z> {
    private final String zzv;

    public zzaed(String str) {
        super(2);
        this.zzv = AbstractC3718s.m18078g(str, "email cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzd.zze(), this.zzv, this.zzb);
    }
}
