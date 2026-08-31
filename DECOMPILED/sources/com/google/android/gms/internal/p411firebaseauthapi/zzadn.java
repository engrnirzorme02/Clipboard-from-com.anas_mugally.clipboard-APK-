package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzadn extends zzaff<Void, Void> {
    private final zzaie zzv;

    public zzadn(String str, String str2, String str3, String str4) {
        super(15);
        this.zzv = zzaie.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzahg.ACCESS_TOKEN).zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final String zza() {
        return "revokeAccessToken";
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource<Void> taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
