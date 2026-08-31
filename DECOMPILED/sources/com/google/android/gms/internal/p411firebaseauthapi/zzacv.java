package com.google.android.gms.internal.p411firebaseauthapi;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4816B;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzacv extends zzaff<Void, InterfaceC2111Z> {
    private final AbstractC4816B zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacv(AbstractC4816B abstractC4816B, String str, String str2, String str3) {
        super(2);
        AbstractC2263x.m9328a(AbstractC3718s.m18083l(abstractC4816B));
        this.zzw = AbstractC3718s.m18077f(str);
        this.zzx = str2;
        this.zzy = str3;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza((AbstractC4816B) null, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
