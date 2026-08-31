package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3463b {

    /* JADX INFO: renamed from: c */
    private static volatile float f14226c = -1.0f;

    /* JADX INFO: renamed from: d */
    private static volatile long f14227d;

    /* JADX INFO: renamed from: e */
    private static final Object f14228e = new Object();

    /* JADX INFO: renamed from: a */
    private boolean f14229a = false;

    /* JADX INFO: renamed from: b */
    private float f14230b = 1.0f;

    /* JADX INFO: renamed from: e */
    public static float m17510e(Context context) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzoG)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return 0.0f;
            }
            return m17512g(audioManager);
        }
        long jMo18159a = C7351t.m32357o().mo18159a();
        long jIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzoH)).intValue();
        if (f14226c != -1.0f && jMo18159a - f14227d < jIntValue) {
            return f14226c;
        }
        synchronized (f14228e) {
            try {
                long jMo18159a2 = C7351t.m32357o().mo18159a();
                if (f14226c != -1.0f && jMo18159a2 - f14227d < jIntValue) {
                    return f14226c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
                if (audioManager2 == null) {
                    f14226c = 0.0f;
                    f14227d = jMo18159a2;
                    return 0.0f;
                }
                f14226c = m17512g(audioManager2);
                f14227d = jMo18159a2;
                return f14226c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final synchronized boolean m17511f() {
        return this.f14230b >= 0.0f;
    }

    /* JADX INFO: renamed from: g */
    private static float m17512g(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17513a(float f7) {
        this.f14230b = f7;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized float m17514b() {
        if (!m17511f()) {
            return 1.0f;
        }
        return this.f14230b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m17515c(boolean z7) {
        this.f14229a = z7;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m17516d() {
        return this.f14229a;
    }
}
