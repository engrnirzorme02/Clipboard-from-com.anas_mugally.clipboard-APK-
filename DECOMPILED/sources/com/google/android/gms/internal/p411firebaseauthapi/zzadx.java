package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p192Z3.C2135m;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadx extends zzaff<Void, InterfaceC2111Z> {
    private final boolean zzaa;
    private final String zzab;
    private final String zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final long zzy;
    private final boolean zzz;

    public zzadx(C2135m c2135m, String str, String str2, long j7, boolean z7, boolean z8, String str3, String str4, String str5, boolean z9) {
        super(8);
        AbstractC3718s.m18083l(c2135m);
        AbstractC3718s.m18077f(str);
        this.zzv = AbstractC3718s.m18077f(c2135m.m8741U());
        this.zzw = str;
        this.zzx = str2;
        this.zzy = j7;
        this.zzz = z7;
        this.zzaa = z8;
        this.zzab = str3;
        this.zzac = str4;
        this.zzad = str5;
        this.zzae = z9;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzb);
    }
}
