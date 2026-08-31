package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4856h;
import p192Z3.C2126h;
import p192Z3.C2133k0;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadd extends zzaff<Object, InterfaceC2111Z> {
    private final C4856h zzv;

    public zzadd(C4856h c4856h) {
        super(2);
        this.zzv = (C4856h) AbstractC3718s.m18084m(c4856h, "credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        C2126h c2126hZza = zzacq.zza(this.zzc, this.zzk);
        ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, c2126hZza);
        zzb(new C2133k0(c2126hZza));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(new zzagx(this.zzv.m22036W(this.zzd), null, null), this.zzb);
    }
}
