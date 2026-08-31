package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p098M0.AbstractC0871a;
import p098M0.AbstractC0880j;
import p098M0.C0874d;

/* JADX INFO: loaded from: classes2.dex */
final class zzflt implements AbstractC0880j.c {
    final /* synthetic */ zzflv zza;

    zzflt(zzflv zzflvVar) {
        Objects.requireNonNull(zzflvVar);
        this.zza = zzflvVar;
    }

    @Override // p098M0.AbstractC0880j.c
    public final void onPostMessage(WebView webView, C0874d c0874d, Uri uri, boolean z7, AbstractC0871a abstractC0871a) {
        try {
            JSONObject jSONObject = new JSONObject(c0874d.m4018b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzflg.zza.getClass();
            }
        } catch (JSONException e7) {
            zzfne.zza("Error parsing JS message in JavaScriptSessionService.", e7);
        }
    }
}
