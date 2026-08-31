package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import p170W2.C1841f;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iMo7609h = C1841f.m7623f().mo7609h(context, 12451000);
            zza = Boolean.valueOf(iMo7609h == 0 || iMo7609h == 2);
        }
        return zza.booleanValue();
    }
}
