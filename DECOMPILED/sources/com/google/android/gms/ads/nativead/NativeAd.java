package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import java.util.Map;
import p314o2.C6571w;
import p314o2.InterfaceC6562n;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAd {

    /* JADX INFO: renamed from: com.google.android.gms.ads.nativead.NativeAd$a */
    public static abstract class AbstractC3516a {
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.nativead.NativeAd$b */
    public static abstract class AbstractC3517b {
        protected Map zza;

        public abstract Drawable getDrawable();
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.nativead.NativeAd$c */
    public interface InterfaceC3518c {
        void onNativeAdLoaded(NativeAd nativeAd);
    }

    /* JADX INFO: renamed from: com.google.android.gms.ads.nativead.NativeAd$d */
    public interface InterfaceC3519d {
    }

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract AbstractC3517b getIcon();

    public abstract InterfaceC6562n getMediaContent();

    public abstract String getPrice();

    public abstract C6571w getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    protected abstract void recordEvent(Bundle bundle);

    protected abstract Object zza();
}
