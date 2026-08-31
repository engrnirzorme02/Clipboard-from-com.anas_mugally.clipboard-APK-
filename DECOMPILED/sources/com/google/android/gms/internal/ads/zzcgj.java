package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p098M0.AbstractC0880j;
import p098M0.AbstractC0881k;
import p098M0.C0882l;
import p098M0.InterfaceC0872b;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgj {
    private final Context zzd;
    private String zza = null;
    private zzhlz zzb = null;
    private final AtomicBoolean zzc = new AtomicBoolean(false);
    private InterfaceC0872b zze = null;

    zzcgj(Context context) {
        this.zzd = context;
    }

    public final void zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjE)).booleanValue() && !this.zzc.getAndSet(true) && AbstractC0881k.m4035a("GET_VARIATIONS_HEADER")) {
            try {
                String strM4029k = AbstractC0880j.m4029k();
                if (strM4029k.isEmpty()) {
                    return;
                }
                this.zza = strM4029k;
                this.zzb = zzhlz.zzc(Base64.decode(strM4029k, 0), zzhhr.zzb());
            } catch (zzhiw | IllegalArgumentException e7) {
                C7351t.m32354l().zzh(e7, "ChromeVariations");
            }
        }
    }

    public final String zzb() {
        return this.zza;
    }

    public final zzhlz zzc() {
        return this.zzb;
    }

    public final void zzd(Executor executor, boolean z7, AbstractC0880j.d dVar) {
        AbstractC0880j.m4034p(this.zzd, new C0882l.b(executor).m4039b(z7).m4038a(), dVar);
    }

    public final void zze(WebView webView) {
        if (this.zze != null) {
            try {
                AbstractC0880j.m4033o(webView, "GMA_WEBVIEW_PROFILE");
                AbstractC3490o0.m17545k("WebViewCompat Profile is defined");
            } catch (IllegalStateException e7) {
                String strConcat = "WebViewCompat error: ".concat(e7.toString());
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(strConcat);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoE)).booleanValue()) {
                    C7351t.m32354l().zzg(e7, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void zzf(zzcgm zzcgmVar) {
        ProfileStore profileStore;
        if (!AbstractC0881k.m4035a("MULTI_PROFILE")) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore", "getInstance", new zzfrs[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfrs[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e8) {
                AbstractC7599p.m33326a("Unable to get ProfileStore instance: ".concat(String.valueOf(e8.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zze = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoD)).booleanValue()) {
                long jMo18161c = C7351t.m32357o().mo18161c() - zzcgmVar.zza;
                zzdsl zzdslVarZza = zzcgmVar.zzb.zzd().zza();
                zzdslVarZza.zzc("action", "webview_p_l");
                zzdslVarZza.zzc("webview_p_l", Long.toString(jMo18161c));
                zzdslVarZza.zzd();
                return;
            }
            return;
        }
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("WebViewCompat failure: No instance");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoD)).booleanValue()) {
            zzdsl zzdslVarZza2 = zzcgmVar.zzb.zzd().zza();
            zzdslVarZza2.zzc("action", "webview_p_f");
            zzdslVarZza2.zzc("webview_p_f", "No instance");
            zzdslVarZza2.zzd();
        }
    }
}
