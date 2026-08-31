package com.anas_mugally.clipboard.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p281k1.SharedPreferencesOnSharedPreferenceChangeListenerC5948g0;

/* JADX INFO: loaded from: classes.dex */
public final class PrimaryBubbleService extends Service {

    /* JADX INFO: renamed from: a */
    public static final C3078a f12704a = new C3078a(null);

    /* JADX INFO: renamed from: b */
    private static SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 f12705b;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f12706c;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.service.PrimaryBubbleService$a */
    public static final class C3078a {
        public /* synthetic */ C3078a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final void m15277a() {
            SharedPreferencesOnSharedPreferenceChangeListenerC5948g0 sharedPreferencesOnSharedPreferenceChangeListenerC5948g0 = PrimaryBubbleService.f12705b;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC5948g0 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC5948g0.m26811M();
            }
            PrimaryBubbleService.f12705b = null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m15278b() {
            return PrimaryBubbleService.f12706c;
        }

        /* JADX INFO: renamed from: c */
        public final void m15279c(Context context) {
            AbstractC6118n.m27187e(context, "context");
            try {
                context.startService(new Intent(context, (Class<?>) PrimaryBubbleService.class));
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m15280d(Context context) {
            AbstractC6118n.m27187e(context, "context");
            context.stopService(new Intent(context, (Class<?>) PrimaryBubbleService.class));
            m15277a();
            PrimaryBubbleService.f12706c = false;
        }

        private C3078a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f12706c = true;
        f12705b = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26816c(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        f12706c = true;
        if (f12705b != null) {
            return 2;
        }
        f12705b = SharedPreferencesOnSharedPreferenceChangeListenerC5948g0.f23553a0.m26816c(this);
        return 2;
    }
}
