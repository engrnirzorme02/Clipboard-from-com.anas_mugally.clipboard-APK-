package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2400k;
import com.google.android.gms.common.util.AbstractC3754i;
import java.util.Locale;
import p081K.AbstractC0714f;
import p156U2.AbstractC1668b;
import p170W2.AbstractC1844i;
import p170W2.AbstractC1847l;
import p227d3.C5228d;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3661E {

    /* JADX INFO: renamed from: a */
    private static final C2400k f14715a = new C2400k();

    /* JADX INFO: renamed from: b */
    private static Locale f14716b;

    /* JADX INFO: renamed from: a */
    public static String m17974a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C5228d.m24155a(context).m24150d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m17975b(Context context, int i7) {
        Resources resources = context.getResources();
        if (i7 == 1) {
            return resources.getString(AbstractC1668b.f5558d);
        }
        if (i7 != 2) {
            return i7 != 3 ? resources.getString(R.string.ok) : resources.getString(AbstractC1668b.f5555a);
        }
        return resources.getString(AbstractC1668b.f5564j);
    }

    /* JADX INFO: renamed from: c */
    public static String m17976c(Context context, int i7) {
        Resources resources = context.getResources();
        String strM17974a = m17974a(context);
        if (i7 == 1) {
            return resources.getString(AbstractC1668b.f5559e, strM17974a);
        }
        if (i7 == 2) {
            return AbstractC3754i.m18178g(context) ? resources.getString(AbstractC1668b.f5568n) : resources.getString(AbstractC1668b.f5565k, strM17974a);
        }
        if (i7 == 3) {
            return resources.getString(AbstractC1668b.f5556b, strM17974a);
        }
        if (i7 == 5) {
            return m17980g(context, "common_google_play_services_invalid_account_text", strM17974a);
        }
        if (i7 == 7) {
            return m17980g(context, "common_google_play_services_network_error_text", strM17974a);
        }
        if (i7 == 9) {
            return resources.getString(AbstractC1668b.f5563i, strM17974a);
        }
        if (i7 == 20) {
            return m17980g(context, "common_google_play_services_restricted_profile_text", strM17974a);
        }
        switch (i7) {
            case 16:
                return m17980g(context, "common_google_play_services_api_unavailable_text", strM17974a);
            case 17:
                return m17980g(context, "common_google_play_services_sign_in_failed_text", strM17974a);
            case 18:
                return resources.getString(AbstractC1668b.f5567m, strM17974a);
            default:
                return resources.getString(AbstractC1847l.f6000a, strM17974a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m17977d(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? m17980g(context, "common_google_play_services_resolution_required_text", m17974a(context)) : m17976c(context, i7);
    }

    /* JADX INFO: renamed from: e */
    public static String m17978e(Context context, int i7) {
        String strM17981h = i7 == 6 ? m17981h(context, "common_google_play_services_resolution_required_title") : m17979f(context, i7);
        return strM17981h == null ? context.getResources().getString(AbstractC1668b.f5562h) : strM17981h;
    }

    /* JADX INFO: renamed from: f */
    public static String m17979f(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(AbstractC1668b.f5560f);
            case 2:
                return resources.getString(AbstractC1668b.f5566l);
            case 3:
                return resources.getString(AbstractC1668b.f5557c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m17981h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m17981h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m17981h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m17981h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m17980g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM17981h = m17981h(context, str);
        if (strM17981h == null) {
            strM17981h = resources.getString(AbstractC1847l.f6000a);
        }
        return String.format(resources.getConfiguration().locale, strM17981h, str2);
    }

    /* JADX INFO: renamed from: h */
    private static String m17981h(Context context, String str) {
        C2400k c2400k = f14715a;
        synchronized (c2400k) {
            try {
                Locale localeM3475c = AbstractC0714f.m3464a(context.getResources().getConfiguration()).m3475c(0);
                if (!localeM3475c.equals(f14716b)) {
                    c2400k.clear();
                    f14716b = localeM3475c;
                }
                String str2 = (String) c2400k.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesM7628e = AbstractC1844i.m7628e(context);
                if (resourcesM7628e == null) {
                    return null;
                }
                int identifier = resourcesM7628e.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesM7628e.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c2400k.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
