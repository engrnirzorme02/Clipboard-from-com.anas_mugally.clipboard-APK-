package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4848d;

/* JADX INFO: loaded from: classes2.dex */
final class zzaeh extends zzaff<Void, Void> {
    private final zzahm zzv;

    public zzaeh(String str, String str2, C4848d c4848d) {
        super(6);
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(c4848d);
        this.zzv = zzahm.zza(c4848d, str, str2);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzc(this.zzv, this.zzb);
    }
}
