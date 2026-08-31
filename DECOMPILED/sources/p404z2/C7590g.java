package p404z2;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzfob;
import com.google.android.gms.internal.ads.zzfro;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p004A2.AbstractC0012a;
import p170W2.C1841f;
import p314o2.C6554f;
import p314o2.C6557i;
import p324p2.AbstractC6736c;
import p324p2.C6735b;

/* JADX INFO: renamed from: z2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7590g {

    /* JADX INFO: renamed from: b */
    public static final Handler f30239b = new zzfro(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private static final String f30240c = C6557i.class.getName();

    /* JADX INFO: renamed from: d */
    private static final String f30241d = AbstractC0012a.class.getName();

    /* JADX INFO: renamed from: e */
    private static final String f30242e = C6735b.class.getName();

    /* JADX INFO: renamed from: f */
    private static final String f30243f = AbstractC6736c.class.getName();

    /* JADX INFO: renamed from: g */
    private static final String f30244g = zzfob.class.getName();

    /* JADX INFO: renamed from: h */
    private static final String f30245h = C6554f.class.getName();

    /* JADX INFO: renamed from: a */
    private float f30246a = -1.0f;

    /* JADX INFO: renamed from: A */
    public static final boolean m33271A(Context context, int i7) {
        return C1841f.m7623f().mo7609h(context, i7) == 0;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m33272B(Context context) {
        int iMo7609h = C1841f.m7623f().mo7609h(context, 12451000);
        return iMo7609h == 0 || iMo7609h == 2;
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m33273C() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: a */
    public static final int m33274a(DisplayMetrics displayMetrics, int i7) {
        return Math.round(i7 / displayMetrics.density);
    }

    /* JADX INFO: renamed from: b */
    public static final void m33275b(Context context, String str, String str2, Bundle bundle, boolean z7, InterfaceC7589f interfaceC7589f) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int iM7624a = C1841f.m7623f().m7624a(context);
            StringBuilder sb = new StringBuilder(String.valueOf(iM7624a).length() + 10);
            sb.append(iM7624a);
            sb.append(".253410000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        interfaceC7589f.zza(builderAppendQueryParameter.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final int m33276c(Context context, int i7) {
        return m33289x(context.getResources().getDisplayMetrics(), i7);
    }

    /* JADX INFO: renamed from: d */
    public static final String m33277d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || m33291z()) {
            string = "emulator";
        }
        return m33278e(string, "MD5");
    }

    /* JADX INFO: renamed from: e */
    private static String m33278e(String str, String str2) {
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final JSONArray m33279f(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m33280g(jSONArray, it.next());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: g */
    private final void m33280g(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m33298u((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(m33296s((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(m33279f((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m33299v((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m33281h(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzq)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, m33298u((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, m33296s((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m33279f((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, m33279f(Arrays.asList((Object[]) obj)));
            return;
        }
        int i7 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i7 < length) {
                    numArr2[i7] = Integer.valueOf(iArr[i7]);
                    i7++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, m33299v(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i7 < length2) {
                    dArr3[i7] = Double.valueOf(dArr2[i7]);
                    i7++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, m33299v(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i7 < length3) {
                    lArr2[i7] = Long.valueOf(jArr[i7]);
                    i7++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, m33299v(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i7 < length4) {
                boolArr2[i7] = Boolean.valueOf(zArr[i7]);
                i7++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, m33299v(boolArr));
    }

    /* JADX INFO: renamed from: i */
    private static final void m33282i(ViewGroup viewGroup, C3369m2 c3369m2, String str, int i7, int i8) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i7);
        textView.setBackgroundColor(i8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i7);
        int iM33276c = m33276c(context, 3);
        int i9 = c3369m2.f14027f;
        int i10 = c3369m2.f14024c;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i9 - iM33276c, i10 - iM33276c, 17));
        viewGroup.addView(frameLayout, i9, i10);
    }

    /* JADX INFO: renamed from: m */
    public static Object m33283m(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    /* JADX INFO: renamed from: n */
    public static ActivityManager.MemoryInfo m33284n(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            AbstractC7599p.m33331f("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m33285o(String str) {
        return m33278e(str, "MD5");
    }

    /* JADX INFO: renamed from: p */
    public static String m33286p(String str) {
        return m33278e(str, "SHA-256");
    }

    /* JADX INFO: renamed from: r */
    public static String m33287r() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m33288w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzber.zzd.zze());
    }

    /* JADX INFO: renamed from: x */
    public static final int m33289x(DisplayMetrics displayMetrics, int i7) {
        return (int) TypedValue.applyDimension(1, i7, displayMetrics);
    }

    /* JADX INFO: renamed from: y */
    public static final String m33290y(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i7];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f30240c.equalsIgnoreCase(className2) || f30241d.equalsIgnoreCase(className2) || f30242e.equalsIgnoreCase(className2) || f30243f.equalsIgnoreCase(className2) || f30244g.equalsIgnoreCase(className2) || f30245h.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i8].getClassName();
                break;
            }
            i7 = i8;
        }
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i9 = 2; i9 > 0 && stringTokenizer.hasMoreElements(); i9--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m33291z() {
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzmj)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    /* JADX INFO: renamed from: j */
    public final int m33292j(Context context, int i7) {
        if (this.f30246a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f30246a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f30246a = displayMetrics.density;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Math.round(i7 / this.f30246a);
    }

    /* JADX INFO: renamed from: k */
    public final void m33293k(ViewGroup viewGroup, C3369m2 c3369m2, String str, String str2) {
        if (str2 != null) {
            AbstractC7599p.m33331f(str2);
        }
        m33282i(viewGroup, c3369m2, str, -65536, -16777216);
    }

    /* JADX INFO: renamed from: l */
    public final void m33294l(ViewGroup viewGroup, C3369m2 c3369m2, String str) {
        m33282i(viewGroup, c3369m2, "Ads by Google", -16777216, -1);
    }

    /* JADX INFO: renamed from: q */
    public final void m33295q(final Context context, String str, String str2, Bundle bundle, boolean z7) {
        m33275b(context, str, "gmob-apps", bundle, true, new InterfaceC7589f() { // from class: z2.e
            @Override // p404z2.InterfaceC7589f
            public final /* synthetic */ EnumC7604u zza(String str3) {
                new C7587d(this.f30237a, context, str3).start();
                return EnumC7604u.SUCCESS;
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final JSONObject m33296s(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m33281h(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e7) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e7.getMessage())));
        }
    }

    /* JADX INFO: renamed from: t */
    public final JSONObject m33297t(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return m33298u(bundle);
            } catch (JSONException e7) {
                AbstractC7599p.m33329d("Error converting Bundle to JSON", e7);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final JSONObject m33298u(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m33281h(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: v */
    final JSONArray m33299v(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            m33280g(jSONArray, obj);
        }
        return jSONArray;
    }
}
