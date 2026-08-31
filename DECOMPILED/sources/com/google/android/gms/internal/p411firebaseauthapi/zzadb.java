package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4854g;
import p192Z3.AbstractC2110Y;
import p192Z3.C2126h;
import p192Z3.C2133k0;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadb extends zzaff<Object, InterfaceC2111Z> {
    private final zzajb zzv;

    public zzadb(AbstractC4854g abstractC4854g) {
        super(2);
        AbstractC3718s.m18084m(abstractC4854g, "credential cannot be null");
        this.zzv = AbstractC2110Y.m8674a(abstractC4854g, null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "linkFederatedCredential";
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
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
