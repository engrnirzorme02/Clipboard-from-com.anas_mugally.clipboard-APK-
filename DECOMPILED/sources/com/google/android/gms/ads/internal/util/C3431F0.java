package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.C2381d;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.util.AbstractC3749d;
import com.google.android.gms.common.util.AbstractC3752g;
import com.google.android.gms.common.util.AbstractC3754i;
import com.google.android.gms.common.util.AbstractC3764s;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzcgl;
import com.google.android.gms.internal.ads.zzdpl;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfcm;
import com.google.android.gms.internal.ads.zzfro;
import com.google.android.gms.internal.ads.zzggo;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghs;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzhqn;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p170W2.AbstractC1845j;
import p227d3.C5228d;
import p364u2.AbstractC7158d;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;
import p404z2.C7596m;
import p404z2.EnumC7604u;
import p404z2.InterfaceC7589f;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3431F0 {

    /* JADX INFO: renamed from: l */
    public static final zzfro f14180l = new HandlerC3492p0(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    private String f14187g;

    /* JADX INFO: renamed from: h */
    private volatile String f14188h;

    /* JADX INFO: renamed from: a */
    private final AtomicReference f14181a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    private final AtomicReference f14182b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    private final AtomicReference f14183c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f14184d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    private boolean f14185e = true;

    /* JADX INFO: renamed from: f */
    private final Object f14186f = new Object();

    /* JADX INFO: renamed from: i */
    private boolean f14189i = false;

    /* JADX INFO: renamed from: j */
    private boolean f14190j = false;

    /* JADX INFO: renamed from: k */
    private final Executor f14191k = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: A */
    public static int m17385A(int i7) {
        if (i7 >= 5000) {
            return i7;
        }
        if (i7 <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 86);
        sb.append("HTTP timeout too low: ");
        sb.append(i7);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f(string);
        return 60000;
    }

    /* JADX INFO: renamed from: B */
    public static final int[] m17386B(Activity activity) {
        int[] iArrM17431v = m17431v(activity);
        return new int[]{C3244B.m17190a().m33292j(activity, iArrM17431v[0]), C3244B.m17190a().m33292j(activity, iArrM17431v[1])};
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m17387C(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m17433x(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m17389E(context));
    }

    /* JADX INFO: renamed from: D */
    public static final void m17388D(Context context, Intent intent, zzdsm zzdsmVar, String str) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznU)).booleanValue() || !(context instanceof zzcgl)) {
            m17434y(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) C3250D.m17200c().zzd(zzbci.zznW))) {
                    ((zzcgl) context).zza(intent, 236);
                    if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznV)).booleanValue() || zzdsmVar == null) {
                        return;
                    }
                    zzdsl zzdslVarZza = zzdsmVar.zza();
                    zzdslVarZza.zzc("action", "hila");
                    zzdslVarZza.zzc("gqi", zzghs.zza(str));
                    zzdslVarZza.zzf();
                    return;
                }
            }
            m17434y(context, intent);
        } catch (ActivityNotFoundException e7) {
            e = e7;
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while starting activity for result", e);
            C7351t.m32354l().zzg(e, "AdUtil.startActivityForResult");
            m17434y(context, intent);
        } catch (SecurityException e8) {
            e = e8;
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while starting activity for result", e);
            C7351t.m32354l().zzg(e, "AdUtil.startActivityForResult");
            m17434y(context, intent);
        } catch (Exception e9) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while starting activity for result", e9);
            C7351t.m32354l().zzg(e9, "AdUtil.startActivityForResult");
            m17434y(context, intent);
        }
    }

    /* JADX INFO: renamed from: E */
    private static KeyguardManager m17389E(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* JADX INFO: renamed from: F */
    private static boolean m17390F(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: G */
    private static String m17391G(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    /* JADX INFO: renamed from: H */
    private static Bundle m17392H(Context context) {
        try {
            return C5228d.m24155a(context).m24149c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            AbstractC3490o0.m17546l("Error getting metadata", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    private static final void m17393I(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: J */
    private static final void m17394J(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: K */
    private static final String m17395K(final Context context, String str) {
        String strM17409e0;
        String str2;
        if (str == null) {
            return m17409e0();
        }
        try {
            C3478i0 c3478i0M17527a = C3478i0.m17527a();
            if (TextUtils.isEmpty(c3478i0M17527a.f14251a)) {
                if (AbstractC3749d.m18158a()) {
                    str2 = (String) AbstractC3472f0.m17526a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.g0
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            Context context2 = context;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                AbstractC3490o0.m17545k("User agent is already initialized on Google Play Services.");
                                return string;
                            }
                            AbstractC3490o0.m17545k("User agent is not initialized on Google Play Services. Initializing.");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                            AbstractC3764s.m18207a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                            return defaultUserAgent;
                        }
                    });
                } else {
                    final Context contextM7632d = AbstractC1845j.m7632d(context);
                    str2 = (String) AbstractC3472f0.m17526a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.h0
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = contextM7632d;
                            Context context3 = context;
                            boolean z7 = false;
                            if (context2 != null) {
                                AbstractC3490o0.m17545k("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                AbstractC3490o0.m17545k("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z7 = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (!TextUtils.isEmpty(string)) {
                                return string;
                            }
                            AbstractC3490o0.m17545k("Reading user agent from WebSettings");
                            String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                            if (z7) {
                                sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                AbstractC3490o0.m17545k("Persisting user agent.");
                            }
                            return defaultUserAgent;
                        }
                    });
                }
                c3478i0M17527a.f14251a = str2;
            }
            strM17409e0 = c3478i0M17527a.f14251a;
        } catch (Exception unused) {
            strM17409e0 = null;
        }
        if (TextUtils.isEmpty(strM17409e0)) {
            strM17409e0 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strM17409e0)) {
            strM17409e0 = m17409e0();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strM17409e0).length() + 10 + str.length());
        sb.append(strM17409e0);
        sb.append(" (Mobile; ");
        sb.append(str);
        String string = sb.toString();
        try {
            if (C5228d.m24155a(context).m24153g()) {
                StringBuilder sb2 = new StringBuilder(string.length() + 4);
                sb2.append(string);
                sb2.append(";aia");
                string = sb2.toString();
            }
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "AdUtil.getUserAgent");
        }
        return string.concat(")");
    }

    /* JADX INFO: renamed from: R */
    public static void m17396R(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzh.zza.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: U */
    public static List m17397U() {
        zzbbz zzbbzVar = zzbci.zza;
        List listZzf = C3250D.m17199b().zzf();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzf.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzghq.zza(zzggo.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    AbstractC3490o0.m17545k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static String m17398V(String str, String str2) {
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7++) {
            charArray[i7] = (char) (charArray[i7] ^ str2.charAt(i7 % str2.length()));
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: W */
    public static C3421A0 m17399W(Context context) {
        C3421A0 c3421a0 = new C3421A0(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new C3421A0(locale.getLanguage(), locale.getCountry());
        }
        LocaleManager localeManagerM17383a = AbstractC3427D0.m17383a(context.getSystemService(AbstractC3425C0.m17382a()));
        if (localeManagerM17383a == null || localeManagerM17383a.getSystemLocales().isEmpty()) {
            return c3421a0;
        }
        Locale locale2 = localeManagerM17383a.getSystemLocales().get(0);
        return new C3421A0(locale2.getLanguage(), locale2.getCountry());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    /* JADX INFO: renamed from: a */
    public static final long m17400a(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: a0 */
    public static final boolean m17401a0(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static final WebResourceResponse m17402b(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", C7351t.m32349g().m17439O(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new C3446N(context).m17468b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Could not fetch MRAID JS.", e7);
        }
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public static final boolean m17403b0(final Context context, final WebSettings webSettings) {
        AbstractC3472f0.m17526a(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.x0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfro zzfroVar = C3431F0.f14180l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzba)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final String m17404c() {
        Resources resourcesZzf = C7351t.m32354l().zzf();
        return resourcesZzf != null ? resourcesZzf.getString(AbstractC7158d.f28605t) : "Test Ad";
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m17405c0(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3452Q m17406d(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3452Q ? (InterfaceC3452Q) iInterfaceQueryLocalInterface : new C3448O(iBinder);
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final String m17407d0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m17391G(m17392H(context));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m17408e(Context context, String str) {
        Context contextZza = zzbvf.zza(context);
        return C5228d.m24155a(contextZza).m24148b(str, contextZza.getPackageName()) == 0;
    }

    /* JADX INFO: renamed from: e0 */
    static final String m17409e0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m17410f(Context context) {
        try {
            return AbstractC3754i.m18173b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final String m17411f0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m17412g(String str) {
        if (!C7596m.m33304j()) {
            return false;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfF)).booleanValue()) {
            return false;
        }
        String str2 = (String) C3250D.m17200c().zzd(zzbci.zzfH);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C3250D.m17200c().zzd(zzbci.zzfG);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Integer m17413g0(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m17414h(Context context) {
        KeyguardManager keyguardManagerM17389E;
        return (context == null || (keyguardManagerM17389E = m17389E(context)) == null || !keyguardManagerM17389E.isKeyguardLocked()) ? false : true;
    }

    /* JADX INFO: renamed from: h0 */
    public static final DisplayMetrics m17415h0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m17416i(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error loading class.", th);
            C7351t.m32354l().zzg(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* JADX INFO: renamed from: i0 */
    protected static final int[] m17417i0() {
        return new int[]{0, 0};
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m17418j() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Map m17419j0(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i7);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e7) {
            C7351t.m32354l().zzg(e7, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m17420k(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m17421l(Context context) {
        try {
            Bundle bundleM17392H = m17392H(context);
            return TextUtils.isEmpty(m17391G(bundleM17392H)) && !TextUtils.isEmpty(bundleM17392H.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m17422m(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final void m17423n(View view, int i7, MotionEvent motionEvent) {
        String strZza;
        int i8;
        int iHeight;
        int iWidth;
        String str;
        zzfcj zzfcjVarZzC;
        zzfcm zzfcmVarZzaC;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpl) {
                childAt = ((zzdpl) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                strZza = "NATIVE";
                i8 = 1;
            } else {
                strZza = "UNKNOWN";
                i8 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            C7351t.m32349g();
            long jM17400a = m17400a(childAt);
            childAt.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcfr) || (zzfcmVarZzaC = ((zzcfr) childAt).zzaC()) == null) {
                str = "none";
            } else {
                str = zzfcmVarZzaC.zzb;
                int iHashCode = childAt.hashCode();
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iHashCode).length());
                sb.append(str);
                sb.append(":");
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if ((childAt instanceof zzceb) && (zzfcjVarZzC = ((zzceb) childAt).zzC()) != null) {
                strZza = zzfcj.zza(zzfcjVarZzC.zzb);
                i8 = zzfcjVarZzC.zze;
                str2 = zzfcjVarZzC.zzE;
            }
            String str3 = String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strZza, Integer.valueOf(i8), childAt.getClass().getName(), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jM17400a), Integer.toString(i7, 2));
            int i11 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e(str3);
        } catch (Exception e7) {
            int i12 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Failure getting view location.", e7);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final AlertDialog.Builder m17424o(Context context) {
        C7351t.m32352j();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    /* JADX INFO: renamed from: p */
    public static final void m17425p(Context context, String str, String str2) {
        new C3457W(context, str, str2, null, null).zzb();
    }

    /* JADX INFO: renamed from: q */
    public static final void m17426q(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzber.zzb.zze()).booleanValue()) {
                AbstractC3752g.m18170a(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m17427r(Context context, zzfcj zzfcjVar, zzdsm zzdsmVar) {
        zzdsl zzdslVarZza = zzdsmVar.zza();
        zzdslVarZza.zzc("action", "can_show");
        C7351t.m32349g();
        zzdslVarZza.zzc("foreground", true != m17420k(context) ? "1" : "0");
        zzdslVarZza.zzc("fg_al", true == C7351t.m32353k().zzf() ? "1" : "0");
        if (zzfcjVar != null) {
            List list = zzfcjVar.zzt;
            if (!list.isEmpty()) {
                zzdslVarZza.zzc("ancn", (String) list.get(0));
            }
            zzdslVarZza.zzc("ad_format", zzfcj.zza(zzfcjVar.zzb));
        }
        zzdslVarZza.zzd();
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m17428s(zzfcj zzfcjVar) {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzoi)).booleanValue() && zzfcjVar != null && zzfcjVar.zze == 4;
    }

    /* JADX INFO: renamed from: t */
    public static final int m17429t(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            String strConcat = "Could not parse value:".concat(e7.toString());
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(strConcat);
            return 0;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Map m17430u(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzr)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i7 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i7);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i7);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i7, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i7 = iIndexOf + 1;
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: v */
    public static final int[] m17431v(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m17417i0() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    /* JADX INFO: renamed from: w */
    public static final int[] m17432w(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrM17417i0 = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? m17417i0() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{C3244B.m17190a().m33292j(activity, iArrM17417i0[0]), C3244B.m17190a().m33292j(activity, iArrM17417i0[1])};
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m17433x(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z7 = C7351t.m32349g().f14185e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m17401a0(view);
        long jM17400a = m17400a(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z7)) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbz)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzls)).booleanValue()) {
            if (jM17400a < ((Integer) C3250D.m17200c().zzd(zzbci.zzlu)).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static final void m17434y(Context context, Intent intent) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlP)).booleanValue()) {
            m17394J(context, intent);
            return;
        }
        try {
            m17394J(context, intent);
        } catch (SecurityException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("", e7);
            C7351t.m32354l().zzg(e7, "AdUtil.startActivityWithUnknownContext");
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m17435z(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m17405c0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            String string2 = sb.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a(string2);
        } catch (ActivityNotFoundException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("No browser is found.", e7);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m17436L(Context context, String str, boolean z7, HttpURLConnection httpURLConnection, boolean z8, int i7) {
        int iM17385A = m17385A(i7);
        StringBuilder sb = new StringBuilder(String.valueOf(iM17385A).length() + 28);
        sb.append("HTTP timeout: ");
        sb.append(iM17385A);
        sb.append(" milliseconds.");
        String string = sb.toString();
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e(string);
        httpURLConnection.setConnectTimeout(iM17385A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iM17385A);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", m17439O(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m17437M(Context context) {
        if (this.f14189i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C3423B0(this, null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C3423B0(this, null), intentFilter, 4);
        }
        this.f14189i = true;
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m17438N(Context context) {
        if (this.f14190j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbci.zza(context);
        byte[] bArr = null;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C3512z0(this, bArr), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C3512z0(this, bArr), intentFilter, 4);
        }
        this.f14190j = true;
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final String m17439O(Context context, String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmb)).booleanValue()) {
            if (this.f14188h != null) {
                return this.f14188h;
            }
            this.f14188h = m17395K(context, str);
            return this.f14188h;
        }
        synchronized (this.f14186f) {
            try {
                String str2 = this.f14187g;
                if (str2 != null) {
                    return str2;
                }
                String strM17395K = m17395K(context, str);
                this.f14187g = strM17395K;
                return strM17395K;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final InterfaceFutureC1673e m17440P(final Uri uri) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.util.y0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfro zzfroVar = C3431F0.f14180l;
                C7351t.m32349g();
                return C3431F0.m17430u(uri);
            }
        }, this.f14191k);
    }

    /* JADX INFO: renamed from: Q */
    public final void m17441Q(final Context context, final String str, String str2, Bundle bundle, boolean z7) {
        C7351t.m32349g();
        bundle.putString("device", m17411f0());
        zzbbz zzbbzVar = zzbci.zza;
        bundle.putString("eids", TextUtils.join(",", C3250D.m17199b().zze()));
        if (bundle.isEmpty()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Empty or null bundle.");
        } else {
            final String str3 = (String) C3250D.m17200c().zzd(zzbci.zzlq);
            if (!this.f14184d.getAndSet(true)) {
                this.f14183c.set(AbstractC3467d.m17524c(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.w0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f14340a.m17444X(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f14183c.get());
        }
        C3244B.m17190a();
        C7590g.m33275b(context, str, "gmob-apps", bundle, true, new InterfaceC7589f() { // from class: com.google.android.gms.ads.internal.util.v0
            @Override // p404z2.InterfaceC7589f
            public final /* synthetic */ EnumC7604u zza(String str4) {
                zzfro zzfroVar = C3431F0.f14180l;
                C7351t.m32349g();
                C3431F0.m17425p(context, str, str4);
                return EnumC7604u.SUCCESS;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final boolean m17442S(String str) {
        return m17390F(str, this.f14181a, (String) C3250D.m17200c().zzd(zzbci.zzav));
    }

    /* JADX INFO: renamed from: T */
    public final boolean m17443T(String str) {
        return m17390F(str, this.f14182b, (String) C3250D.m17200c().zzd(zzbci.zzaw));
    }

    /* JADX INFO: renamed from: X */
    final /* synthetic */ void m17444X(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f14183c.set(AbstractC3467d.m17523b(context, str));
    }

    /* JADX INFO: renamed from: Y */
    final /* synthetic */ void m17445Y(boolean z7) {
        this.f14185e = z7;
    }

    /* JADX INFO: renamed from: Z */
    public final int m17446Z(Context context, Uri uri) {
        if (context == null) {
            AbstractC3490o0.m17545k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            m17393I(context, uri);
            return 2;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfd)).booleanValue()) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzfb)).booleanValue()) {
                m17393I(context, uri);
                return 9;
            }
            zzbdj zzbdjVar = new zzbdj();
            zzbdjVar.zzd(new C3502u0(this, zzbdjVar, context, uri));
            zzbdjVar.zze((Activity) context);
            return 5;
        }
        C2381d c2381dM10208a = new C2381d.d(C7351t.m32360r().zzb()).m10208a();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfp)).booleanValue()) {
            C3244B.m17190a();
            if (C7590g.m33291z()) {
                return 5;
            }
        }
        c2381dM10208a.f8406a.setPackage(zzhqn.zza(context));
        c2381dM10208a.m10201a(context, uri);
        return 5;
    }
}
