package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC2436b;
import java.util.concurrent.atomic.AtomicInteger;
import p017C.AbstractC0111l;

/* JADX INFO: renamed from: com.google.firebase.messaging.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4980c {

    /* JADX INFO: renamed from: a */
    private static final AtomicInteger f18909a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0111l.e f18910a;

        /* JADX INFO: renamed from: b */
        public final String f18911b;

        /* JADX INFO: renamed from: c */
        public final int f18912c;

        a(AbstractC0111l.e eVar, String str, int i7) {
            this.f18910a = eVar;
            this.f18911b = str;
            this.f18912c = i7;
        }
    }

    /* JADX INFO: renamed from: a */
    private static PendingIntent m22453a(Context context, C4958H c4958h, String str, PackageManager packageManager) {
        Intent intentM22458f = m22458f(str, c4958h, packageManager);
        if (intentM22458f == null) {
            return null;
        }
        intentM22458f.addFlags(67108864);
        intentM22458f.putExtras(c4958h.m22374y());
        if (m22469q(c4958h)) {
            intentM22458f.putExtra("gcm.n.analytics_data", c4958h.m22373x());
        }
        return PendingIntent.getActivity(context, m22459g(), intentM22458f, m22464l(1073741824));
    }

    /* JADX INFO: renamed from: b */
    private static PendingIntent m22454b(Context context, Context context2, C4958H c4958h) {
        if (m22469q(c4958h)) {
            return m22455c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c4958h.m22373x()));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private static PendingIntent m22455c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m22459g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), m22464l(1073741824));
    }

    /* JADX INFO: renamed from: d */
    public static a m22456d(Context context, Context context2, C4958H c4958h, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        AbstractC0111l.e eVar = new AbstractC0111l.e(context2, str);
        String strM22368n = c4958h.m22368n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM22368n)) {
            eVar.m470j(strM22368n);
        }
        String strM22368n2 = c4958h.m22368n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM22368n2)) {
            eVar.m469i(strM22368n2);
            eVar.m484y(new AbstractC0111l.c().m455h(strM22368n2));
        }
        eVar.m482w(m22465m(packageManager, resources, packageName, c4958h.m22370p("gcm.n.icon"), bundle));
        Uri uriM22466n = m22466n(packageName, c4958h, resources);
        if (uriM22466n != null) {
            eVar.m483x(uriM22466n);
        }
        eVar.m468h(m22453a(context, c4958h, packageName, packageManager));
        PendingIntent pendingIntentM22454b = m22454b(context, context2, c4958h);
        if (pendingIntentM22454b != null) {
            eVar.m474n(pendingIntentM22454b);
        }
        Integer numM22460h = m22460h(context2, c4958h.m22370p("gcm.n.color"), bundle);
        if (numM22460h != null) {
            eVar.m467g(numM22460h.intValue());
        }
        eVar.m465e(!c4958h.m22356a("gcm.n.sticky"));
        eVar.m477r(c4958h.m22356a("gcm.n.local_only"));
        String strM22370p = c4958h.m22370p("gcm.n.ticker");
        if (strM22370p != null) {
            eVar.m485z(strM22370p);
        }
        Integer numM22367m = c4958h.m22367m();
        if (numM22367m != null) {
            eVar.m480u(numM22367m.intValue());
        }
        Integer numM22372r = c4958h.m22372r();
        if (numM22372r != null) {
            eVar.m460B(numM22372r.intValue());
        }
        Integer numM22366l = c4958h.m22366l();
        if (numM22366l != null) {
            eVar.m478s(numM22366l.intValue());
        }
        Long lM22364j = c4958h.m22364j("gcm.n.event_time");
        if (lM22364j != null) {
            eVar.m481v(true);
            eVar.m461C(lM22364j.longValue());
        }
        long[] jArrM22371q = c4958h.m22371q();
        if (jArrM22371q != null) {
            eVar.m459A(jArrM22371q);
        }
        int[] iArrM22359e = c4958h.m22359e();
        if (iArrM22359e != null) {
            eVar.m476q(iArrM22359e[0], iArrM22359e[1], iArrM22359e[2]);
        }
        eVar.m473m(m22461i(c4958h));
        return new a(eVar, m22467o(c4958h), 0);
    }

    /* JADX INFO: renamed from: e */
    static a m22457e(Context context, C4958H c4958h) {
        Bundle bundleM22462j = m22462j(context.getPackageManager(), context.getPackageName());
        return m22456d(context, context, c4958h, m22463k(context, c4958h.m22365k(), bundleM22462j), bundleM22462j);
    }

    /* JADX INFO: renamed from: f */
    private static Intent m22458f(String str, C4958H c4958h, PackageManager packageManager) {
        String strM22370p = c4958h.m22370p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strM22370p)) {
            Intent intent = new Intent(strM22370p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriM22360f = c4958h.m22360f();
        if (uriM22360f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriM22360f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* JADX INFO: renamed from: g */
    private static int m22459g() {
        return f18909a.incrementAndGet();
    }

    /* JADX INFO: renamed from: h */
    private static Integer m22460h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i7 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC2436b.getColor(context, i7));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: i */
    private static int m22461i(C4958H c4958h) {
        boolean zM22356a = c4958h.m22356a("gcm.n.default_sound");
        ?? r7 = zM22356a;
        if (c4958h.m22356a("gcm.n.default_vibrate_timings")) {
            r7 = (zM22356a ? 1 : 0) | 2;
        }
        return c4958h.m22356a("gcm.n.default_light_settings") ? r7 | 4 : r7;
    }

    /* JADX INFO: renamed from: j */
    private static Bundle m22462j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: k */
    public static String m22463k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private static int m22464l(int i7) {
        return i7 | 67108864;
    }

    /* JADX INFO: renamed from: m */
    private static int m22465m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m22468p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m22468p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i7 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 == 0 || !m22468p(resources, i7)) {
            try {
                i7 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e7);
            }
        }
        return (i7 == 0 || !m22468p(resources, i7)) ? R.drawable.sym_def_app_icon : i7;
    }

    /* JADX INFO: renamed from: n */
    private static Uri m22466n(String str, C4958H c4958h, Resources resources) {
        String strM22369o = c4958h.m22369o();
        if (TextUtils.isEmpty(strM22369o)) {
            return null;
        }
        if ("default".equals(strM22369o) || resources.getIdentifier(strM22369o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strM22369o);
    }

    /* JADX INFO: renamed from: o */
    private static String m22467o(C4958H c4958h) {
        String strM22370p = c4958h.m22370p("gcm.n.tag");
        if (!TextUtils.isEmpty(strM22370p)) {
            return strM22370p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: p */
    private static boolean m22468p(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    static boolean m22469q(C4958H c4958h) {
        return c4958h.m22356a("google.c.a.e");
    }
}
