package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p192Z3.C2135m;

/* JADX INFO: loaded from: classes2.dex */
final class zzaea extends zzaff<zzair, Void> {
    private final zzaiu zzv;

    public zzaea(C2135m c2135m, String str) {
        super(12);
        AbstractC3718s.m18083l(c2135m);
        this.zzv = zzaiu.zza(AbstractC3718s.m18077f(c2135m.m8741U()), str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
