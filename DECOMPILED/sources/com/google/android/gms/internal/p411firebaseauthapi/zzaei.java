package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4833Q;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzaei extends zzaff<Void, InterfaceC2111Z> {
    private final C4833Q zzv;

    public zzaei(C4833Q c4833q) {
        super(2);
        this.zzv = (C4833Q) AbstractC3718s.m18084m(c4833q, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
