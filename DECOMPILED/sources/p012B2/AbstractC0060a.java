package p012B2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import p314o2.AbstractC6572x;
import p314o2.C6550b;

/* JADX INFO: renamed from: B2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060a {
    public abstract AbstractC6572x getSDKVersionInfo();

    public abstract AbstractC6572x getVersionInfo();

    public abstract void initialize(Context context, InterfaceC0061b interfaceC0061b, List<C0070k> list);

    public void loadAppOpenAd(C0067h c0067h, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(C0068i c0068i, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(C0073n c0073n, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadNativeAd(C0075p c0075p, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAdMapper(C0075p c0075p, InterfaceC0063d interfaceC0063d) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(C0078s c0078s, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(C0078s c0078s, InterfaceC0063d interfaceC0063d) {
        interfaceC0063d.onFailure(new C6550b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
