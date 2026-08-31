package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import p108N3.C0959a;
import p108N3.C0964f;

/* JADX INFO: loaded from: classes2.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    final zzcj zzc(Activity activity, C0964f c0964f) {
        C0959a c0959aM4214a = c0964f.m4214a();
        if (c0959aM4214a == null) {
            c0959aM4214a = new C0959a.a(this.zza).m4212a();
        }
        return zzp.zza(new zzp(this, activity, c0959aM4214a, c0964f, null));
    }
}
