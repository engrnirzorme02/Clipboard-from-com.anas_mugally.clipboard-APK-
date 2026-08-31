package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcb {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_adapter_flags", 0);
        } catch (IllegalStateException e7) {
            AbstractC7599p.m33332g("", e7);
            return null;
        }
    }

    public static final SharedPreferences zzb(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e7) {
            AbstractC7599p.m33332g("", e7);
            return null;
        }
    }
}
