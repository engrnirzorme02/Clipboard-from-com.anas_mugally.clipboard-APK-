package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3756k;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzdvr;
import com.google.android.gms.internal.ads.zzdvs;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3509y {

    /* JADX INFO: renamed from: a */
    private final Object f14349a = new Object();

    /* JADX INFO: renamed from: b */
    private String f14350b = "";

    /* JADX INFO: renamed from: c */
    private String f14351c = "";

    /* JADX INFO: renamed from: d */
    private boolean f14352d = false;

    /* JADX INFO: renamed from: e */
    private boolean f14353e = false;

    /* JADX INFO: renamed from: f */
    protected String f14354f = "";

    /* JADX INFO: renamed from: g */
    private zzdvs f14355g;

    /* JADX INFO: renamed from: o */
    protected static final String m17584o(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", C7351t.m32349g().m17439O(context, str2));
        InterfaceFutureC1673e interfaceFutureC1673eM17468b = new C3446N(context).m17468b(0, str, map, null);
        try {
            return (String) interfaceFutureC1673eM17468b.get(((Integer) C3250D.m17200c().zzd(zzbci.zzfv)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            String strValueOf = String.valueOf(str);
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Interrupted while retrieving a response from: ".concat(strValueOf), e7);
            interfaceFutureC1673eM17468b.cancel(true);
            return null;
        } catch (TimeoutException e8) {
            String strValueOf2 = String.valueOf(str);
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Timeout while retrieving a response from: ".concat(strValueOf2), e8);
            interfaceFutureC1673eM17468b.cancel(true);
            return null;
        } catch (Exception e9) {
            String strValueOf3 = String.valueOf(str);
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error retrieving a response from: ".concat(strValueOf3), e9);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0034, B:14:0x003c, B:16:0x0051, B:19:0x0063, B:11:0x002b, B:20:0x006a, B:21:0x006c), top: B:26:0x000b, inners: #1, #2 }] */
    /* JADX INFO: renamed from: p */
    private final Uri m17585p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f14349a) {
            if (TextUtils.isEmpty(this.f14350b)) {
                C7351t.m32349g();
                try {
                    str5 = new String(AbstractC3756k.m18189d(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f14350b = str5;
                if (TextUtils.isEmpty(str5)) {
                    C7351t.m32349g();
                    this.f14350b = UUID.randomUUID().toString();
                    C7351t.m32349g();
                    String str6 = this.f14350b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e7) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Error writing to file in internal storage.", e7);
                    }
                    str4 = this.f14350b;
                } else {
                    str4 = this.f14350b;
                }
            } else {
                str4 = this.f14350b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: a */
    public final void m17586a(zzdvs zzdvsVar) {
        this.f14355g = zzdvsVar;
    }

    /* JADX INFO: renamed from: b */
    public final zzdvs m17587b() {
        return this.f14355g;
    }

    /* JADX INFO: renamed from: c */
    public final void m17588c(Context context) {
        zzdvs zzdvsVar;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue() || (zzdvsVar = this.f14355g) == null) {
            return;
        }
        zzdvsVar.zzo(new BinderC3503v(this, context), zzdvr.DEBUG_MENU);
    }

    /* JADX INFO: renamed from: d */
    final boolean m17589d(Context context, String str, String str2) {
        String strM17584o = m17584o(context, m17585p(context, (String) C3250D.m17200c().zzd(zzbci.zzfs), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM17584o)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM17584o.trim());
            String strOptString = jSONObject.optString("gct");
            this.f14354f = jSONObject.optString("status");
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
                boolean z7 = "0".equals(this.f14354f) || "2".equals(this.f14354f);
                m17595j(z7);
                InterfaceC3494q0 interfaceC3494q0Zzo = C7351t.m32354l().zzo();
                if (!z7) {
                    str = "";
                }
                interfaceC3494q0Zzo.mo17555h(str);
            }
            synchronized (this.f14349a) {
                this.f14351c = strOptString;
            }
            return true;
        } catch (JSONException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Fail to get in app preview response json.", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17590e(Context context, String str, String str2) {
        String strM17584o = m17584o(context, m17585p(context, (String) C3250D.m17200c().zzd(zzbci.zzft), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM17584o)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM17584o.trim()).optString("debug_mode"));
            m17595j(zEquals);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
                InterfaceC3494q0 interfaceC3494q0Zzo = C7351t.m32354l().zzo();
                if (true != zEquals) {
                    str = "";
                }
                interfaceC3494q0Zzo.mo17555h(str);
            }
            return zEquals;
        } catch (JSONException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Fail to get debug mode response json.", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m17591f(Context context, String str, String str2) {
        C7351t.m32349g();
        C3431F0.m17435z(context, m17585p(context, (String) C3250D.m17200c().zzd(zzbci.zzfr), str, str2));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17592g(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m17598m()) {
            return false;
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Sending troubleshooting signals to the server.");
        m17593h(context, str, str2, str3);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m17593h(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m17585p(context, (String) C3250D.m17200c().zzd(zzbci.zzfu), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        C7351t.m32349g();
        C3431F0.m17425p(context, str, builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: i */
    public final String m17594i() {
        String str;
        synchronized (this.f14349a) {
            str = this.f14351c;
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public final void m17595j(boolean z7) {
        synchronized (this.f14349a) {
            try {
                this.f14353e = z7;
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
                    C7351t.m32354l().zzo().zzK(z7);
                    zzdvs zzdvsVar = this.f14355g;
                    if (zzdvsVar != null) {
                        zzdvsVar.zzb(z7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m17596k() {
        boolean z7;
        synchronized (this.f14349a) {
            z7 = this.f14353e;
        }
        return z7;
    }

    /* JADX INFO: renamed from: l */
    public final void m17597l(boolean z7) {
        synchronized (this.f14349a) {
            this.f14352d = z7;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m17598m() {
        boolean z7;
        synchronized (this.f14349a) {
            z7 = this.f14352d;
        }
        return z7;
    }

    /* JADX INFO: renamed from: n */
    protected final void m17599n(Context context, String str, boolean z7, boolean z8) {
        if (context instanceof Activity) {
            C3431F0.f14180l.post(new RunnableC3507x(this, context, str, z7, z8));
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e("Can not create dialog without Activity Context");
        }
    }
}
