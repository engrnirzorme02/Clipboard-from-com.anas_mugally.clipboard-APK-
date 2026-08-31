package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.Z */
/* JADX INFO: loaded from: classes.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC3460Z implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    private final String f14223a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3466c0 f14224b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC3460Z(C3466c0 c3466c0, String str) {
        Objects.requireNonNull(c3466c0);
        this.f14224b = c3466c0;
        this.f14223a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C3466c0 c3466c0 = this.f14224b;
        synchronized (c3466c0) {
            try {
                Iterator it = c3466c0.m17521d().iterator();
                while (it.hasNext()) {
                    ((InterfaceC3462a0) it.next()).zza(sharedPreferences, this.f14223a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
