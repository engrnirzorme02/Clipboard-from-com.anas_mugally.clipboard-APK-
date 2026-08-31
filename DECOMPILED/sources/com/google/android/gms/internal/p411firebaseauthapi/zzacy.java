package com.google.android.gms.internal.p411firebaseauthapi;

import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4816B;
import com.google.firebase.auth.AbstractC4880u;
import p192Z3.C2126h;
import p192Z3.C2133k0;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzacy extends zzaff<Object, InterfaceC2111Z> {
    private final AbstractC4816B zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(AbstractC4816B abstractC4816B, String str, String str2) {
        super(2);
        AbstractC2263x.m9328a(AbstractC3718s.m18083l(abstractC4816B));
        this.zzw = AbstractC3718s.m18077f(str);
        this.zzx = str2;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        C2126h c2126hZza = zzacq.zza(this.zzc, this.zzk);
        AbstractC4880u abstractC4880u = this.zzd;
        if (abstractC4880u != null && !abstractC4880u.mo8711b0().equalsIgnoreCase(c2126hZza.mo8711b0())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, c2126hZza);
            zzb(new C2133k0(c2126hZza));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, (AbstractC4816B) null, this.zzx, this.zzb);
    }
}
