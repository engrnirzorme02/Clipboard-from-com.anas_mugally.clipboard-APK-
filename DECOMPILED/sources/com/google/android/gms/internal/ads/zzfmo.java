package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmo {
    private static final zzfmo zza = new zzfmo();

    private zzfmo() {
    }

    public static final zzfmo zza() {
        return zza;
    }

    public static final boolean zzk(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("javascript: ");
                    sb.append(str);
                    webView.loadUrl(sb.toString());
                    return true;
                }
            } catch (Exception e7) {
                e7.getMessage();
                zzflg.zza.getClass();
            }
        }
        return false;
    }

    public final void zzb(WebView webView, String str, JSONObject jSONObject) {
        zzj(webView, "init", jSONObject, str);
    }

    public final void zzc(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzj(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void zzd(WebView webView, String str) {
        zzj(webView, "finishSession", str);
    }

    public final void zze(WebView webView, String str, String str2) {
        zzj(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void zzf(WebView webView, String str, String str2) {
        zzj(webView, "setState", str2, str);
    }

    public final void zzg(WebView webView, String str, String str2) {
        zzj(webView, "setDeviceLockState", str2);
    }

    public final void zzh(WebView webView, String str, float f7) {
        zzj(webView, "setDeviceVolume", Float.valueOf(f7), str);
    }

    public final void zzi(WebView webView, JSONObject jSONObject) {
        zzj(webView, "setLastActivity", jSONObject);
    }

    final void zzj(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            zzflg.zza.getClass();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb.append(string);
                } else {
                    sb.append('\"');
                    sb.append(string);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            zzk(webView, string2);
        } else {
            handler.post(new zzfmn(this, webView, string2));
        }
    }
}
