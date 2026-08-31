package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4823G;
import p192Z3.C2126h;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadm extends zzaff<Void, InterfaceC2111Z> {
    private final zzaan zzv;

    public zzadm(C4823G c4823g, String str) {
        super(2);
        AbstractC3718s.m18084m(c4823g, "credential cannot be null");
        c4823g.m22009Y(false);
        this.zzv = new zzaan(c4823g, str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
