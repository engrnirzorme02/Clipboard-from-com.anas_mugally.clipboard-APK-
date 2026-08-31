package p012B2;

import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbgr;
import p314o2.C6550b;

/* JADX INFO: renamed from: B2.q */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0076q {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C6550b c6550b);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, AbstractC0082w abstractC0082w);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, zzbgr zzbgrVar);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbgr zzbgrVar, String str);
}
