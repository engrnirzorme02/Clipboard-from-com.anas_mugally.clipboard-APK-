package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import p380w2.C7333b;
import p380w2.C7351t;
import p396y2.AbstractBinderC7534v;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcej extends WebChromeClient {
    private final zzcek zza;

    public zzcej(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcek)) {
            return webView.getContext();
        }
        zzcek zzcekVar = (zzcek) webView;
        Activity activityZzj = zzcekVar.zzj();
        return activityZzj != null ? activityZzj : zzcekVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcek)) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        AbstractBinderC7534v abstractBinderC7534vZzL = ((zzcek) webView).zzL();
        if (abstractBinderC7534vZzL != null) {
            abstractBinderC7534vZzL.zzb();
        } else {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(strMessage).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(strSourceId).length() + 1 + String.valueOf(iLineNumber).length() + 1);
        sb.append("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        sb.append(iLineNumber);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i7 = zzcei.zza[consoleMessage.messageLevel().ordinal()];
        if (i7 == 1) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c(string);
        } else if (i7 == 2) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
        } else if (i7 == 3 || i7 == 4 || i7 != 5) {
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e(string);
        } else {
            int i11 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcek zzcekVar = this.zza;
        if (zzcekVar.zzQ() != null) {
            webView2.setWebViewClient(zzcekVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j7, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        long j10 = 5242880 - j9;
        if (j10 <= 0) {
            quotaUpdater.updateQuota(j7);
            return;
        }
        if (j7 == 0) {
            if (j8 > j10 || j8 > 1048576) {
                j8 = 0;
            }
        } else if (j8 == 0) {
            j8 = Math.min(j7 + Math.min(131072L, j10), 1048576L);
        } else {
            if (j8 <= Math.min(1048576 - j7, j10)) {
                j7 += j8;
            }
            j8 = j7;
        }
        quotaUpdater.updateQuota(j8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z7;
        if (callback != null) {
            zzcek zzcekVar = this.zza;
            C7351t.m32349g();
            if (C3431F0.m17408e(zzcekVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                z7 = true;
            } else {
                C7351t.m32349g();
                if (C3431F0.m17408e(zzcekVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznZ)).booleanValue()) {
                callback.invoke(str, false, true);
            } else {
                callback.invoke(str, z7, true);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoa)).booleanValue()) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        AbstractBinderC7534v abstractBinderC7534vZzL = this.zza.zzL();
        if (abstractBinderC7534vZzL != null) {
            abstractBinderC7534vZzL.zzc();
        } else {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        AbstractBinderC7534v abstractBinderC7534vZzL = this.zza.zzL();
        if (abstractBinderC7534vZzL != null) {
            abstractBinderC7534vZzL.m33165U0(view, customViewCallback);
            abstractBinderC7534vZzL.m33164T0(i7);
        } else {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z7) {
        C7333b c7333bZzh;
        try {
            zzcek zzcekVar = this.zza;
            if (zzcekVar != null && zzcekVar.zzP() != null && zzcekVar.zzP().zzh() != null && (c7333bZzh = zzcekVar.zzP().zzh()) != null && !c7333bZzh.m32306b()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                c7333bZzh.m32307c(sb.toString());
                return false;
            }
            C7351t.m32349g();
            AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
            builderM17424o.setTitle(str2);
            if (z7) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builderM17424o.setView(linearLayout).setPositiveButton(R.string.ok, new zzceh(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzceg(jsPromptResult)).setOnCancelListener(new zzcef(jsPromptResult)).create().show();
            } else {
                builderM17424o.setMessage(str3).setPositiveButton(R.string.ok, new zzcee(jsResult)).setNegativeButton(R.string.cancel, new zzced(jsResult)).setOnCancelListener(new zzcec(jsResult)).create().show();
            }
            return true;
        } catch (WindowManager.BadTokenException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Fail to display Dialog.", e7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
