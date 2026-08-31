package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import p012B2.InterfaceC0064e;
import p012B2.InterfaceC0069j;
import p012B2.InterfaceC0074o;
import p012B2.InterfaceC0076q;
import p012B2.InterfaceC0080u;
import p314o2.C6550b;
import p314o2.C6556h;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: e */
    static final C6550b f14358e = new C6550b(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* JADX INFO: renamed from: a */
    private View f14359a;

    /* JADX INFO: renamed from: b */
    CustomEventBanner f14360b;

    /* JADX INFO: renamed from: c */
    CustomEventInterstitial f14361c;

    /* JADX INFO: renamed from: d */
    CustomEventNative f14362d;

    /* JADX INFO: renamed from: a */
    private static Object m17601a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            throw null;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            AbstractC7599p.m33331f(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.f14359a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f14360b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f14361c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f14362d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f14360b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f14361c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f14362d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f14360b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f14361c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f14362d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC0069j interfaceC0069j, Bundle bundle, C6556h c6556h, InterfaceC0064e interfaceC0064e, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m17601a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f14360b = customEventBanner;
        if (customEventBanner == null) {
            interfaceC0069j.onAdFailedToLoad(this, f14358e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f14360b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new C3513a(this, interfaceC0069j), bundle.getString("parameter"), c6556h, interfaceC0064e, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, InterfaceC0074o interfaceC0074o, Bundle bundle, InterfaceC0064e interfaceC0064e, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m17601a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f14361c = customEventInterstitial;
        if (customEventInterstitial == null) {
            interfaceC0074o.onAdFailedToLoad(this, f14358e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f14361c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new C3514b(this, this, interfaceC0074o), bundle.getString("parameter"), interfaceC0064e, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, InterfaceC0076q interfaceC0076q, Bundle bundle, InterfaceC0080u interfaceC0080u, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m17601a(CustomEventNative.class, bundle.getString("class_name"));
        this.f14362d = customEventNative;
        if (customEventNative == null) {
            interfaceC0076q.onAdFailedToLoad(this, f14358e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f14362d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new C3515c(this, interfaceC0076q), bundle.getString("parameter"), interfaceC0080u, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f14361c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
