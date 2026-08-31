package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import p012B2.InterfaceC0064e;
import p012B2.InterfaceC0065f;
import p012B2.InterfaceC0069j;
import p314o2.C6556h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationBannerAdapter extends InterfaceC0065f {
    View getBannerView();

    @Override // p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // p012B2.InterfaceC0065f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC0069j interfaceC0069j, Bundle bundle, C6556h c6556h, InterfaceC0064e interfaceC0064e, Bundle bundle2);
}
