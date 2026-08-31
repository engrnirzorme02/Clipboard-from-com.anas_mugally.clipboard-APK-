package p170W2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3727w0;
import com.google.android.gms.common.util.AbstractC3754i;
import p017C.AbstractC0117r;
import p227d3.C5228d;

/* JADX INFO: renamed from: W2.f */
/* JADX INFO: loaded from: classes.dex */
public class C1841f {

    /* JADX INFO: renamed from: a */
    public static final int f5987a = AbstractC1845j.f5992a;

    /* JADX INFO: renamed from: b */
    private static final C1841f f5988b = new C1841f();

    C1841f() {
    }

    /* JADX INFO: renamed from: f */
    public static C1841f m7623f() {
        return f5988b;
    }

    /* JADX INFO: renamed from: a */
    public int m7624a(Context context) {
        return AbstractC1845j.m7630b(context);
    }

    /* JADX INFO: renamed from: b */
    public Intent mo7605b(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            int i8 = AbstractC3727w0.f14862c;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && AbstractC3754i.m18178g(context)) {
            int i9 = AbstractC3727w0.f14862c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f5987a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C5228d.m24155a(context).m24152f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i10 = AbstractC3727w0.f14862c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX INFO: renamed from: c */
    public PendingIntent mo7606c(Context context, int i7, int i8) {
        return m7625d(context, i7, i8, null);
    }

    /* JADX INFO: renamed from: d */
    public PendingIntent m7625d(Context context, int i7, int i8, String str) {
        Intent intentMo7605b = mo7605b(context, i7, str);
        if (intentMo7605b == null) {
            return null;
        }
        return AbstractC0117r.m564b(context, i8, intentMo7605b, 134217728, false);
    }

    /* JADX INFO: renamed from: e */
    public String mo7607e(int i7) {
        return AbstractC1845j.m7631c(i7);
    }

    /* JADX INFO: renamed from: g */
    public int mo7608g(Context context) {
        return mo7609h(context, f5987a);
    }

    /* JADX INFO: renamed from: h */
    public int mo7609h(Context context, int i7) {
        int iM7635g = AbstractC1845j.m7635g(context, i7);
        if (AbstractC1845j.m7636h(context, iM7635g)) {
            return 18;
        }
        return iM7635g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7626i(Context context, String str) {
        return AbstractC1845j.m7640l(context, str);
    }

    /* JADX INFO: renamed from: j */
    public boolean mo7610j(int i7) {
        return AbstractC1845j.m7638j(i7);
    }

    /* JADX INFO: renamed from: k */
    public void m7627k(Context context, int i7) throws C1842g, C1843h {
        AbstractC1845j.m7629a(context, i7);
    }
}
