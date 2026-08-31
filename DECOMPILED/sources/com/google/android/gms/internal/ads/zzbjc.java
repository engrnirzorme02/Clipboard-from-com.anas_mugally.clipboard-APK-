package com.google.android.gms.internal.ads;

import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzbjc implements zzggr {
    static final /* synthetic */ zzbjc zza = new zzbjc();

    private /* synthetic */ zzbjc() {
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        if (!((Boolean) zzbeh.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        C7351t.m32354l().zzg(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
