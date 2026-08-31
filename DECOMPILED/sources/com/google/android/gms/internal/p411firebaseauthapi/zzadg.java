package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4854g;
import p192Z3.AbstractC2110Y;
import p192Z3.C2126h;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadg extends zzaff<Void, InterfaceC2111Z> {
    private final zzajb zzv;

    public zzadg(AbstractC4854g abstractC4854g, String str) {
        super(2);
        AbstractC3718s.m18084m(abstractC4854g, "credential cannot be null");
        this.zzv = AbstractC2110Y.m8674a(abstractC4854g, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        C2126h c2126hZza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.mo8711b0().equalsIgnoreCase(c2126hZza.mo8711b0())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, c2126hZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
