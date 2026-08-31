package com.google.android.recaptcha.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzid implements zzih {
    private final Context zza;

    public zzid(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    /* JADX INFO: renamed from: cs */
    public final /* synthetic */ Object mo21946cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
