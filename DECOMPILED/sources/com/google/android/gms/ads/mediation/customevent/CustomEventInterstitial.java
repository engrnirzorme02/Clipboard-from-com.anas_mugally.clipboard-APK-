package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p012B2.InterfaceC0064e;
import p020C2.InterfaceC0137a;
import p020C2.InterfaceC0139c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventInterstitial extends InterfaceC0137a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, InterfaceC0139c interfaceC0139c, String str, InterfaceC0064e interfaceC0064e, Bundle bundle);

    void showInterstitial();
}
