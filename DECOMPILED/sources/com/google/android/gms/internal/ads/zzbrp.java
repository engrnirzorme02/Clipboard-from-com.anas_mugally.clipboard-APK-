package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.C2381d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p012B2.InterfaceC0064e;
import p012B2.InterfaceC0074o;
import p380w2.C7351t;
import p396y2.C7524l;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrp implements MediationInterstitialAdapter {
    private Activity zza;
    private InterfaceC0074o zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        AbstractC7599p.m33326a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        AbstractC7599p.m33326a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        AbstractC7599p.m33326a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, InterfaceC0074o interfaceC0074o, Bundle bundle, InterfaceC0064e interfaceC0064e, Bundle bundle2) {
        this.zzb = interfaceC0074o;
        if (interfaceC0074o == null) {
            AbstractC7599p.m33331f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            AbstractC7599p.m33331f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbdj.zza(context)) {
            AbstractC7599p.m33331f("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            AbstractC7599p.m33331f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C2381d c2381dM10208a = new C2381d.d().m10208a();
        c2381dM10208a.f8406a.setData(this.zzc);
        C3431F0.f14180l.post(new zzbro(this, new AdOverlayInfoParcel(new C7524l(c2381dM10208a.f8406a, null), null, new zzbrn(this), null, new C7584a(0, 0, false), null, null, "")));
        C7351t.m32354l().zzd();
    }

    final /* synthetic */ Activity zza() {
        return this.zza;
    }

    final /* synthetic */ InterfaceC0074o zzb() {
        return this.zzb;
    }
}
