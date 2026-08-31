package p252g4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p228d4.C5235g;

/* JADX INFO: renamed from: g4.e */
/* JADX INFO: loaded from: classes.dex */
class C5495e {

    /* JADX INFO: renamed from: a */
    private final Float f20837a;

    /* JADX INFO: renamed from: b */
    private final boolean f20838b;

    private C5495e(Float f7, boolean z7) {
        this.f20838b = z7;
        this.f20837a = f7;
    }

    /* JADX INFO: renamed from: a */
    public static C5495e m24765a(Context context) {
        boolean zM24767e = false;
        Float fM24766d = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zM24767e = m24767e(intentRegisterReceiver);
                fM24766d = m24766d(intentRegisterReceiver);
            }
        } catch (IllegalStateException e7) {
            C5235g.m24179f().m24183e("An error occurred getting battery state.", e7);
        }
        return new C5495e(fM24766d, zM24767e);
    }

    /* JADX INFO: renamed from: d */
    private static Float m24766d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m24767e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: b */
    public Float m24768b() {
        return this.f20837a;
    }

    /* JADX INFO: renamed from: c */
    public int m24769c() {
        Float f7;
        if (!this.f20838b || (f7 = this.f20837a) == null) {
            return 1;
        }
        return ((double) f7.floatValue()) < 0.99d ? 2 : 3;
    }
}
