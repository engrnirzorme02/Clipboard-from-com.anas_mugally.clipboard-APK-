package com.google.android.gms.internal.ads;

import android.app.Activity;
import p396y2.AbstractBinderC7534v;

/* JADX INFO: loaded from: classes2.dex */
final class zzecd extends zzecz {
    private Activity zza;
    private AbstractBinderC7534v zzb;
    private String zzc;
    private String zzd;

    zzecd() {
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzb(AbstractBinderC7534v abstractBinderC7534v) {
        this.zzb = abstractBinderC7534v;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzecz zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecz
    public final zzeda zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzece(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
