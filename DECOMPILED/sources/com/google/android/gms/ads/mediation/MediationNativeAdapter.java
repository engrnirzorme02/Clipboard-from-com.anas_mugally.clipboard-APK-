package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import p012B2.InterfaceC0065f;
import p012B2.InterfaceC0076q;
import p012B2.InterfaceC0080u;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationNativeAdapter extends InterfaceC0065f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, InterfaceC0076q interfaceC0076q, Bundle bundle, InterfaceC0080u interfaceC0080u, Bundle bundle2);
}
