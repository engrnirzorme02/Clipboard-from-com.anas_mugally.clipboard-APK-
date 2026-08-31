package com.google.android.gms.ads.internal.adaptersettings;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbbr;

/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final zzbbr adapterSettingsInternal = C3250D.m17201d();

    AdapterSettings() {
    }

    private boolean getBoolean(String str, boolean z7) {
        return this.adapterSettingsInternal.zzf(str, z7);
    }

    private float getFloat(String str, float f7) {
        return this.adapterSettingsInternal.zze(str, f7);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i7) {
        return this.adapterSettingsInternal.zzd(str, i7);
    }

    private long getLong(String str, long j7) {
        return this.adapterSettingsInternal.zzc(str, j7);
    }

    private String getString(String str, String str2) {
        return this.adapterSettingsInternal.zzb(str, str2);
    }
}
