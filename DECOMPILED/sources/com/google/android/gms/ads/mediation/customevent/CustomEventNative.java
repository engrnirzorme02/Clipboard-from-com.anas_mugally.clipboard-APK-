package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p012B2.InterfaceC0080u;
import p020C2.InterfaceC0137a;
import p020C2.InterfaceC0140d;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventNative extends InterfaceC0137a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, InterfaceC0140d interfaceC0140d, String str, InterfaceC0080u interfaceC0080u, Bundle bundle);
}
