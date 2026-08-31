package com.google.android.gms.internal.p411firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C4823G;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzabm implements zzafv<zzajj> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafv zzb;
    private final /* synthetic */ zzabj zzc;

    zzabm(zzabj zzabjVar, zzael zzaelVar, zzafv zzafvVar) {
        this.zza = zzaelVar;
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzabjVar);
        this.zzc = zzabjVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajj zzajjVar) {
        zzajj zzajjVar2 = zzajjVar;
        if (TextUtils.isEmpty(zzajjVar2.zze())) {
            this.zzc.zza.zza(new zzahv(zzajjVar2.zzd(), zzajjVar2.zzb(), Long.valueOf(zzajjVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzajjVar2.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025), C4823G.m22004Z(zzajjVar2.zzc(), zzajjVar2.zze()));
        }
    }
}
