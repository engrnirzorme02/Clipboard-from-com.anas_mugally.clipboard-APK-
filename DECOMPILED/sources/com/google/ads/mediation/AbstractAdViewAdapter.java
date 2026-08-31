package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;
import p004A2.AbstractC0012a;
import p012B2.InterfaceC0064e;
import p012B2.InterfaceC0069j;
import p012B2.InterfaceC0074o;
import p012B2.InterfaceC0076q;
import p012B2.InterfaceC0080u;
import p012B2.InterfaceC0081v;
import p012B2.InterfaceC0083x;
import p314o2.C6554f;
import p314o2.C6555g;
import p314o2.C6556h;
import p314o2.C6557i;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, InterfaceC0081v, InterfaceC0083x {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C6554f adLoader;
    protected C6557i mAdView;
    protected AbstractC0012a mInterstitialAd;

    C6555g buildAdRequest(Context context, InterfaceC0064e interfaceC0064e, Bundle bundle, Bundle bundle2) {
        C6555g.a aVar = new C6555g.a();
        Set keywords = interfaceC0064e.getKeywords();
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                aVar.m27798b((String) it.next());
            }
        }
        if (interfaceC0064e.isTesting()) {
            C3244B.m17190a();
            aVar.m27804h(C7590g.m33277d(context));
        }
        if (interfaceC0064e.taggedForChildDirectedTreatment() != -1) {
            aVar.m27805i(interfaceC0064e.taggedForChildDirectedTreatment() == 1);
        }
        aVar.m27806j(interfaceC0064e.isDesignedForFamilies());
        aVar.m27799c(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.m27825k();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    AbstractC0012a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // p012B2.InterfaceC0083x
    public InterfaceC3340f1 getVideoController() {
        C6557i c6557i = this.mAdView;
        if (c6557i != null) {
            return c6557i.m27841e().m27870c();
        }
        return null;
    }

    C6554f.a newAdLoader(Context context, String str) {
        return new C6554f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        C6557i c6557i = this.mAdView;
        if (c6557i != null) {
            c6557i.m27848a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // p012B2.InterfaceC0081v
    public void onImmersiveModeUpdated(boolean z7) {
        AbstractC0012a abstractC0012a = this.mInterstitialAd;
        if (abstractC0012a != null) {
            abstractC0012a.setImmersiveMode(z7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        C6557i c6557i = this.mAdView;
        if (c6557i != null) {
            c6557i.m27850c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        C6557i c6557i = this.mAdView;
        if (c6557i != null) {
            c6557i.m27851d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, InterfaceC0069j interfaceC0069j, Bundle bundle, C6556h c6556h, InterfaceC0064e interfaceC0064e, Bundle bundle2) {
        C6557i c6557i = new C6557i(context);
        this.mAdView = c6557i;
        c6557i.setAdSize(new C6556h(c6556h.m27829c(), c6556h.m27827a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new C3232b(this, interfaceC0069j));
        this.mAdView.m27849b(buildAdRequest(context, interfaceC0064e, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, InterfaceC0074o interfaceC0074o, Bundle bundle, InterfaceC0064e interfaceC0064e, Bundle bundle2) {
        AbstractC0012a.load(context, getAdUnitId(bundle), buildAdRequest(context, interfaceC0064e, bundle2, bundle), new C3233c(this, interfaceC0074o));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, InterfaceC0076q interfaceC0076q, Bundle bundle, InterfaceC0080u interfaceC0080u, Bundle bundle2) {
        C3235e c3235e = new C3235e(this, interfaceC0076q);
        C6554f.a aVarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVarNewAdLoader.m27819c(c3235e);
        aVarNewAdLoader.m27823g(interfaceC0080u.getNativeAdOptions());
        aVarNewAdLoader.m27820d(interfaceC0080u.getNativeAdRequestOptions());
        if (interfaceC0080u.isUnifiedNativeAdRequested()) {
            aVarNewAdLoader.m27821e(c3235e);
        }
        if (interfaceC0080u.zza()) {
            for (String str : interfaceC0080u.zzb().keySet()) {
                aVarNewAdLoader.m27822f(str, c3235e, true != ((Boolean) interfaceC0080u.zzb().get(str)).booleanValue() ? null : c3235e);
            }
        }
        C6554f c6554fM27817a = aVarNewAdLoader.m27817a();
        this.adLoader = c6554fM27817a;
        c6554fM27817a.m27815a(buildAdRequest(context, interfaceC0080u, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC0012a abstractC0012a = this.mInterstitialAd;
        if (abstractC0012a != null) {
            abstractC0012a.show(null);
        }
    }
}
