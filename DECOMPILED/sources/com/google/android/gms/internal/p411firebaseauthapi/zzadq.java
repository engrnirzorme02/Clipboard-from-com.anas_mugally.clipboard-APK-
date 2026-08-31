package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4848d;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadq extends zzaff<Void, InterfaceC2111Z> {
    private final zzahm zzv;

    public zzadq(String str, C4848d c4848d) {
        super(6);
        AbstractC3718s.m18078g(str, "token cannot be null or empty");
        zzahm zzahmVar = new zzahm(4);
        this.zzv = zzahmVar;
        zzahmVar.zzd(str);
        if (c4848d != null) {
            zzahmVar.zza(c4848d);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
