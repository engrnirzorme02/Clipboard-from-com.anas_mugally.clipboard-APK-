package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C4943c;
import java.util.concurrent.ExecutionException;
import p164V3.C1762g;
import p171W3.InterfaceC1862a;
import p198a2.AbstractC2188d;
import p198a2.AbstractC2191g;
import p198a2.C2187c;
import p198a2.InterfaceC2192h;
import p198a2.InterfaceC2194j;
import p269i5.C5719a;
import p269i5.C5720b;

/* JADX INFO: renamed from: com.google.firebase.messaging.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4955F {
    /* JADX INFO: renamed from: A */
    static void m22264A(String str, Bundle bundle) {
        try {
            C1762g.m7394m();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strM22272d = m22272d(bundle);
            if (strM22272d != null) {
                bundle2.putString("_nmid", strM22272d);
            }
            String strM22273e = m22273e(bundle);
            if (strM22273e != null) {
                bundle2.putString("_nmn", strM22273e);
            }
            String strM22277i = m22277i(bundle);
            if (!TextUtils.isEmpty(strM22277i)) {
                bundle2.putString("label", strM22277i);
            }
            String strM22275g = m22275g(bundle);
            if (!TextUtils.isEmpty(strM22275g)) {
                bundle2.putString("message_channel", strM22275g);
            }
            String strM22286r = m22286r(bundle);
            if (strM22286r != null) {
                bundle2.putString("_nt", strM22286r);
            }
            String strM22280l = m22280l(bundle);
            if (strM22280l != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strM22280l));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e7);
                }
            }
            String strM22288t = m22288t(bundle);
            if (strM22288t != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strM22288t));
                } catch (NumberFormatException e8) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e8);
                }
            }
            String strM22282n = m22282n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strM22282n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC1862a interfaceC1862a = (InterfaceC1862a) C1762g.m7394m().m7404j(InterfaceC1862a.class);
            if (interfaceC1862a != null) {
                interfaceC1862a.mo7655b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m22265B(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC1862a interfaceC1862a = (InterfaceC1862a) C1762g.m7394m().m7404j(InterfaceC1862a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC1862a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC1862a.mo7656c("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC1862a.mo7655b("fcm", "_cmp", bundle2);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m22266C(Intent intent) {
        if (intent == null || m22289u(intent)) {
            return false;
        }
        return m22269a();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m22267D(Intent intent) {
        if (intent == null || m22289u(intent)) {
            return false;
        }
        return m22268E(intent.getExtras());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m22268E(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: a */
    static boolean m22269a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C1762g.m7394m();
            Context contextM7405l = C1762g.m7394m().m7405l();
            SharedPreferences sharedPreferences = contextM7405l.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextM7405l.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM7405l.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    static C5719a m22270b(C5719a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C5719a.a aVarM25391j = C5719a.m25366p().m25395n(m22287s(extras)).m25386e(bVar).m25387f(m22274f(extras)).m25390i(m22283o()).m25393l(C5719a.d.ANDROID).m25389h(m22281m(extras)).m25391j(m22279k(extras));
        String strM22276h = m22276h(extras);
        if (strM22276h != null) {
            aVarM25391j.m25388g(strM22276h);
        }
        String strM22286r = m22286r(extras);
        if (strM22286r != null) {
            aVarM25391j.m25394m(strM22286r);
        }
        String strM22271c = m22271c(extras);
        if (strM22271c != null) {
            aVarM25391j.m25384c(strM22271c);
        }
        String strM22277i = m22277i(extras);
        if (strM22277i != null) {
            aVarM25391j.m25383b(strM22277i);
        }
        String strM22273e = m22273e(extras);
        if (strM22273e != null) {
            aVarM25391j.m25385d(strM22273e);
        }
        long jM22285q = m22285q(extras);
        if (jM22285q > 0) {
            aVarM25391j.m25392k(jM22285q);
        }
        return aVarM25391j.m25382a();
    }

    /* JADX INFO: renamed from: c */
    static String m22271c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* JADX INFO: renamed from: d */
    static String m22272d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* JADX INFO: renamed from: e */
    static String m22273e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* JADX INFO: renamed from: f */
    static String m22274f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C4943c.m22221q(C1762g.m7394m()).getId());
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: g */
    static String m22275g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* JADX INFO: renamed from: h */
    static String m22276h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* JADX INFO: renamed from: i */
    static String m22277i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* JADX INFO: renamed from: j */
    private static int m22278j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: k */
    static int m22279k(Bundle bundle) {
        int iM22284p = m22284p(bundle);
        if (iM22284p == 2) {
            return 5;
        }
        return iM22284p == 1 ? 10 : 0;
    }

    /* JADX INFO: renamed from: l */
    static String m22280l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* JADX INFO: renamed from: m */
    static C5719a.c m22281m(Bundle bundle) {
        return (bundle == null || !C4958H.m22351t(bundle)) ? C5719a.c.DATA_MESSAGE : C5719a.c.DISPLAY_NOTIFICATION;
    }

    /* JADX INFO: renamed from: n */
    static String m22282n(Bundle bundle) {
        return (bundle == null || !C4958H.m22351t(bundle)) ? "data" : "display";
    }

    /* JADX INFO: renamed from: o */
    static String m22283o() {
        return C1762g.m7394m().m7405l().getPackageName();
    }

    /* JADX INFO: renamed from: p */
    static int m22284p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return m22278j(string);
    }

    /* JADX INFO: renamed from: q */
    static long m22285q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e7) {
                Log.w("FirebaseMessaging", "error parsing project number", e7);
            }
        }
        C1762g c1762gM7394m = C1762g.m7394m();
        String strM7425e = c1762gM7394m.m7407p().m7425e();
        if (strM7425e != null) {
            try {
                return Long.parseLong(strM7425e);
            } catch (NumberFormatException e8) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e8);
            }
        }
        String strM7423c = c1762gM7394m.m7407p().m7423c();
        if (strM7423c.startsWith("1:")) {
            String[] strArrSplit = strM7423c.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e9) {
                Log.w("FirebaseMessaging", "error parsing app ID", e9);
            }
        } else {
            try {
                return Long.parseLong(strM7423c);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing app ID", e10);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    static String m22286r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: s */
    static int m22287s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    static String m22288t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    private static boolean m22289u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* JADX INFO: renamed from: v */
    public static void m22290v(Intent intent) {
        m22264A("_nd", intent.getExtras());
    }

    /* JADX INFO: renamed from: w */
    public static void m22291w(Intent intent) {
        m22264A("_nf", intent.getExtras());
    }

    /* JADX INFO: renamed from: x */
    public static void m22292x(Bundle bundle) {
        m22265B(bundle);
        m22264A("_no", bundle);
    }

    /* JADX INFO: renamed from: y */
    public static void m22293y(Intent intent) {
        if (m22267D(intent)) {
            m22264A("_nr", intent.getExtras());
        }
        if (m22266C(intent)) {
            m22294z(C5719a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m22309r());
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m22294z(C5719a.b bVar, Intent intent, InterfaceC2194j interfaceC2194j) {
        if (interfaceC2194j == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C5719a c5719aM22270b = m22270b(bVar, intent);
        if (c5719aM22270b == null) {
            return;
        }
        try {
            interfaceC2194j.mo8933a("FCM_CLIENT_EVENT_LOGGING", C5720b.class, C2187c.m8925b("proto"), new InterfaceC2192h() { // from class: com.google.firebase.messaging.E
                @Override // p198a2.InterfaceC2192h
                public final Object apply(Object obj) {
                    return ((C5720b) obj).m25401c();
                }
            }).mo8932b(AbstractC2188d.m8928g(C5720b.m25399b().m25403b(c5719aM22270b).m25402a(), AbstractC2191g.m8930b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e7) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
        }
    }
}
