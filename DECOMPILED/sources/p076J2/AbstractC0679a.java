package p076J2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbwu;
import p314o2.AbstractC6560l;
import p314o2.C6555g;
import p314o2.C6571w;
import p314o2.InterfaceC6566r;
import p324p2.C6734a;
import p404z2.AbstractC7586c;

/* JADX INFO: renamed from: J2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0679a {
    public static void load(final Context context, final String str, final C6555g c6555g, final AbstractC0680b abstractC0680b) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6555g, "AdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC0680b, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: J2.d
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC0680b abstractC0680b2 = abstractC0680b;
                        C6555g c6555g2 = c6555g;
                        Context context2 = context;
                        try {
                            new zzbwu(context2, str).zza(c6555g2.m27824a(), abstractC0680b2);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbwu(context, str).zza(c6555g.m27824a(), abstractC0680b);
    }

    public abstract C6571w getResponseInfo();

    public abstract void setFullScreenContentCallback(AbstractC6560l abstractC6560l);

    public abstract void show(Activity activity, InterfaceC6566r interfaceC6566r);

    public static void load(final Context context, final String str, final C6734a c6734a, final AbstractC0680b abstractC0680b) {
        AbstractC3718s.m18084m(context, "Context cannot be null.");
        AbstractC3718s.m18084m(str, "AdUnitId cannot be null.");
        AbstractC3718s.m18084m(c6734a, "AdManagerAdRequest cannot be null.");
        AbstractC3718s.m18084m(abstractC0680b, "LoadCallback cannot be null.");
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbeg.zzk.zze()).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                AbstractC7586c.f30234b.execute(new Runnable() { // from class: J2.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AbstractC0680b abstractC0680b2 = abstractC0680b;
                        C6734a c6734a2 = c6734a;
                        Context context2 = context;
                        try {
                            new zzbwu(context2, str).zza(c6734a2.m27824a(), abstractC0680b2);
                        } catch (IllegalStateException e7) {
                            zzbtt.zza(context2).zzh(e7, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbwu(context, str).zza(c6734a.m27824a(), abstractC0680b);
    }
}
