package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafp<ResultT, CallbackT> implements zzafg<ResultT> {
    private final zzaff<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzafp(zzaff<ResultT, CallbackT> zzaffVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaffVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafg
    public final void zza(ResultT resultt, Status status) {
        AbstractC3718s.m18084m(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzaff<ResultT, CallbackT> zzaffVar = this.zza;
        if (zzaffVar.zzq != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaffVar.zzc);
            zzaff<ResultT, CallbackT> zzaffVar2 = this.zza;
            taskCompletionSource.setException(zzaen.zza(firebaseAuth, zzaffVar2.zzq, ("reauthenticateWithCredential".equals(zzaffVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC4854g abstractC4854g = zzaffVar.zzn;
        if (abstractC4854g != null) {
            this.zzb.setException(zzaen.zza(status, abstractC4854g, zzaffVar.zzo, zzaffVar.zzp));
        } else {
            this.zzb.setException(zzaen.zza(status));
        }
    }
}
