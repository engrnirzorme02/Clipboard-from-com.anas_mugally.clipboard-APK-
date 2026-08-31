package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import p012B2.InterfaceC0064e;
import p012B2.InterfaceC0065f;
import p012B2.InterfaceC0074o;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter extends InterfaceC0065f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, InterfaceC0074o interfaceC0074o, Bundle bundle, InterfaceC0064e interfaceC0064e, Bundle bundle2);

    void showInterstitial();
}
