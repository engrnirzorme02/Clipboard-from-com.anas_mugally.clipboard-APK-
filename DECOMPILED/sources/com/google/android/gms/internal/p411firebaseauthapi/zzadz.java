package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.C4827K;

/* JADX INFO: loaded from: classes2.dex */
final class zzadz extends zzaff<Void, AbstractC4825I> {
    private final zzaaq zzv;

    public zzadz(C4827K c4827k, String str, String str2, long j7, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9) {
        super(8);
        AbstractC3718s.m18083l(c4827k);
        AbstractC3718s.m18077f(str);
        this.zzv = new zzaaq(c4827k, str, str2, j7, z7, z8, str3, str4, str5, z9);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
