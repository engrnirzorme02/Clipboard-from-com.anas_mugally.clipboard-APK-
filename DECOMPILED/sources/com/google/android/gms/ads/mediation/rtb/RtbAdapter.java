package com.google.android.gms.ads.mediation.rtb;

import android.os.RemoteException;
import p012B2.AbstractC0060a;
import p012B2.C0067h;
import p012B2.C0068i;
import p012B2.C0073n;
import p012B2.C0075p;
import p012B2.C0078s;
import p012B2.InterfaceC0063d;
import p028D2.C0187a;
import p028D2.InterfaceC0188b;

/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC0060a {
    public abstract void collectSignals(C0187a c0187a, InterfaceC0188b interfaceC0188b);

    public void loadRtbAppOpenAd(C0067h c0067h, InterfaceC0063d interfaceC0063d) {
        loadAppOpenAd(c0067h, interfaceC0063d);
    }

    public void loadRtbBannerAd(C0068i c0068i, InterfaceC0063d interfaceC0063d) {
        loadBannerAd(c0068i, interfaceC0063d);
    }

    public void loadRtbInterstitialAd(C0073n c0073n, InterfaceC0063d interfaceC0063d) {
        loadInterstitialAd(c0073n, interfaceC0063d);
    }

    @Deprecated
    public void loadRtbNativeAd(C0075p c0075p, InterfaceC0063d interfaceC0063d) {
        loadNativeAd(c0075p, interfaceC0063d);
    }

    public void loadRtbNativeAdMapper(C0075p c0075p, InterfaceC0063d interfaceC0063d) throws RemoteException {
        loadNativeAdMapper(c0075p, interfaceC0063d);
    }

    public void loadRtbRewardedAd(C0078s c0078s, InterfaceC0063d interfaceC0063d) {
        loadRewardedAd(c0078s, interfaceC0063d);
    }

    public void loadRtbRewardedInterstitialAd(C0078s c0078s, InterfaceC0063d interfaceC0063d) {
        loadRewardedInterstitialAd(c0078s, interfaceC0063d);
    }
}
