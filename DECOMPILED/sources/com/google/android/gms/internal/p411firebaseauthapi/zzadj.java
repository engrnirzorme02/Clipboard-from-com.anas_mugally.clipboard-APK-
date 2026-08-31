package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import p192Z3.C2126h;
import p192Z3.C2133k0;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: loaded from: classes2.dex */
final class zzadj extends zzaff<Object, InterfaceC2111Z> {
    private final String zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzadj(String str, String str2, String str3, String str4) {
        super(2);
        AbstractC3718s.m18078g(str, "email cannot be null or empty");
        AbstractC3718s.m18078g(str2, "password cannot be null or empty");
        this.zzv = str;
        this.zzw = str2;
        this.zzx = str3;
        this.zzy = str4;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        C2126h c2126hZza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.mo8711b0().equalsIgnoreCase(c2126hZza.mo8711b0())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC2111Z) this.zze).mo8675a(this.zzj, c2126hZza);
            zzb(new C2133k0(c2126hZza));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
