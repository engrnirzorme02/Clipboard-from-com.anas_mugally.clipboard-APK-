package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import p108N3.C0965g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i7, String str) {
        super(str);
        this.zza = i7;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final C0965g zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new C0965g(this.zza, super.getMessage());
    }

    public zzg(int i7, String str, Throwable th) {
        super(str, th);
        this.zza = i7;
    }
}
