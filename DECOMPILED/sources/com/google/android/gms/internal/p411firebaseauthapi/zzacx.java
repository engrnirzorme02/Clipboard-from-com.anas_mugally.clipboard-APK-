package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4882w;
import p192Z3.AbstractC2087A;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzacx extends zzaff<C4882w, InterfaceC2111Z> {
    private final String zzv;

    public zzacx(String str) {
        super(1);
        AbstractC3718s.m18078g(str, "refresh token cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzv);
        }
        ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, this.zzd);
        zzb(AbstractC2087A.m8623a(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
