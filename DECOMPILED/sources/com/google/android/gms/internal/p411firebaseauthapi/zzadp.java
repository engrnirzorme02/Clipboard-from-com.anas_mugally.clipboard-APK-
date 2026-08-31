package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4848d;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadp extends zzaff<Void, InterfaceC2111Z> {
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, C4848d c4848d, String str2, String str3, String str4) {
        super(4);
        AbstractC3718s.m18078g(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(c4848d.m22030a0());
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(c4848d);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
