package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.H */
/* JADX INFO: loaded from: classes.dex */
public class C4958H {

    /* JADX INFO: renamed from: a */
    private final Bundle f18814a;

    public C4958H(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f18814a = new Bundle(bundle);
    }

    /* JADX INFO: renamed from: d */
    private static int m22349d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* JADX INFO: renamed from: s */
    private static boolean m22350s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m22351t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m22353v("gcm.n.e")));
    }

    /* JADX INFO: renamed from: u */
    private static boolean m22352u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* JADX INFO: renamed from: v */
    private static String m22353v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* JADX INFO: renamed from: w */
    private String m22354w(String str) {
        if (!this.f18814a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strM22353v = m22353v(str);
            if (this.f18814a.containsKey(strM22353v)) {
                return strM22353v;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: z */
    private static String m22355z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22356a(String str) {
        String strM22370p = m22370p(str);
        return "1".equals(strM22370p) || Boolean.parseBoolean(strM22370p);
    }

    /* JADX INFO: renamed from: b */
    public Integer m22357b(String str) {
        String strM22370p = m22370p(str);
        if (TextUtils.isEmpty(strM22370p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM22370p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m22355z(str) + "(" + strM22370p + ") into an int");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public JSONArray m22358c(String str) {
        String strM22370p = m22370p(str);
        if (TextUtils.isEmpty(strM22370p)) {
            return null;
        }
        try {
            return new JSONArray(strM22370p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m22355z(str) + ": " + strM22370p + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    int[] m22359e() {
        JSONArray jSONArrayM22358c = m22358c("gcm.n.light_settings");
        if (jSONArrayM22358c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM22358c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m22349d(jSONArrayM22358c.optString(0));
            iArr[1] = jSONArrayM22358c.optInt(1);
            iArr[2] = jSONArrayM22358c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e7) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM22358c + ". " + e7.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM22358c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public Uri m22360f() {
        String strM22370p = m22370p("gcm.n.link_android");
        if (TextUtils.isEmpty(strM22370p)) {
            strM22370p = m22370p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strM22370p)) {
            return null;
        }
        return Uri.parse(strM22370p);
    }

    /* JADX INFO: renamed from: g */
    public Object[] m22361g(String str) {
        JSONArray jSONArrayM22358c = m22358c(str + "_loc_args");
        if (jSONArrayM22358c == null) {
            return null;
        }
        int length = jSONArrayM22358c.length();
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            strArr[i7] = jSONArrayM22358c.optString(i7);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: h */
    public String m22362h(String str) {
        return m22370p(str + "_loc_key");
    }

    /* JADX INFO: renamed from: i */
    public String m22363i(Resources resources, String str, String str2) {
        String strM22362h = m22362h(str2);
        if (TextUtils.isEmpty(strM22362h)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM22362h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m22355z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM22361g = m22361g(str2);
        if (objArrM22361g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM22361g);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + m22355z(str2) + ": " + Arrays.toString(objArrM22361g) + " Default value will be used.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Long m22364j(String str) {
        String strM22370p = m22370p(str);
        if (TextUtils.isEmpty(strM22370p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM22370p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m22355z(str) + "(" + strM22370p + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public String m22365k() {
        return m22370p("gcm.n.android_channel_id");
    }

    /* JADX INFO: renamed from: l */
    Integer m22366l() {
        Integer numM22357b = m22357b("gcm.n.notification_count");
        if (numM22357b == null) {
            return null;
        }
        if (numM22357b.intValue() >= 0) {
            return numM22357b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM22357b + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: renamed from: m */
    Integer m22367m() {
        Integer numM22357b = m22357b("gcm.n.notification_priority");
        if (numM22357b == null) {
            return null;
        }
        if (numM22357b.intValue() >= -2 && numM22357b.intValue() <= 2) {
            return numM22357b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM22357b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public String m22368n(Resources resources, String str, String str2) {
        String strM22370p = m22370p(str2);
        return !TextUtils.isEmpty(strM22370p) ? strM22370p : m22363i(resources, str, str2);
    }

    /* JADX INFO: renamed from: o */
    public String m22369o() {
        String strM22370p = m22370p("gcm.n.sound2");
        return TextUtils.isEmpty(strM22370p) ? m22370p("gcm.n.sound") : strM22370p;
    }

    /* JADX INFO: renamed from: p */
    public String m22370p(String str) {
        return this.f18814a.getString(m22354w(str));
    }

    /* JADX INFO: renamed from: q */
    public long[] m22371q() {
        JSONArray jSONArrayM22358c = m22358c("gcm.n.vibrate_timings");
        if (jSONArrayM22358c == null) {
            return null;
        }
        try {
            if (jSONArrayM22358c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM22358c.length();
            long[] jArr = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = jSONArrayM22358c.optLong(i7);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM22358c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    Integer m22372r() {
        Integer numM22357b = m22357b("gcm.n.visibility");
        if (numM22357b == null) {
            return null;
        }
        if (numM22357b.intValue() >= -1 && numM22357b.intValue() <= 1) {
            return numM22357b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + numM22357b + ". Skipping setting visibility.");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public Bundle m22373x() {
        Bundle bundle = new Bundle(this.f18814a);
        for (String str : this.f18814a.keySet()) {
            if (!m22350s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: y */
    public Bundle m22374y() {
        Bundle bundle = new Bundle(this.f18814a);
        for (String str : this.f18814a.keySet()) {
            if (m22352u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
