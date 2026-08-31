package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p012B2.InterfaceC0064e;
import p020C2.InterfaceC0137a;
import p020C2.InterfaceC0138b;
import p314o2.C6556h;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends InterfaceC0137a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, InterfaceC0138b interfaceC0138b, String str, C6556h c6556h, InterfaceC0064e interfaceC0064e, Bundle bundle);
}
